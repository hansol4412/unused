package algorithm;
import java.util.Scanner;
public class Number41_1 {

	public static void main(String[] args) {
		// 41_1. ���ӵ� �ڿ����� ��
		// ���� ������ �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��մϴ�.
			Scanner stdIn = new Scanner(System.in);
			System.out.print("���� ������ �Է��ϼ���:");
			int n = stdIn.nextInt();
			int temp = n;
			int cnt=0;
			int a=2;
			n--; 
				while(n>0) {
					n=n-a;
					if(n%a==0) {
						for(int i=1; i<a; i++) {
							System.out.print((n/a)+i +" + ");
						}
						System.out.println((n/a)+a + " = " +temp);
						cnt++;
					}
					a++;
				}

				System.out.println(cnt+"��");

	}

}
