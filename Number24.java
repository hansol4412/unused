package algorithm;
import java.util.Scanner;
public class Number24 {

	public static void main(String[] args) {
		// 24. Jolly Jumpers
		// N���� ������ �̷���� ������ ���� ���� �����ϴ� ���� ���� 1���� N-1����  ���� ��� ������ YES, �ƴϸ� NO
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� ���ڸ� �Է��� ���ΰ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}
		int[] b = new int[n]; 
		/* ���� n�� 5��� b[1]���� b[4]���� �ʿ�, int[] b = new int[n-1]�̸�  int[] b = new int[4]�̰�
		  b[3]���� �������� �ʾ� �����߻� */
		int minus;
		int yn =1;
		for(int j=0; j<n-1; j++) {
			minus=Math.abs(a[j]-a[j+1]);	
			System.out.println(minus);
			if(minus>0 && minus<n && b[minus]==0) b[minus]=1;
			else {
				yn = 0;
				break;
			}
		}
		
		if(yn==1) System.out.println("YES");
		else System.out.println("NO");
		

	}

}
