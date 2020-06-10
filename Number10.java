package algorithm;
import java.util.Scanner;
public class Number10 {
	public static int digit_sum(int n) {
		int sum=0;
		while(n>0) {
			int res = n%10;
			sum+=res;
			n = n/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		// 10. �ڸ����� ��
		/* N���� �ڿ����� �Էµ��� �� �ڿ����� �ڸ����� ���� ���ϰ� �� ���� �ֵ��� �ڿ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
		   �ڸ����� ���� �ִ��� �ڿ����� �������� ��� �� �� ���� ���� ū ���� ����Ͻÿ�.*/
		// int digit_sum(int x)�� �޼ҵ带 ����Ͽ� ���α׷����Ͻÿ�.
		
		Scanner stdIn = new Scanner(System.in);
		int max=0;
		int sum=0;
		int maxN=0;
		System.out.print("�Է��� ���� ������ �Է��Ͻÿ�:");
		int n = stdIn.nextInt();
		int[] a = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = stdIn.nextInt();
			sum =  digit_sum(a[i]);	
			
			if(max<sum) {
				max = sum;
				maxN = a[i];
			}
			else if(max==sum) {
				if(maxN < a[i]) maxN=a[i];
			}
		}
		System.out.println(maxN);
	}

}
