package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
public abstract class AbstractFactory {

	public AbstractFactory(){

	}

	public void finalize() throws Throwable {

	}
	/**
	 * 
	 * @param specification
	 */
	public Circuit createCicruit(String specification){
		return null;
	}
}//end AbstractFactory