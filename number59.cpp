#include <stdio.h>
int a[100];
int DFS(int n,int x){
	if(x>n) {
			for(int i =1; i<=n; i++) {
				if (a[i]==1)printf("%d ",i);
			}
			printf("\n");
		}
		else {
			a[x]=1;
			DFS(n, x+1);
			a[x]=0;
			DFS(n, x+1);
		}
}
int main() { 
// 59. �κ����� (DFS)
// �ڿ��� n�� �־����� 1���� n������ ���Ҹ� ���� ������ �κ������� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��Ϳ� �̿��� ����Ž���� �ϸ�, ����Ʈ�� ���� ��ȸ ������� ����Ѵ�. 
	int n;
	printf("n�� �Է��ϼ���:");
	scanf("%d",&n);
	DFS(n,1);
	return 0;
 
}
