package algorithm;
import java.util.Scanner;
public class Number18 {

	public static void main(String[] args) {
		// 18. ��������
		/*����Ʈ�� �� ������ ����ġ�� m���� ������ ���� ȣ���� ���� �溸���� ������ ����Ϳ� �︰��
		 �� ������ n�� ������ �ǽð� ����ġ�� �־����� �ִ� �������� �溸���� �︰ �ð��� �����̼�.
		 �溸���� ������ -1�� ��µȴ�.
		 */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� �� ���� ������ �� ���ΰ�(n��):");
		int n= stdIn.nextInt();
		int[] a = new int[n];
		System.out.print("�溸�� ����ġ(m):");
		int m = stdIn.nextInt();
		int cnt=0;
		int max=0;
		for(int i = 0; i<n; i++) {
			a[i] = stdIn.nextInt();
			if(a[i]>m) {
				cnt++;
				if(cnt>max) {
					max=cnt;
				}
			}
			else {
				cnt =0;
			}
		}
		
		if(max>0)System.out.println(max);
		else System.out.println(-1);
		
		
		

	}

}
