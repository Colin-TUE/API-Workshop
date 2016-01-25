package nl.tu.api.apiworkshopteam2;

import java.util.Map;


/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class Circuit {

	private Gate output1;
        private Gate output2;
	private Map<String, Gate> inputs;

	protected Circuit(Map map)
        {
            inputs = map;
	}

	protected void finalize() throws Throwable 
        {

	}
        
	protected boolean evaluate()
        {
		return false;
	}

	/**
	 * 
	 * @param value
	 * @param name
	 */
	protected void setInput(Boolean value, String name) throws IllegalArgumentException
        {
               Gate key = inputs.get(name);
               if (key != null)
               {
                   key.set(value);
               }
               else
               {
                   throw new IllegalArgumentException("Variable is not valid!");
               }
	}
        
        protected void createAnd()
        {
            Gate output3 = new And(output1, output2);
        }
        
        protected void createOR()
        {
            Gate output3 = new Or(output1, output2);
        }
        
        protected void createNOT()
        {
            Gate output3 = new Not(output1);
        }
        
        protected void createInput()
        {
            Gate input = new Input(false);
        }
}//end Circuit