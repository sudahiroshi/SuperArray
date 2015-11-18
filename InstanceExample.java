/**
 * 内部データを持つクラス
 */
class InstanceExample {
    int data = 0;

    /**
     * 内部データに数値を加えるメソッド
     * @param number 加える数
     */
    void add( int number ) {
        this.data += number;
    }

    /**
     * 内部データの値を返すメソッド
     * @return 内部データ
     */
    public int getData() {
        return this.data;
    }

    /**
     * 内部データを変更するメソッド
     * @param data 新たな内部データ
     */
    public void setData( int data ) {
        this.data = data;
    }

    /** mainメソッド */
    public static void main( String[] args ) {

		// InstanceExampleのインスタンス生成
        InstanceExample x = new InstanceExample();
		
		// コマンドラインパラメータを数値に変換して足す
        for( int i=0; i<args.length; i++ ) {
            x.add( Integer.parseInt( args[i] ) );
        }

		// 合計値はgetDataメソッドで得る
        int goukei = x.getData();
        System.out.println( "合計は" + goukei );
    }
}
