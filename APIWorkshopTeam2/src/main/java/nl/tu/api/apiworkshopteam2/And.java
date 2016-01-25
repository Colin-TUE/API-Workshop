package nl.tu.api.apiworkshopteam2;
/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class And extends BiGate {
       
        private boolean input1;
        private boolean input2;
        
	protected And(boolean input1, boolean input2){
            this.input1 = input1;
            this.input2 = input2;
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	public boolean evaluate(){
		return this.input1 && this.input2;
	}
}//end And