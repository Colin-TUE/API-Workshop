package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class Input extends Gate {

	private boolean value;

	protected Input(boolean value){
            this.value = value;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean evaluate(){
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	public void set(boolean value){
            
	}
}//end Input