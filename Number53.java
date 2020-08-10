package algorithm;
import java.util.Scanner;
public class Number53 {
	public static int ptr = -1;
	public static void push(int[] stack, int k) {
		stack[++ptr] = k;
	}
	public static int pop( int[] stack) {
		return stack[ptr--];
	}
	public static void main(String[] args) {
		// 53. K���� ��� (Stack Ŭ���� ���x)
		/* 10���� n�� �ԷµǸ� m������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
		 	���� �ڷᱸ���� ����Ͽ��� */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�����ϴ� ���� n�� �Է��ϼ���:");
		int n = stdIn.nextInt();
		System.out.print("m������ �Է��ϼ���:");
		int m = stdIn.nextInt();
		int[] stack = new int[10];
		String[] str = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
		while(n>0) {
			push(stack, n%m);
			n = n/m;
		}
		
		while(ptr!=-1) {
			System.out.print(str[pop(stack)]);
		}

	}

}
