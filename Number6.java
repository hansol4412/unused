package algorithm;
import java.util.Scanner;
public class Number6 {

	public static void main(String[] args) {
		// 6. ���ڸ� ����
		/* ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�
		   ������� �ڿ����� �� �ڿ����� ����� ������ ����Ͻÿ� */
		
		Scanner stdIn = new Scanner(System.in);
		char[] a = new char[10];
		int res = 0;
		int cnt = 0;
		System.out.print("���ڿ� ���ڰ� ���� 10���� ���ڸ� �Է��ϼ���:");
		for(int i = 0; i<a.length; i++) {
			a[i] = stdIn.next().charAt(0);
		}
		for(int j = 0; j <a.length; j++ ) {
			if(a[j]>=48 && a[j]<=57) {
				res = res*10+ (a[j]-48);
			}
		}
		System.out.println("������ �ڿ����� "+res+"�Դϴ�");
		for(int c=1; c<=res;c++) {
			if(res%c==0) cnt++;
		}
		System.out.println("������ �ڿ����� ����� ������ "+ cnt +"�Դϴ�.");
		

	}

}
