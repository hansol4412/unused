package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number16 {

	public static void main(String[] args) {
		// 16. Anagram (���� ���ͺ� ����)
		// �Ƴ��׷��̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �Ѵ�
		// �Ƴ��׷� �Ǻ��� ��ҹ��ڴ� �����ȴ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("ù��° ���ڿ��� �Է��ϼ���:");
		String a = stdIn.nextLine();
		int[] ac = new int[52];
		System.out.print("�ι�° ���ڿ��� �Է��ϼ���:");
		String b = stdIn.nextLine();
		int[] bc = new int[52];
		for (int i = 0; i < a.length(); i++) {
			int num = (a.charAt(i)-'A');
		    if(num>=32) {
		    	num=num-6;
		    }
		    ac[num]++;
		}
		for (int i = 0; i < b.length(); i++) {
			int num = (b.charAt(i)-'A');
			if(num>=32) {
		    	num=num-6;
		    }
		    bc[num]++;
		}
		
		
			if(Arrays.equals(ac, bc)) System.out.println("YES");
			else System.out.println("NO");
	
	}

}
