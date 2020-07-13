package algorithm;
import java.util.Scanner;
public class Number37 {

	public static void main(String[] args) {
		// 37. Least Recently Used (īī�� ĳ�� ���� ����)
		// ĳ�ø޸𸮴� LRU �˰��� ��, ���� �������� ������� �ʴ� ���� �����ϴ� �˰����� ����Ѵ�. 
		// Cache Miss : �ؾ��� �۾��� ĳ�ÿ� ���� ���·� ��� �۾��� �ڷ� �и��� ���ο� �۾��� �տ� �߰� �ȴ�.
		// Cache Hit : �ؾ��� �۾��� ĳ�ÿ� �ִ� ���·� ����ؾ� �ϴ� �۾� �տ� �ִ� �۾��� �ڷ� �и��� ����ϴ� �۾��� �� ������ �´�
		// ĳ�� ũ��� �۾����� �Է��ϰ� ĳ�ø޸��� �۾� ������ ����Ͻÿ�.
		
		
		Scanner stdIn = new Scanner(System.in); 
		System.out.print("ĳ�ø޸��� ũ�⸦ �Է��ϼ��� :");
		int memory = stdIn.nextInt();
		int[] m = new int[memory];
		System.out.print("�۾��� ���� �Է��Ͻÿ�.:");
		int work = stdIn.nextInt();
		int[] w = new int[work];
		for(int i=0; i<work; i++) {
			w[i]=stdIn.nextInt();
		}
		 
		for(int i=0; i<work; i++) {
			int pos=-1;
			for(int j=0; j<memory; j++) {
				if(w[i]==m[j]) pos=j;	
			}
			if(pos==-1) {
				for(int t=memory-1; t>=1; t--) m[t]=m[t-1];
				m[0]=w[i];
			}
			else {
				int temp=m[pos];
				for(int t=pos; t>=1; t--) m[t]=m[t-1];
				m[0]=temp;
			}
			
			 for(int q=0; q<memory; q++) {
					System.out.print(m[q]+" ");
				}
			 System.out.println();
		}
				 		 
		
		
		
	}

}
