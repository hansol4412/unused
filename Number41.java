package algorithm;
import java.util.Scanner;
public class Number41 {
	public static void main(String[] args) {
		// 41. ���ӵ� �ڿ����� ��
		// ���� ������ �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��մϴ�.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("���� ������ �Է��ϼ���:");
		int n = stdIn.nextInt();
		int temp = n;
		int cnt=0;
		int b=2;
		
		while(n>0) {
		int sum=0;
		for(int i=1; i<=b; i++) {
			sum+=i;
		}
		if((n-sum)%b ==0){
			int x = (n-sum)/b;
			for(int i=1; i<b; i++) {
				System.out.print(x+i + " + ");
			}
			System.out.println( x+b +" = " + temp);
			cnt++;
		}
		b++;
		
		if((n-sum)/b<=0) break;
		}
		
		System.out.println(cnt+"��");
	}
}
