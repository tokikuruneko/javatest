import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int cnt = 0;
		boolean f = false;
		for(int i = 0;i<n;i++){
			int a = scan.nextInt();
			if(a > 0){
				cnt++;
			}
		}
		System.out.println(cnt);
		scan.close();
	}
}

