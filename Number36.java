package algorithm;
import java.util.Scanner;
public class Number36 {

	public static void main(String[] args) {
		// 36. ��������
		// N���� ���ڰ� �ԷµǸ� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("�Է��� ���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
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

		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
