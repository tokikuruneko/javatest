import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int max = scan.nextInt();
		for(int i = 0;i<n-1;i++){
			int a = scan.nextInt();
			if(max < a){
				max = a;
			}
		}
		System.out.println(max);
		scan.close();
	}
}

