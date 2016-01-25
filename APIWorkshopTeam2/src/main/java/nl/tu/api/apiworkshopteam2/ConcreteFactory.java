package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class ConcreteFactory extends AbstractFactory {

	private SpecParser parser;

	public ConcreteFactory(){
            this. parser = new SpecParser();

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	/**
	 * 
	 * @param specification
	 */
	public Circuit createCicruit(String specification){
		return new CircuitAdapter(new Circuit(parser.getInputs(), parser.getOutPutGate()));
	}
}//end ConcreteFactory