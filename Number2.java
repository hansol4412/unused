package algorithm;
import java.util.Scanner;
public class Number2 {

	public static void main(String[] args) {
		// 2. �ڿ����� ��
		// �ڿ��� A, B�� �־����� A���� B������ ���� ���İ� �Բ� ����ϼ���.
				
				Scanner stdIn = new Scanner(System.in);
				System.out.print("A�� ���� �Է��Ͻÿ�:");
				int a = stdIn.nextInt();
				System.out.print("B�� ���� �Է��Ͻÿ�:");
				int b = stdIn.nextInt();
				int sum = 0;
				for(int i = a; i<b; i++) {
					System.out.print(i+" + ");
					sum+= i;
				}
				sum+= b;
				System.out.print(b+" = "+ sum);
			}

}
