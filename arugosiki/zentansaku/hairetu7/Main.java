import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int a[] = new int[n];
		for(int i =0;i<n;i++){
			a[i] = scan.nextInt();
			
		}
		int max = a[0];
		int ans = 0;
		for(int i = 0;i<n-1;i++){
			if(max < a[i]){
				max = a[i];
				ans = i;
			}
		}
		System.out.println(ans);
		scan.close();
	}
}

