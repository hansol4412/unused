package algorithm;
import java.util.Scanner;
public class Number11 {

	public static void main(String[] args) {
		// 11. ������ �� ����(small)
		// �ڿ��� N�� �ԷµǸ� 1���� N������ �ڿ����� ���̿� ���� �� �� ���ڴ� ��� ���̴��� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� 1���� 15������ 1,2,3,4,5,6,7,8,9,1,0,1,1,1,2,1,3,1,4,1,5�� 21���� ���ڰ� ������.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int cnt=0;
		for(int i=1; i<=n; i++) {
			double temp=i;
			while(temp>=1) {
				cnt++;
				temp=temp/10;	
			}
		}
		System.out.println("���� ������ �� ������ "+cnt+"�� �Դϴ�.");
	}

}
