package algorithm;
import java.util.Scanner;
public class Number32 {

	public static void main(String[] args) {
		// 32. ��������
		// N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// ���� ���� ���� ã�� �տ��� ���� �����Ѵ�. 
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("�Է��� ���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		int idx;
		for(int i =0; i<n; i++) {
			idx=i;
			for(int j=i+1; j<n; j++ ) {
				if(a[idx]>a[j]) idx=j;
			}
			int temp = a[i];
			a[i] = a[idx];
			a[idx] = temp;
		}
		
		for(int i=0; i<n; i++) {
			System.out.print(a[i]+" ");
		}
		}

}
