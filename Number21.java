package algorithm;
import java.util.Scanner;
public class Number21 {

	public static void main(String[] args) {
		// 21. ī�����
		/* 0���� 9���� ���ڰ� ���� ī�带 ������ ������ �Ѵ�. �� ����� ī�带 ���� �� ���� �� ū ���� ���� ����� �̱��.
		  �̰��� �� 3���� �ְ� ���� ���� ������ �ο����� �ʴ´�. ����� ���� 1���� �ο��Ѵ�
		 10���� ������ �ϰ� �� ����� ���� ���� �̱�  ����� ����Ͻÿ�.*/
		Scanner stdIn = new Scanner(System.in);
		int[] a = new int[10];
		int[] b = new int[10];
		System.out.println("������ �����մϴ�.");
		for(int i= 0; i<10; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
			System.out.print("b["+i+"]:");
			b[i] = stdIn.nextInt();
		}
		int ant=0;
		int bnt=0;
		for(int j =0; j<10; j++) {
			if(a[j]==b[j]) {
				ant++;
				bnt++;
			}
			else if(a[j]>b[j]) ant += 3;
			else bnt += 3;
		}
		
		System.out.println("A�� ����: "+ant+"  B�� ����: "+bnt);
		if(ant==bnt) System.out.println("���� �����ϴ�");
		else if(ant>bnt) System.out.println("A�� �̰���ϴ�.");
		else System.out.println("B�� �̰���ϴ�.");
		
	}

}
