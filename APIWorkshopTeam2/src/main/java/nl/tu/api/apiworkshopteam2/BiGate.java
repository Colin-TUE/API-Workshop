package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
abstract class BiGate extends Gate {

	protected Gate input1;
	protected Gate input2;

	public BiGate(Gate input1,Gate input2){
            this.input1 = input1;
            this.input2 = input2;

	}

	public void finalize() throws Throwable {
		super.finalize();
	}
}//end BiGate