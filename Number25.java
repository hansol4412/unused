package algorithm;
import java.util.Scanner;
public class Number25 {

	public static void main(String[] args) {
		//25. ���� ���ϱ�
		// N���� �л��� ���� ������ �ԷµǸ� �� �л��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		Scanner stdIn = new Scanner(System.in);
		System.out.print("�� ���� ������ �Է��� ���ΰ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i =0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i]= stdIn.nextInt();
			b[i]=1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i]<a[j]) b[i]++; 
			}
		}
		
		for(int i=0; i<n; i++) {
			System.out.println(a[i]+"����  "+b[i]+"��");
		}
		
		
		
	}

}
