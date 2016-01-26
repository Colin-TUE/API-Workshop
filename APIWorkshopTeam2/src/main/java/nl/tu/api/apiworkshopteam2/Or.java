package nl.tu.api.apiworkshopteam2;

/**
 * @author CLambrec
 * @version 1.0
 * @created 25-Jan-2016 12:47:41
 */
class Or extends BiGate {

    public Or(Gate input1, Gate input2) {
        super(input1, input2);
    }

	public void finalize() throws Throwable {
		super.finalize();
	}
    public double evaluate() {
        return 1 - (1 - input1.evaluate()) * (1 - input2.evaluate());
    }
}//end Or
