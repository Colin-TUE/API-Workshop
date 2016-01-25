package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:42
 */
abstract class UniGate extends Gate {

	protected Gate input;

	public UniGate(Gate input){
            this.input = input;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end UniGate