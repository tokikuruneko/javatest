public class Main{
	public static void main(String[] args){
		char[] c;
		c = new char[3];
		String str[] ={"welcome","to","java"};
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'D';

		System.out.println("str size" + str.length);
		for(int i = 0;i<3;i++){
			System.out.println("c[" + i + "] = " + c[i]);
		}
		int [] in = new int[3];
		in[0] = 20;
		in[1] = 30;
		in[2] = 40;
		for(int i = 0;i<3;i++){
			System.out.println("in[" + i + "] = " + in[i]);
		}

		int[][] array;
		array = new int[3][3];
		array[0][0] = 4;
		array[2][2] = 2;

		int[][] array1 = {{10,20,30},
				  {40,50,60,70,80,90},
				  {100,200}};

	}
}
