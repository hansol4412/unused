package algorithm;
import java.util.Scanner;
public class Number31_1 {

	public static void main(String[] args) {
		// 31. źȭ���� ����
		// ź��(C)�� ����(H)�� �̷���� źȭ���ҿ��� ź�Ҵ� �� ���� 12g, ���Ҵ� �� ���� 1g�̴�. źȭ���ҽĿ��� ������ ���϶�
		// cf) C1H4�� ���� CH4��� �Է��ϰ� ����Ѵ�.
		 Scanner stdIn = new Scanner(System.in);
		 int[] ch = new int[10];
		 int c = 0;
		 int h = 0; 
		 int position = 0;
		 System.out.print("���� �Է��Ͻÿ�:");
		 String str = stdIn.nextLine();
		 for (int i = 0; i < str.length(); i++) {
			 	ch[i] = str.charAt(i);
			}
		 if(ch[1]=='H') {
			 c=1;
			 position = 1;
		 }
		 else {
			 for(int i=1; ch[i]!='H'; i++) {
				 c=10*c + (ch[i]-'0');
				 position=i+1;
			 }
			 
		 }
		 
		 if(ch[position+1]==0) h=1;
		 else {
			 for(int i = position+1; ch[i]!=0; i++) {
				 h=10*h+ (ch[i]-'0');
			 }
		 }
		 System.out.println("C�� ����: "+c);
		 System.out.println("H�� ����: "+h);
		 int sum = c*12+h;
		 System.out.println("źȭ���� ������ "+sum+"g�̴�.");
		 
	 
	}

}
