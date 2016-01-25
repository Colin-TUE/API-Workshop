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
	protected boolean evaluate(){
		return this.value;
	}

	/**
	 * 
	 * @param value
	 */
	protected void set(boolean value){
            this.value = value;
	}
}//end Input