package algorithm;
import java.util.Scanner;

public class Number4 {

	public static void main(String[] args) {
		// 4. ��������
		// n���� ���̰� �ֽ��ϴ�. �� n���� ��� �� ���� ���� ���̰� ���� ���� ���� �� �� �ϱ��? �ִ� ���� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner stdIn = new Scanner(System.in);
		int n;
		int max = 0;
		int min = 100;
		int age;
		System.out.print("��� ���� �Է��Ͻÿ�:");
		n = stdIn.nextInt();
		for(int i = 1; i<=n; i++) {
			System.out.print("���̸� �Է��Ͻÿ�:");
			age = stdIn.nextInt();
			if(age>max) max= age;
			if(age<min) min = age;
		}
		System.out.println("���� ������ �ִ�� "+ (max-min) +"�Դϴ�");
		

	}

}
