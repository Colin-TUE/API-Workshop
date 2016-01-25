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
        private Gate output3;
	private Map<String, Gate> inputs;

	protected Circuit(Map map)
        {
            inputs = map;
	}            
        
	protected double evaluate()
        {
		return output1.evaluate();
	}

	/**
	 * 
	 * @param value
	 * @param name
	 */
	protected void setInput(double value, String name) throws IllegalArgumentException
        {
            Gate key = inputs.get(name);
            if (key != null && value >= 0.0 && value <= 1.0)
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
            output3 = new And(output1, output2);
        }
        
        protected void createOR()
        {
            output3 = new Or(output1, output2);
        }
        
        protected void createNOT()
        {
            output3 = new Not(output1);
        }
        
        protected void createInput(String name)
        {
            Gate key = inputs.get(name);
            if (key == null)
            {
                Gate input = new Input(0.00);
                output3 = input;
                inputs.put(name, input);
            }
            else
            {
               output3 = key;
            }
        }
        
        protected void reAssign(int ref)
        {
            switch (ref) {
                case 1:
                    output1 = output3;
                    break;
                case 2:
                    output2 = output3;
                    break;
                default:
                    break;
            }
        }
}//end Circuit