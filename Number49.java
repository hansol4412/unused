package algorithm;
import java.util.Scanner;
public class Number49 {

	public static void main(String[] args) {
		// 49. ����� �ִ�
		// ����� ���鿡�� �� �ܸ�� ������ ���鿡�� �� �ܸ��� �ְ� �ִ� ��ϰ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("N*N�� �������� N�� ���� �Է��ϼ���.");
		int n = stdIn.nextInt();
		int[][] a = new int[2][n];
		int[][] b = new int[n][n];
		System.out.println("������ ���");
		for(int i =0; i<n; i++) {
			a[0][i]=stdIn.nextInt();
		}
		System.out.println("������ ������ ���");
		for(int i =0; i<n; i++) {
			a[1][i]=stdIn.nextInt();
		}
		
		for(int i =0; i<n; i++) {
			int temp = a[0][i];
			for(int j=0; j<n; j++) {
				b[j][i] = temp;
			}
		}
		
		
		
		for(int i=0; i<n; i++) {
			int temp2 = a[1][i];
			for(int j=0; j<n; j++) {
				if(temp2<b[n-i-1][j]) {
					b[n-i-1][j]=temp2;
				}
			}
			
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(b[i][j]);
			}
			System.out.println();
		}
		
		int sum=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				sum+=b[i][j];
			}
		}
		System.out.println("����� �ִ� ������? " + sum);
	}

}
