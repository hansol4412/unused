package algorithm;
import java.util.Scanner;
public class Number12 {

	public static void main(String[] args) {
		// 12. ������ �� ����(large)
		// �ڿ��� N�� �ԷµǸ� 1���� N������ �ڿ����� ���̿� ���� �� �� ���ڴ� ��� ���̴��� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ��� 1���� 15������ 1,2,3,4,5,6,7,8,9,1,0,1,1,1,2,1,3,1,4,1,5�� 21���� ���ڰ� ������.
				Scanner stdIn = new Scanner(System.in);
				System.out.print("���� �Է��Ͻÿ�:");
				int n = stdIn.nextInt();
				
				int sum=0;
				int cnt = 1; //�ڸ���
				int digit = 9;
				int res =0; //���� ����
				
				while(sum+digit<n) {
					sum=sum+digit;
					res=res+(digit*cnt);
					cnt++;
					digit = digit*10;
				}
				
				res= res+(n-sum)*cnt;
				System.out.println("���� ������ �� ������ "+res+"�� �Դϴ�.");

	}

}
