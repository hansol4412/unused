package algorithm;
import java.util.Scanner;
public class Number6_1 {

	public static void main(String[] args) {
		// 6. ���ڸ� ����
		/* ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� ������� �ڿ����� ����ϴ�
			������� �ڿ����� �� �ڿ����� ����� ������ ����Ͻÿ� */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�:");
		String str = stdIn.next();
		String intStr = "";
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if (48 <= ch && ch <= 57) {
		        intStr += ch;
		    }
		}
		int res = Integer.parseInt(intStr);
		int cnt = 0;
		System.out.println("������ �ڿ����� "+res+"�Դϴ�");
		for(int c=1; c<=res;c++) {
			if(res%c==0) cnt++;
		}
		System.out.println("������ �ڿ����� ����� ������ "+ cnt +"�Դϴ�.");	
	}

}
