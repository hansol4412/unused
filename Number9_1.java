package algorithm;
import java.util.Scanner;
public class Number9_1 {

	public static void main(String[] args) {
		//9. ����� ���
		// �ڿ��� N�� �ԷµǸ� 1���� N������ �� ���ڿ��� ����� ������ ����ϴ� ���α׷��� ����ϼ���.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int[] a = new int[100];
		for(int i =1; i<=n; i++) {
			//i�� ����� ���� ex)2�� ����̸� 2,4,6,8...�� ��� ����� ���� �ϳ��� ������Ų��.
			for(int j=i; j<=n;j=j+i) {
				a[j]++;
			}
		}
		
		for(int t = 1; t<=n; t++) {
			System.out.println(t+"�� ����� ���� " +a[t]);
		}

	}

}
