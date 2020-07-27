package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Number43 {
	static int n;
	static int[] a;
	
	public static int count(int mid) {
		int cnt=1; 
		int sum=0;
		for(int i =0; i<n; i++) {
			if(sum+a[i]>mid) {
				cnt++;
				sum=a[i];
			}
			else {
				sum+=a[i];
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		// 43. �������� (�̺а˻� ����)
		/* ���ݿ� N���� ���� ���� �� ������ �״�� ������ ä�� DVD�� ��ȭ�Ϸ��� �Ѵ�. 
		   ���ۻ��� ������ M���� DVD�� ����ؼ� ������ �����Ϸ��Ѵ�. �߰��� ���� ©���� 2���� DVD�� ������ �����Ǹ� �ȵȴ�.
		  �̶� �Ѱ��� DVD�� �ּ� ũ�� (�ּ� �ð�)�� ����Ͻÿ�.		 */
		Scanner stdIn = new Scanner(System.in);    
		System.out.print("�뷡�� ������ �Է��Ͻÿ�.:");
		n = stdIn.nextInt();
		System.out.print("����ϴ� DVD�� ������ �Է��Ͻÿ�.:");
		int m = stdIn.nextInt();
		a = new int[n];
		int sum=0;
		int max=0;
		for(int i=0; i<n; i++) {
			System.out.print("a["+i+"]:");
			a[i] = stdIn.nextInt();
			sum+=a[i];
			if(max<a[i])max=a[i];
		}
		
		int left=1;
		int right = sum;
		int result=0;
		while(left<=right) {
			int mid = (left+right)/2;
			if(count(mid)<=m && mid>=max) {
				result=mid;
				right= mid-1;
			}
			else {
				left=mid+1;
			}
		}
		
		System.out.println(result);
		
	}

}
