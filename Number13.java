package algorithm;
import java.util.Scanner;
public class Number13 {

	public static void main(String[] args) {
		// 13. ���� ���� ���� �ڸ���
		// N�ڸ��� �ڿ����� �ԷµǸ� �ڿ����� �ڸ��� �� ���� ���� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		// ���� ���� ���� ��� �� �߿��� ���� ū ���� ����Ͻÿ�. 
		
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[10];
		System.out.print("���ڸ� �Է��Ͻÿ�:");
		String str = stdIn.nextLine();
		
		
		for (int i = 0; i < str.length(); i++) {
			int num = (str.charAt(i)-'0');
		    a[num]++;
		}
		
		
		int max = 0;
		int numMax = 0;
		for(int j= 0; j<=9; j++ )
		{
			if(a[j]>max) {
				max=a[j];
				numMax=j;
			}
			else if(a[j]==max) {
				if(numMax<j) numMax=j;
			}
		}
		
		System.out.println("���� ���� ���� ���� "+numMax+"�Դϴ�.");
		
	}

}
