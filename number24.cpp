#include <stdio.h> 
#include <math.h>
// 24. Jolly Jumpers
// N���� ������ �̷���� ������ ���� ���� �����ϴ� ���� ���� 1���� N-1����  ���� ��� ������ YES, �ƴϸ� NO.
int b[100]; 
int main() {
	int n;
	scanf("%d",&n);
	int a[n];
	for(int i =0; i<n; i++) {
		scanf("%d",&a[i]);
	}
	int minus;
	int yn =1;
		for(int j=0; j<n-1; j++) {
			minus= abs(a[j]-a[j+1]);	
			printf("%d \n",minus);
			if(minus>0 && minus<n && b[minus]==0) b[minus]=1;
			else {
				yn = 0;
				break;
			}
		}
		
		if(yn==1) printf("YES \n");
		else printf("NO \n");
		
		
	
	return 0;
}
