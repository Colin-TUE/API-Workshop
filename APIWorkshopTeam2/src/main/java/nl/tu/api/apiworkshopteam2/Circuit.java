package nl.tu.api.apiworkshopteam2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;



/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class Circuit {

	private Gate output;
	private Map<String, Gate> inputs;

	protected Circuit(Map map){
            inputs = map;
	}

	public void finalize() throws Throwable {

	}
        
	public boolean evaluate(){
		return false;
	}

	/**
	 * 
	 * @param value
	 * @param name
	 */
	public void setInput(Boolean value, String name) throws IllegalArgumentException{
               Gate key = inputs.get(name);
               if (key != null)
               {
                   key.set(value);
               }
	}
}//end Circuit