package algorithm;
import java.util.Scanner;
public class Number27 {

	public static void main(String[] args) {
		// 27. N!�� ǥ����
		// N!�� 1���� N������ ���� �ǹ��Ѵ�. ���� ��� N�� 5�̸� 5*4*3*2*1=120�̴�.
		// ������ �Ҽ��� �̿��� ǥ���ϴ� ����� �ִ�   ���� ��� N�� 5�̸� 2^3*3*5�̴�. N�� �Է½� �� �Ҽ��� �̿��� Ƚ���� ����Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		for(int i =2; i<=n; i++) {
			int temp=i;
			int j =2;
			while(true) {
				if(temp%j==0) {
					a[j]++;
					temp=temp/j;
				}
				else j++;
				if(temp==1) break;
				
			}
		}
		
		System.out.println(n+"!��");
		for(int i=2; i<=n;i++) {
			if(a[i]!=0) {
				System.out.println(i+"�� "+a[i]+"�� ����ߴ�.");
			} 
		}
		
		

	}

}
