package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number42 {

	public static void main(String[] args) {
		// 42. �̺а˻�
		/* ������ N���� ���ڰ� �з����� �־�����, N���� ���� ������������ ������ ���� N���� �� ��
		   �� ���� ���� key�� �־����� �̺а˻����� key�� ���ĵ� ���¿��� ���° �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ� */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("�迭�� ũ�⸦ �Է��ϼ���.:");
		int n = stdIn.nextInt();
		System.out.print("ã������ key�� �Է��ϼ���.:");
		int key = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		int left =0;
		int right =n-1;
		while(left<=right) {
		int mid = (left+right)/2;
		if(a[mid]==key) {
			System.out.println("ã�� ���� a[" + mid +"]�� �ֽ��ϴ�.");
			break;
		}
		else if(a[mid]<key) left=mid+1;
		else right= mid-1;
		}
	}

}
