package algorithm;
import java.util.Scanner;
public class Number38 {

	public static void main(String[] args) {
		// 38. Inversion Sequence
		/* 1���� N���� ���� �� ������ ����Ͽ� �̷���� ������ ���� ��, 1���� N���� ������ �� �տ� ���� �ִ� �� �߿���
		  �ڽź��� ū �� ���� ������ ������ ǥ�h�ϴ� ���� inversion sequence��� �Ѵ�. */
		//ex) 4 8 6 2 5 1 3 7 -> 5 3 4 0 2 1 1 0
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("�Է��� ���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
			b[i] =a[i];
		}
		
		for(int i=1; i<n; i++) {
			int temp =a[i];
			int j; 
			for(j=i-1; j>=0; j--) {
				if(a[j]>temp) a[j+1]=a[j];
				else break;
			}
			a[j+1]= temp;
		}
		
		int[] c = new int[n];
		for(int i=0; i<n; i++) {
				for(int j=0; b[j]!=a[i]; j++) {
					if(b[j]>a[i]) c[i]++;
				}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(c[i]+" ");
		}

	}

}
