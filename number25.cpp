#include <stdio.h> 
//25. ���� ���ϱ�
		// N���� �л��� ���� ������ �ԷµǸ� �� �л��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�
int b[100]; 
int main() {
	int n;
	scanf("%d",&n);
	int a[n];
	int b[n];
	
	for(int i =0; i<n; i++) {
		scanf("%d",&a[i]);
		b[i]=1;
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(a[i]<a[j]) b[i]++; 
			}
		}
		
		for(int i=0; i<n; i++) {
			printf("%d ",b[i]);
		}
	
	
	
	
	return 0;
}
