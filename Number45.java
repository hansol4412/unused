package algorithm;
import java.util.Scanner;
public class Number45 {

	public static void main(String[] args) {
		// 45. ���� ���ϱ�
		/* N���� ���ڰ� �ð� �������� ���׶��� �ɰ� 1�� ���ں��� 1���� �����ϸ� ��ȣ�� ��ģ��.
		     �� ���ڰ� Ư�� ���� M�� ��ġ�� �� ���ڴ� ���ָ� ���Ϸ� ���µ��� ���ܵȴ�. ���������� ��� ���� ������ ��ȣ�� ����϶� */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("���� ���� �Է��Ͻÿ�:");
		 int n = stdIn.nextInt();
		System.out.print("Ư�� ���� �Է��Ͻÿ�.:");
		int m = stdIn.nextInt();
		int[] a = new int[n+1];
		
		int point = 1;
		int cnt =0;
		int last =0;
		
		while(true) {
			
			if(a[point]==0) {
				cnt++;
				if(cnt==m) {
					a[point]=1;
					cnt=0;
					last++;
				}
			}
			point++;
			
			if(point>n) {
				point = 1;
			}
			if(last>=n-1) {
				break;
			}
		}
		
		
		
		for(int i=1; i<=n; i++) {
			if(a[i]==0) {
				System.out.println(i);
			}
		}
	}

}
