package algorithm;
import java.util.Scanner;
public class Number33 {

	public static void main(String[] args) {
		// 33.3���� ������
		// N���� ���а����� �־����� �� �� 3���� ���м����� ����ϴ� ���α׷��� �ۼ��ϼ���.
		// ���� 100���� 3��, 99���� 2��, 98���� 5���̸� 1���� 3��, 2���� 2�� 3���� 3������ ��������. 
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = stdIn.nextInt();
		}
		for(int i =0; i<n; i++) {
			int idx =i;
			for(int j=i+1; j<n; j++) {
				if(a[idx]<a[j]) idx=j;
		}
			int temp = a[i];
			a[i] = a[idx];
			a[idx]= temp;
		}
		int cnt =1;
		for(int i=1; i<n; i++) {
			if(a[i-1]!=a[i]) cnt++;
			if(cnt==3) {
				System.out.println("3���� ������ " +a[i]+"�Դϴ�");
				break;
			}
			
		}
	}

}
