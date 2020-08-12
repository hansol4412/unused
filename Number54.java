package algorithm;
import java.util.Scanner;
import java.util.Stack;
public class Number54 {

	public static void main(String[] args) {
		// 54. �ùٸ� ��ȣ (���� Ŭ���� ���)
		// ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� 'yes' �ùٸ��� ������ 'no'�� ����մϴ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���ڿ��� �Է��Ͻÿ�:");
		String str = stdIn.nextLine();
		Stack<Integer> stack = new Stack<>();
		int flag = 0;
		for (int i = 0; i < str.length(); i++) {
		    char ch = str.charAt(i);
		    if(ch=='(') stack.push(1);
		    if(ch==')') {
		    	if(stack.empty()) {
		    		System.out.println("No");
		    		flag = 1;
		    		break;
		    	}
		    	else {
		    		stack.pop();
		    	}
		    }
		}
		
		if(flag==0 && stack.empty()) System.out.println("yes");
		if(flag==0 && !stack.empty()) System.out.println("No");
		
	}

}
