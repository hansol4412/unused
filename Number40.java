package algorithm;
import java.util.Scanner;
public class Number40 {

	public static void main(String[] args) {
		// 40. ������ (������Ʈ �˰���)
		// �� ���� A, B�� �־�����  �� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// �������� ������������ �����Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("ù��° �迭�� ũ�⸦ �Է��ϼ���.:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("�ι�° �迭�� ũ�⸦ �Է��ϼ���.:");
		int m = stdIn.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		
		int[] c = new int[n-m>0?m:n];
		int p3=0;
		
		for(int i=0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(a[i]==b[j]) {
					c[p3]=a[i];
					p3++;
				}
			}
		}
		
		for(int i=0; i<p3-1; i++) {
			int idx=i;
			for(int j =i+1; j<p3; j++ ) {
				if(c[j]<c[idx]) idx=j;
			}
			int temp = c[i];
			c[i]=c[idx];
			c[idx]=temp;
		}
		
		for(int i=0; i<p3; i++) {
			System.out.print(c[i]+" ");
		}
	}

}
