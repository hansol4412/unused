package algorithm;
import java.util.Scanner;
public class Number7 {

	public static void main(String[] args) {
		// 7. ����ܾ� ����
		// ������ ǥ�õǴ� ����ܾ ������ ǥ����� ������ �����ϰ� �ҹ���ȭ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�:");
		String str = stdIn.nextLine();
		String charStr = "";
		
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		   if(ch!=32 && ch>=65 && ch <=90 ) {
			   int a = (ch+32);
			   charStr += (char)a;
		   }
		}
		System.out.println(charStr);
	}
}
