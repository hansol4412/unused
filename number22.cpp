#include <stdio.h> 
// 22. �µ��� �ִ밪
// N���� �µ��� �����ؼ� �������� K���� ���� ���� �ִ� ���� ���� ����Ͻÿ�
// n=10, k=2 : 10���� �µ��� �����ؼ� �������� 2���� ���� ���� ���� ���� ū ���� ����Ͻÿ�.

int main() {
	int n; int k;
	scanf("%d %d",&n,&k);
		int a[n];
		for(int i =0; i<n; i++) {
			scanf("%d",&a[i]);
		}
		
		int max=-100;
		for(int i =0 ; i<=n-k; i++) {
			int sum=0;
			for(int j=i; j<i+k; j++) {
				sum+=a[j];
				
			}
			if(sum>max) max = sum;
		}
		printf("�µ��� �ִ� ����:%d \n",max);
		
	
	return 0;
}
