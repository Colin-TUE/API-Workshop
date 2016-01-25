package nl.tu.api.apiworkshopteam2;

import java.util.Map;


/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class Circuit {

	private Gate gate1;
        private Gate gate2;
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
            Gate gate3 = new And(gate1, gate2);
        }
        
        protected void createOR()
        {
            Gate gate3 = new Or(gate1, gate2);
        }
        
        protected void createNOT()
        {
            Gate gate3 = new Not(gate1);
        }
        
        protected void createInput()
        {
            Gate input = new Input(false);
        }
}//end Circuit