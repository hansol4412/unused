package algorithm;
import java.util.Scanner;
public class Number50 {

	public static void main(String[] args) {
		//50. ���� ����
		/* ���� �������� ���� �ϻ��ϱ�� �ߴ�. ��ü ������ ������ ������ ������ �����ִµ� ������ ������ ������ �����Ѵ�.
		 ���� �ϻ� ���� ���� ���ο� ���ΰ� �������� ������ ������ �ִ밡 �Ǵ� ���� �����Ͽ� ������ ������ ������ ����϶�.*/
		Scanner stdIn = new Scanner(System.in);  
		System.out.print("��ü ������ ����:");
		int tc = stdIn.nextInt();
		System.out.print("��ü ������ ����:");
		int tr = stdIn.nextInt();
		int[][] a = new int[tc][tr];
		for(int i =0; i<tc; i++) {
			for(int j =0; j<tr; j++) {
				a[i][j]=stdIn.nextInt();
			}
		}
		
		System.out.print("�ϻ� ���� ������ ����:");
		int hc = stdIn.nextInt();
		System.out.print("�ϻ� ���� ������ ����:");
		int hr = stdIn.nextInt();
		
		int max=0;
		int sum;
		
		for(int i =0; i<=tc-hc; i++) {
			for(int j =0; j<=tr-hr; j++) {
				sum=0;
				for(int c =i; c<=i+hc-1; c++) {
					for(int r=j; r<=j+hr-1; r++) {
						sum+=a[c][r];
					}
					
				}
				if(sum>max) max=sum;
			}
		}
	
		System.out.println("�ϻ� ���� ���� ������ ���� ������? "+max);
		
		
	}

}
