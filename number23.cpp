#include <stdio.h> 
// 23. ���� �κ� ��������
//n���� ���ڰ� ������ ������ �־����ϴ�. �� ���� �� ���������� �����ϴ� �κ� ���� �ִ� ���̸� ���� ����Ͻÿ�.
// ���� ���� ���� �����ϴ� ������ �����Ѵ�..

int main() {
	int n;
	scanf("%d",&n);
		int a[n];
		for(int i =0; i<n; i++) {
			scanf("%d",&a[i]);
		}
			int cnt=0;
		int max=0;
		int cmax=0;
		for(int i =0; i<n; i++) {
			if(a[i]>=max) {
				max=a[i];
				cnt++;
				if(cmax<cnt) cmax=cnt;
				
			}
			else {
				max=a[i];
				cnt =1;
			}
		}
		
		printf("%d \n",cmax);
		
	
	return 0;
}
