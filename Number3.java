package algorithm;
import java.util.Scanner;

public class Number3 {

	public static void main(String[] args) {
		// ������� ��
		// �ڿ��� N�� �־����� �ڿ��� N�� ������� ���� ���İ� �Բ� ����ϴ� ���α׷��� �ۼ��ϼ���.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�ڿ��� n�� �Է��ϼ���:");
		int n = stdIn.nextInt();
		System.out.print("1");
		int sum =1;
		for(int i = 2; i<n; i++) {
			if(n%i==0) {
				sum+=i;
				System.out.print(" + "+i);
			}
		}
		System.out.print(" = "+sum);

	}

}
