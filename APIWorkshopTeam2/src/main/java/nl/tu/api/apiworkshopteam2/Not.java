package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class Not extends UniGate {

	protected Not(Gate input){
            super(input);

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean evaluate(){
		return !input;
	}
}//end Not