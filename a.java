import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] num = new int[n];
		for (int i = 0; i < n; i++) {
			num[i]=in.nextInt();
		}
		int count=0;
		for (int i = 0; i < n; i++) {
			for (int j = n-1; j > i ; j--) {
				for (int k = i+1; k < j; k++) {
					for (int l = j-1; l > k; l--) {
						if(num[i]+num[j]==num[k]+num[l]) {
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
	}

}
