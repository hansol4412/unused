package algorithm;
import java.util.Scanner;
public class Number38_1 {

	public static void main(String[] args) {
		// 38_1. Inversion Sequence
		/* 1���� N���� ���� �� ������ ����Ͽ� �̷���� ������ ���� ��, 1���� N���� ������ �� �տ� ���� �ִ� �� �߿���
		  �ڽź��� ū �� ���� ������ ������ ǥ�h�ϴ� ���� inversion sequence��� �Ѵ�. */
		// ������ inversion sequence�� �־����� ��, ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���.
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("�Է��� ���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		int[] b = new int[n+1];
		for(int i=1; i<=n; i++) {
			a[i] = stdIn.nextInt();
		}
		int pos;
		for(int i=n; i>=1; i--) {
			pos=i;
			for(int j=1; j<=a[i]; j++) {
				b[pos]=b[pos+1];
				pos++;
			}
			b[pos]=i;
		}
		
		for(int i=1; i<=n; i++) {
			System.out.print(b[i]+" ");
		}
		
		

	}

}
