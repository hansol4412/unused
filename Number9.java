package algorithm;
import java.util.Scanner;
public class Number9 {

	public static void main(String[] args) {
		//9. ����� ���
		// �ڿ��� N�� �ԷµǸ� 1���� N������ �� ���ڿ��� ����� ������ ����ϴ� ���α׷��� ����ϼ���.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int[] a = new int[100];
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n;j++) {
				if(i%j==0) a[i]++;
			}
		}
		
		for(int t = 1; t<=n; t++) {
			System.out.println(t+"�� ����� ���� " +a[t]);
		}

	}

}
