package algorithm;
import java.util.Scanner;
public class Number46 {

	public static void main(String[] args) {
		// 46. ��Ƽ �½�ŷ
		/* ��Ƽ�½�ŷ�� ������ ��ǻ�ʹ� 1�� �۾����� ������� 1�ʾ� �۾��Ѵ�.
		 * �۾� ���� N���� �׿� ���� �۾� �ð��� �Է��� �� M�� �� ������ �Դ�. ���� �� � �۾��� �ؾ��ϴ� �� ����Ͻÿ�.
		     �� �̻� �۾��ؾ� �� �۾��� ������ -1�� ����Ͻÿ�. */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("�۾��� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		int sum=0;
		for(int i=1; i<=n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
			sum+=a[i];
		}
		System.out.print("�� �� �Ŀ� ������ �Ͼ�°�?:");
		int m = stdIn.nextInt();
		int cnt=0;
		if(m>=sum) {
			System.out.println("-1");
		}
		
		//���� ���� �� �۾�
		int p=0;
		while(true) {
			p++;
			if(p>n) p=1;
			if(a[p]==0) continue;
			a[p]--;
			
			cnt++;
			if(cnt==m) break;
		}
		
		//���� �� �� �۾� ã��
		while(true) {
			p++;
			if(p>n)p=1;
			if(a[p]!=0) {
				System.out.println(p);
				break;
			}
		}
		
		
		
		
	}

}
	