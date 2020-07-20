package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number40_1 {

	public static void main(String[] args) {
		// 40_1. ������ (������Ʈ �˰���)
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
		Arrays.sort(a);
		
		
		System.out.print("�ι�° �迭�� ũ�⸦ �Է��ϼ���.:");
		int m = stdIn.nextInt();
		int[] b = new int[m];
		for(int i=0; i<m; i++) {
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		Arrays.sort(b);
		
		int[] c = new int[n-m>0?m:n];
		
		int p1=0, p2=0, p3=0;
		
		while(p1<n && p2<m) {
			if(a[p1]==b[p2]) {
				c[p3++] = a[p1++];
				p2++;
			}
			else if(a[p1]<b[p2]){
				p1++;
			}
			else {
				p2++;
			}
		}
		
		for(int i=0; i<p3; i++) {
			System.out.print(c[i]+" ");
		}
		
		
		

	}

}
