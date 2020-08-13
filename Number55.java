package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class Number55 {
	public static void main(String[] args) {
		//55. ���� ���� (stack���)
		/* A���ÿ��� ����� ������ �����ο� ��� ������ ������ �� B���÷� �����Ѵ�.  
		      �������� ��ȣ�� �ο��Ǵµ�  P(push)�۾��� O(out)�۾��� ���� ������� B���ÿ� �����ϵ��� �ۼ��Ͽ���
		      ��ȣ ������� ������ �Ұ����� �۾��� Impossible�̶�� ����Ѵ�. */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("������ ������ �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		System.out.print("������ ��ȣ�� �Է��ϼ���:");
		for(int i =1; i<=n; i++) {
			a[i] = stdIn.nextInt();
		}
		Stack<Integer> stack = new Stack<>();
		int j=1;
		for(int i =1; i<=n; i++) {
			stack.push(a[i]);
			System.out.print("P");
			while(true) {
					if(stack.empty()) break;
					if(j==stack.peek()) {
						stack.pop();
						System.out.print("O");
						j++;
					}
					else {
						break;
					}
				
			}	
		}
		if(!stack.empty()) {
			System.out.println();
			System.out.println("Impossible");
		}
	}
}
