 /**
 * 追加されたコンストラクタを試すプログラム
 */
 public class exSA02 {
   public static void main( String[] args ) {
     SuperArray sa = new SuperArray( 30 );
     for( i=0; i<30; i++ ) {
       sa.push( i );
     }
    System.out.println( sa );
   }
 }
