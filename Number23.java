package algorithm;
import java.util.Scanner;
public class Number23 {

	public static void main(String[] args) {
		// 23. ���� �κ� ��������
		//n���� ���ڰ� ������ ������ �־����ϴ�. �� ���� �� ���������� �����ϴ� �κ� ���� �ִ� ���̸� ���� ����Ͻÿ�.
		// ���� ���� ���� �����ϴ� ������ �����Ѵ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��� ���ΰ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}
		int cnt=0;
		int max=0;
		int cmax=0;
		for(int i =0; i<n; i++) {
			if(a[i]>=max) {
				max=a[i];
				cnt++;
				if(cmax<cnt) cmax=cnt;
				
			}
			else {
				max=a[i];
				cnt =1;
			}
		}
		
		System.out.println("���� ������ �ִ� ���̴� "+cmax);
		
	}

}
