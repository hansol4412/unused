package algorithm;
import java.util.Scanner;
public class Number34 {

	public static void main(String[] args) {
		// 34. ��������
		// N���� ���ڰ� �ԷµǸ� ������������ �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("�Է��� ���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		
		for(int j=0; j<n-1; j++) {
			for(int i=0; i<n-j-1; i++) {
				if(a[i]>a[i+1]) {
					int temp=a[i];
					a[i]=a[i+1];
					a[i+1]=temp;
				}
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
	
			

	}

}
