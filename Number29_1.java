package algorithm;
import java.util.Scanner;
public class Number29_1 {

	public static void main(String[] args) {
		//29-1.3`6`9����
		// n�� ���ڸ� �Է����� �� 3�� ��� �̰ų� ���ڿ� 3�� ���� �ڼ��� ġ�µ�, �ڼ��� �� ��� ġ�°�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int cnt=0;
		
		for(int i=1; i<=n; i++) { 
			int tmp=i;
			while(tmp>0) {
				if(tmp%3==0 || tmp%10==3) cnt++;
				tmp=tmp/10;
			}
		}
		
		System.out.println(cnt);
	}

}
