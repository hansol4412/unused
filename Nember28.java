package algorithm;
import java.util.Scanner;
public class Nember28 {
public static void main(String[] args) {
	//28. N!���� 0�� ����
	//�ڿ��� N�� �ԷµǸ� N! ������ ���� �ڸ����� ���������� '0'�� �� �� �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
	Scanner stdIn = new Scanner(System.in);
	System.out.print("���� �Է��Ͻÿ�:");
	int n = stdIn.nextInt();
	int cnt2=0;
	int cnt5=0;
	for(int i =2; i<=n; i++) {
		int temp =i; 
		int j = 2;
		while(true) {
			if(temp%j==0) {
				if(j==2) cnt2++;
				else if(j==5) cnt5++;
				temp=temp/j;
				}
			else j++;
			
			if(temp==1) break;
		}
		
	}
	
	if(cnt2>=cnt5)System.out.println(n+"!���� ���ӵǴ� 0�� ������ "+cnt5+"�̴�.");
	else System.out.println(n+"!���� ���ӵǴ� 0�� ������ "+cnt5+"�̴�.");
			
		
	}
}
