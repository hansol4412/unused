package algorithm;
import java.util.Scanner;

public class Number5 {

	public static void main(String[] args) {
		// 5. ���̰��
		// �ֹε������ ��ȣ�� �־����� �ֹε������ ������ ���̿� ������ �Ǵ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		int[] num = new int[13];
		int age;
		int year;
		System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ���:");
		for(int i = 0; i< num.length; i++) {
			num[i] = stdIn.nextInt();			
		}
		
		//����
		if( num[6]==1 || num[6]==2 ) {
			age = 1900 + num[0]*10 + num[1];
		}
		else {
			age = 2000 + num[0]*10 + num[1];
		}
		year = 2020 - age +1;
		System.out.println("����� ���̴� "+year+"�Դϴ�.");
		
		//����
		if( num[6]==2 || num[6]==4 ) System.out.println("����� �����Դϴ�");
		else System.out.println("����� �����Դϴ�");
	
	}

}
