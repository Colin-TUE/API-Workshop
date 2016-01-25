package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class ConcreteFactory extends AbstractFactory {

	private SpecParser parser;

	public ConcreteFactory(){

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param specification
	 */
	public Circuit createCicruit(String specification){
		return null;
	}
}//end ConcreteFactory