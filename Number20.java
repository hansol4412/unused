package algorithm;
import java.util.Scanner;
public class Number20 {

	public static void main(String[] args) {
		// 20. ���� ���� ��
		// �� n���� ���� ���� �� ������ �Ͽ� A�� �̱�� A�� ����ϰ� B�� �̱�� B�� ����ϰ� ���� D�� ����Ѵ�
		// 1:����  2:����   3:��
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� ������ ������ ���ΰ�?:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		int cna=0;
		int cnb=0;
		for (int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
			System.out.print("b["+i+"]:");
			b[i]= stdIn.nextInt();
			
			if(a[i]==b[i]) System.out.println("D");
			else if(a[i]==2 && b[i]==1) {System.out.println("A"); cna++;}
			else if(a[i]==3 && b[i]==2) {System.out.println("A"); cna++;}
			else if(a[i]==1 && b[i]==3) {System.out.println("A"); cna++;}
			else { System.out.println("B"); cnb++;}
		}
		if(cna>cnb)System.out.println("���� ���ڴ� A�Դϴ�.");
		else if(cna<cnb)System.out.println("���� ���ڴ� B�Դϴ�.");
		else System.out.println("���� �����ϴ�.");
	}

}
