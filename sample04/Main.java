public class Main{
	public static void main(String[] args){
		//リテラル：ソースコードに直接書き込んだ値またはその表記
		//
		//整数リテラル
		System.out.println(255);	//10進数
		System.out.println(0b11111111);	//2進数
		System.out.println(0377);	//8進数
		System.out.println(0xff);	//16進数

		//浮動小数点リテラル
		System.out.println(12.33);	//浮動小数点
		System.out.println(3e4);	//指数 (3.0 * 10^4)

		//文字リテラル　Unicode
		System.out.println('A');	//1文字
		System.out.println('\u3012');	//Unicode
		System.out.println("hello");	//文字列

		//論理値リテラル
		System.out.println(true);	//論理値

		//＿（アンダースコア）がある数値リテラル
		//桁数の大きな数値リテラルの可読性を高めるもの。いわゆるカンマ
		//利用時のルール
		//・リテラルの先頭、末尾には使用できない
		//・浮動小数点リテラルにある小数点の前後には使用できない
		//・float値を表現するF（もしくはf）および、long値を表現するL(もしくはl)の前には使用できない
		//・１６進数で使用する0xと２進数で使用する0bの途中及び前後には使用できない
		
		//float x1 = 3_.1415F;		//NG
		//float x2 = 3._1415F;		//NG
		//long x3 = 999_99_9999_L:	//NG
		//int x4 = _52;			//NG
		int x5 = 5_2;			//OK
		//int x6 = 52_;			//NG
		int x7 = 5_____2;		//OK
		//int x8 = 0_x52;		//NG
		//int x9 = 0x_52;		//NG
		int x10 = 0x5_2;		//OK
		int x11 = 0_52;			//OK
	}
}

