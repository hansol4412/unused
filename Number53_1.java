package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class Number53_1 {

	public static void main(String[] args) {
		// 53_1. K���� ��� (Stack Ŭ���� ���o)
		/* 10���� n�� �ԷµǸ� m������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
			���� �ڷᱸ���� ����Ͽ��� */
			Scanner stdIn = new Scanner(System.in);
			System.out.print("�����ϴ� ���� n�� �Է��ϼ���:");
			int n = stdIn.nextInt();
			System.out.print("m������ �Է��ϼ���:");
			int m = stdIn.nextInt();
			Stack<Integer> stack = new Stack<>();
			String[] str = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"};
			while(n>0) {
				stack.push(n%m);
				n= n/m;
			}
			while(!stack.empty()) {
				System.out.print(str[stack.pop()]);
			}
	}

}
