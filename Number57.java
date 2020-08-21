package algorithm;
import java.util.Scanner;
public class Number57 {
	public static void DFS(int n) {
		if(n<=1) {
			System.out.print(n);
		}
		else {
			DFS(n/2);
			System.out.print(n%2);
			
		}
	}
	public static void main(String[] args) {
		// 57. ����Լ�  ������ ���
		// 10���� N�� �ԷµǸ� ����Լ��� ����Ͽ� 2������ ��ȯ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("10������ ���� �Է��Ͻÿ�.:");
		int n = stdIn.nextInt();
		DFS(n);
	}

}
