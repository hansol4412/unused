package algorithm;
import java.util.Scanner;
public class Number8 {

	public static void main(String[] args) {
		// 8. �ùٸ� ��ȣ
		// ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� 'yes' �ùٸ��� ������ 'no'�� ����մϴ�.
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�:");
		String str = stdIn.nextLine();
		int correct=0;
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if(ch=='(') correct++;
		    if(ch==')') correct--;
		}
		if(correct==0) System.out.println("YES");
		else System.out.println("NO");
		
	}
}
