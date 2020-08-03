package algorithm;
import java.util.Scanner;
public class Number48 {

	public static void main(String[] args) {
		// 48. �� ���� ��հ� ���� ����� ��
		/* 9X9 �����ǿ� ������ 81���� �ڿ����� �־��� ��, �� ���� ����� ���ϰ� �� ��հ� ���� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
		     ����� �Ҽ��� ù �� �ڸ����� �ݿø��մϴ�. ����� ���� �� �� �̸� �� �� ū ���� ����ϼ���.
		 */
		Scanner stdIn = new Scanner(System.in);    
		int a[][] = new int [9][9];
		for(int i=0; i<9; i++) {
			int sum=0;
			for(int j=0; j<9; j++) {
				System.out.println("a["+i+"]["+j+"]:");
				a[i][j]= stdIn.nextInt();
				sum+=a[i][j];
			}
			int avg = (int)Math.round(sum/9.0);
			int min= 100;
			int store = -100;
			for(int j=0; j<9; j++) {
				if(Math.abs(avg-a[i][j])<min) {
					store = a[i][j];
					min = Math.abs(avg-a[i][j]);
				}
				else if(Math.abs(avg-a[i][j])==min) {
					if(a[i][j]>=store) store=a[i][j];
					min = Math.abs(avg-a[i][j]);
				}
			}
			System.out.println("���: "+avg+" ��հ� ����� ��: "+store);
		}
		
		
	}

}
