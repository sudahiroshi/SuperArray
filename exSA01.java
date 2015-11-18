/**
* SuperArrayのサンプルプログラム
* @author 須田
* @version 1.0
*/
public class exSA01 {
	/** main */
	public static void main( String[] args ) {
		SuperArray sa1 = new SuperArray();
		SuperArray sa2 = new SuperArray();

		sa1.data[0] = 5;
		sa2.data[0] = 3;
		System.out.println( "sa1.data[0] = " + sa1.data[0] );
		System.out.println( "sa2.data[0] = " + sa2.data[0] );
	}
}
