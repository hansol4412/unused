package algorithm;
import java.util.Scanner;
public class Number31 {

	public static void main(String[] args) {
		// 31. źȭ���� ����
		// ź��(C)�� ����(H)�� �̷���� źȭ���ҿ��� ź�Ҵ� �� ���� 12g, ���Ҵ� �� ���� 1g�̴�. źȭ���ҽĿ��� ������ ���϶�
		// cf) C1H4�� ���� CH4��� �Է��ϰ� ����Ѵ�.
		 Scanner stdIn = new Scanner(System.in);
		 int[] ch = new int[4];
		 System.out.print("���� �Է��Ͻÿ�:");
		 String str = stdIn.nextLine();
		 int c=12;
		 int h=1;
		 for (int i = 0; i < str.length(); i++) {
			 	ch[i] = str.charAt(i);
			}
		 for(int j =0; j<=3; j++) {
			 if(ch[j]==67 ||ch[j]==99) {
				 if(ch[j+1]<48 ||ch[j+1]>57) c=c*1; 
				 else c= c*(ch[j+1]-48);
			 }
			 if(ch[j]==72 ||ch[j]==104) {
				 if(ch[j+1]<48 ||ch[j+1]>57) h=h*1;
				 else h= h*(ch[j+1]-48);	 
			 }
		 }
		 
		 int sum= c+h;
		 System.out.println("źȭ������ �� ������ "+sum+"�Դϴ�.");
	}

}
