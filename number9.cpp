#include <stdio.h> 

// ����� ���
// �ڿ��� N�� �ԷµǸ� 1���� N������ �� ���ڿ��� ����� ������ ����ϴ� ���α׷��� ����ϼ���. 
int a[100];
int main() {
	int n;
	scanf("%d",&n);
	
	for(int i=1; i<=n; i++){
		for(int j=i; j<=n; j=j+i){
			a[j]++;
		}
	}
	
	for(int t=1; t<=n; t++){
		printf("%d�� ����� ������ %d \n",t,a[t]);
	}
	
	return 0;
}
