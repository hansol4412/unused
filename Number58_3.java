package algorithm;
import java.util.Scanner;
public class Number58_3 {

	public static void DFS(int n, int x) {
		if(x>n) return;
		else {
			DFS(n,x*2);
			DFS(n,x*2+1);
			System.out.print(x);
		}
	}

	public static void main(String[] args) {
		// 58_3. ����Ʈ�� ���̿켱Ʈ��(DFS)
		// ���ּ�ȸ ���
		System.out.print("����� ������ �Է��ϼ���:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int x = n;
		DFS(n,1);
	}

}
