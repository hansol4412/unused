package algorithm;
import java.util.Scanner;
public class Number52 {

	public static void main(String[] args) {
		// 52. ugly number 
		// � ���� ���μ� ���� ���� �� �� ���μ��� 2 �Ǵ� 3 �Ǵ� 5�θ� �̷���� ���� ugly number��� �θ��ϴ�.
		// ���� 1�� ugly number�� ù��° �� �Դϴ�.
		// �ڿ��� N�� �־����� ugly number�� ���ʷ� ���� �� N��° ugly number�� ����Ͻÿ�.
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("���° ugly number�� ����Ͻʴϱ�?");
		int n = stdIn.nextInt();
		int[] a = new int[n+1];
		a[1] =1;
		int min=0;
		int p2=1;
		int p3=1;
		int p5=1;
		for(int i=2; i<=n; i++) {
			if(2*a[p2]<=3*a[p3]) min = 2*a[p2];
			else min = 3*a[p3];
			if(5*a[p5]<min) min = 5*a[p5];
			if(min==a[p2]*2) p2++;
			if(min==a[p3]*3) p3++;
			if(min==a[p5]*5) p5++;
			a[i]=min;
		}
		System.out.println(n+"��° ugly number�� "+a[n]+"�Դϴ�");
	}

}
