import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		boolean f = false;
		int flont = scan.nextInt();
		for(int i = 0;i<n-1;i++){
			int a = scan.nextInt();
			if(flont < a){
				cnt++;
			}
			flont = a;
		}
		System.out.println(cnt);
		scan.close();
	}
}

