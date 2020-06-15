package algorithm;
import java.util.Scanner;
public class Number14 {
	public static int reverse(int x) {
		int a;
		int t=0;
		while(x>0) {
			a=x%10;
			t=t*10+a;
			x=x/10;
		}
		return t;
	}
	
	public static boolean isPrime(int x) {
		if(x==1) return false;
		boolean flag= true;
				for(int j =2; j<x; j++) {
					if(x%j==0) {
						flag= false;
						break;
					}
				}
				return flag;
	}
	public static void main(String[] args) {
		// 14. ������ �Ҽ�
		// N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ ���� �Ҽ��̸� �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ������ �޼ҵ��� int reverse(int x)�� �Ҽ��� Ȯ���ϴ� �޼ҵ� boolean isPrime(int x)�� �ۼ��Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�Է��� ���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int a[] = new int[n];
		for(int i=0; i<n; i++) {
			a[i]= stdIn.nextInt();
		}
		int b[] = new int[n];
		for(int j=0; j<n; j++) {
			b[j] = reverse(a[j]);
			if(isPrime(b[j])) {
				System.out.println(b[j]);
			}
		}
		
	}

}
