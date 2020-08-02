package algorithm;
import java.util.Scanner;
public class Number47 {

	public static void main(String[] args) {
		// 47. ���츮
		/* ���� ������ N*N �����ǿ� �־����ϴ�. �� ���ڿ��� �� ������ ���̰� ���� �ֽ��ϴ�.
		     �� �������� ���� �� �ڽ��� �����¿� ���ں��� ū ���ڴ� ���츮 �����Դϴ�. ���츮�� �� �� �ִ��� ����Ͻÿ� */
		
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("N*N�� �������� N�� ���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		int[][] a = new int[n+2][n+2];
		for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.println("a["+i+"]["+j+"]:");
				a[i][j]= stdIn.nextInt();
			}
		}
		
		for(int i =0; i<=n+1; i++) {
			for(int j=0; j<=n+1; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		
		int[] dx = { -1, 0, 1, 0};
		int[] dy = { 0, -1, 0, 1};
		int cnt = 0;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int flag =0;
				for(int k=0; k<4; k++) {
					if(a[i][j]<=a[i+dx[k]][j+dy[k]]) {
						flag=1;
						break;
					}
				}
				if(flag==0) cnt++;
			}
		}
		System.out.println("���츮�� "+cnt+"��");
	}

}
