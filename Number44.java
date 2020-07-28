package algorithm;
import java.util.Scanner;
import java.util.Arrays;
public class Number44 {
	static int n;
	public static int count(int mid, int[] a) {
		int pos = a[0];
		int cnt = 1;
		for(int i=1; i<n; i++) {
			if(a[i]-pos>=mid) {
				cnt++;
				pos=a[i];
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// 44. ������ ���ϱ� (�̺а˻� ����)
		/* N���� �������� M������ ���� �ֽ��ϴ�. ������ ���� �Ѹ����� ���� �־� ��ġ���� �� ���� ����� �� ���� �Ÿ���
		   �ִ밡 �Ǵ� ���� ����Ͻÿ�*/
		int result=0;
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("�������� ������ �Է��Ͻÿ�.:");
		n = stdIn.nextInt();
		System.out.print("���� ������ �Է��Ͻÿ�.:");
		int m = stdIn.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
		}
		Arrays.sort(a);
		
		int left=0;
		int right=a[n-1];
		while(left<=right) {
			int mid=(left+right)/2;
			if(count(mid, a)>=m) {
				result=mid;
				left=mid+1;
			}
			else {
				right=mid-1;
			}
		}
		
		System.out.println(result);
	}

}
