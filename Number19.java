package algorithm;
import java.util.Scanner;
public class Number19 {

	public static void main(String[] args) {
		// 19. �г� ������
		/* �л����� ��ȭ�� �� �� ���� ���ڸ��� ���� Űī ū �л��� ������ �� �л����� ���� �л��� ��ũ���� ������ �ʽ��ϴ�
		 �� �ٿ� ���� Ű ������ �־����� �� ��� ����� �þ߸� ������ �г������� �� �ٿ� �� �� �ִ��� ���Ͻÿ�.*/
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�л� ���� �Է��ϼ���:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for (int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
		}
		 int max= a[n-1];
		 int cnt = 0;
		 for(int i  = n-1; i>=0; i--) {
			 if(a[i]>max) {
				 cnt++;
				 max = a[i];
			 }
		 }
		 System.out.println("�г������ڴ� "+cnt+"�� �Դϴ�.");
		

	}

}
