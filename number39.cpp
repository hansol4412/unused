#include <stdio.h> 
// 39. �迭��ġ��
// ������������ ������ �� �� �迭�� �־����� �� �迭�� ������������ ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
int c[20];
int main() {
	int n;
	printf("ù��° �迭�� ũ�⸦ �Է��ϼ���.: ");
	scanf("%d",&n); 
	int a[n];
	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);	
	}
	 
	int m;
	printf("�ι�° �迭�� ũ�⸦ �Է��ϼ���.: ");
	scanf("%d",&m); 
	int b[m];
	for(int i=0; i<m; i++){
		scanf("%d",&b[i]);	
	}

	int p1=0, p2=0, p3=0;
	while(p1<=n-1 && p2<=m-1){
		if(a[p1]<b[p2])c[p3++]=a[p1++];
		else c[p3++]=b[p2++];
	}
	while(p1<=n-1)c[p3++]=a[p1++];
	while(p2<=m-1)c[p3++]=b[p2++];
	
	for(int i=0; i<n+m; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
