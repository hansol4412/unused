package algorithm;
import java.util.Scanner;
public class Number17 {

	public static void main(String[] args) {
		// 17. ������ ����
		/* �л��� n�� �ֽ��ϴ�. �������� �� �л��鿡�� ���ڰ� ���� ī�带 �ְ�, �л����� 1���� �ڱ� ī����� ���� ���մϴ�.
		 �л����� �Է��� ���� ������ YES Ʋ���� NO�� ����Ͻÿ� */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("�������� �� ���ڸ� �Է��Ͽ�:");
			int teacher = stdIn.nextInt();
			int sum=0;
			for(int j=1; j<=teacher; j++) {
				sum = sum+j;
			}
			System.out.print("�л��� ���� ���� �Է��Ͻÿ�:");
			int student = stdIn.nextInt();
			
			if(sum==student)System.out.println("YES");
			else System.out.println("No");
			
		}

	}

}
