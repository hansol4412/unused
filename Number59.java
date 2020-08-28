package algorithm;
import java.util.Scanner;
public class Number59 {
	public static void DFS(int x, int[] a, int n) {
		if(x>n) {
			for(int i =1; i<=n; i++) {
				if(a[i]==1) System.out.print(i+ " ");
			}
			System.out.println();
		}
		else {
			a[x]=1;
			DFS(x+1, a, n);
			a[x]=0;
			DFS(x+1, a, n);
		}
	}
	public static void main(String[] args) {
		// 59. �κ����� (DFS)
		// �ڿ��� n�� �־����� 1���� n������ ���Ҹ� ���� ������ �κ������� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ��Ϳ� �̿��� ����Ž���� �ϸ�, ����Ʈ�� ���� ��ȸ ������� ����Ѵ�. 
		System.out.print("n�� �Է��ϼ���:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[] a= new int [100];
		DFS(1, a, n);
	}

}
