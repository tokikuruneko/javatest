import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int v = scan.nextInt();
		int cnt = -1;
		boolean f = false;
		for(int i = 0;i<n;i++){
			int a = scan.nextInt();
			if(a == v){
				cnt = i;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}

