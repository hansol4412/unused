package algorithm;
import java.util.Scanner;
public class Number60 {
	static int n;
	static int total;
	static int flag=0;
	public static void DFS(int[] a, int L, int sum) {
		if(sum>total/2) return;
		if(flag==1) return;
		if(L>n) {
			if(sum==total-sum) flag=1;
		}
		else {
			DFS(a,L+1, sum+a[L]);
			DFS(a,L+1,sum);
		}
		
	}
	public static void main(String[] args) {
		//60. ���� ���� �κ����� (DFS)
		/* N���� ���ҷ� ������ �ڿ��� ������ �־�����, �� ������ �� ���� �κ��������� �������� ��
		 �� �κ������� ������ ���� ���� ���� ��찡 �����ϸ� YES�� ����ϰ�, �׷��� ������ NO�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ���� �Է��Ͻÿ�:");
		n = stdIn.nextInt();
		total=0;
		int a[] = new int[n+1];
		for(int i =1; i<=n; i++) {
			System.out.print(i+"��° ���Ҹ� �Է��Ͻÿ�:");
			a[i]=stdIn.nextInt();
			total += a[i];
		}
		DFS(a,1,0);
		if(flag==1) System.out.println("YES");
		else System.out.println("NO");
	}

}
