package algorithm;
import java.util.Scanner;
public class Number22 {

	public static void main(String[] args) {
		// 22. �µ��� �ִ밪
		// N���� �µ��� �����ؼ� �������� K���� ���� ���� �ִ� ���� ���� ����Ͻÿ�
		// n=10, k=2 : 10���� �µ��� �����ؼ� �������� 2���� ���� ���� ���� ���� ū ���� ����Ͻÿ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ���� �µ��� ������ ���ΰ�:");
		int n = stdIn.nextInt();
		System.out.print("��ĥ ���� �µ��� ���� ���� ���ΰ�:");
		int k = stdIn.nextInt();
		int[] a = new int[n];
		for(int i =0; i<n; i++) {
			System.out.print(i+1+"��:");
			a[i]= stdIn.nextInt();
		}
		
		int max=-100;
		for(int i =0 ; i<=n-k; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum+=a[j];
				
			}
			if(sum>max) max = sum;
		}
		System.out.println("�µ��� �ִ� ����:"+max);
		

	}

}
