package algorithm;
import java.util.Scanner;

public class Number1 {

	public static void main(String[] args) {
		// 1. 1���� N���� M�� ��� ��
		// �ڿ��� N�� �ԷµǸ� M�� ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("N�� ���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		System.out.print("M�� ���� �Է��Ͻÿ�:");
		int m = stdIn.nextInt();
		int sum = 0;
		for(int i = 1; i<=n; i++) {
			if(i%m == 0 ) {
				sum+= i;
			}
			
		}
		System.out.println(sum);
		

	}

}
