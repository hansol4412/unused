package algorithm;
import java.util.Scanner;
public class Number51 {

	public static void main(String[] args) {
		//51. ���� ���� (large)
		/* ���� �������� ���� �ϻ��ϱ�� �ߴ�. ��ü ������ ������ ������ ������ �����ִµ� ������ ������ ������ �����Ѵ�.
		 ���� �ϻ� ���� ���� ���ο� ���ΰ� �������� ������ ������ �ִ밡 �Ǵ� ���� �����Ͽ� ������ ������ ������ ����϶�.*/
		
		Scanner stdIn = new Scanner(System.in);  
		System.out.print("��ü ������ ����:");
		int tc = stdIn.nextInt();
		System.out.print("��ü ������ ����:");
		int tr = stdIn.nextInt();
		int[][] a = new int[tc+1][tr+1];
		int[][] dy = new int[tc+1][tr+1];
		for(int i =1; i<=tc; i++) {
			for(int j =1; j<=tr; j++) {
				a[i][j]=stdIn.nextInt();
				dy[i][j]= dy[i-1][j] + dy[i][j-1] - dy[i-1][j-1] + a[i][j];
			}
		}
		
		System.out.print("�ϻ� ���� ������ ����:");
		int hc = stdIn.nextInt();
		System.out.print("�ϻ� ���� ������ ����:");
		int hr = stdIn.nextInt();
		
		int max=0;
		int sum;
		
		for(int i =hc; i<=tc; i++) {
			sum=0;
			for(int j =hr; j<=tr; j++) {
				sum= dy[i][j] - dy[i-hc][j] - dy[i][j-hr] + dy[i-hc][j-hr];
				if(sum>max) max=sum;
			}
			
		}
		
		System.out.println("�ϻ� ���� ���� ������ ���� ������? "+max);
	}
}
