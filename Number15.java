package algorithm;
import java.util.Scanner;
public class Number15 {

	public static void main(String[] args) {
		// 15. �Ҽ��� ����
		// �ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		System.out.print("���� �Է��ϼ���:");
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int cnt=0;
		int flag;
		
		for(int i=2; i<=n; i++) {
			 flag =1;
			 for(int j=2; j*j<=i; j++) {
			//for(int j =2; j<i; j++ ) {
				if(i%j==0) {
					flag=0;
					break;
				}
			}
			if(flag==1) cnt++;
		}
		
		System.out.println(cnt);
	}

}
