package algorithm;
import java.util.Scanner;

public class Number56 {
	
	public static void DFS(int n){
		if(n<=1) {
			System.out.print("1 ");
		}
		else {
			System.out.print(n+" ");
			DFS(n-1);
		}
	}
	
	public static void main(String[] args) {
		// 56. ����Լ� �м�
		// �ڿ��� N�� �־����� ����Լ��� ����Ͽ� 1���� N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n�� ���� �Է��Ͻÿ�.:");
		int n = stdIn.nextInt();
		DFS(n);
	}

}
