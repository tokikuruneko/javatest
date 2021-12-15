import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int v = scan.nextInt();
		boolean f = false;
		for(int i = 0;i<n;i++){
			int a = scan.nextInt();
			if(a == v){
				f = true;
				System.out.println("Yes");
				break;
			}
		}
		if(f == false){
			System.out.println("No");
		}

		scan.close();
	}
}

