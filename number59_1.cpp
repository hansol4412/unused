#include <stdio.h>
#include <vector>
#include <algorithm>
using namespace std;
int n;
int a[100];
int DFS(int x){
	if(x>n) {
			for(int i =1; i<=n; i++) {
				if (a[i]==1)printf("%d ",i);
			}
			puts("");
		}
		else {
			a[x]=1;
			DFS(x+1);
			a[x]=0;
			DFS(x+1);
		}
}
int main() { 
// 59_1. �κ����� (DFS)
// �ڿ��� n�� �־����� 1���� n������ ���Ҹ� ���� ������ �κ������� ��� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��Ϳ� �̿��� ����Ž���� �ϸ�, ����Ʈ�� ���� ��ȸ ������� ����Ѵ�. 
	printf("n�� �Է��ϼ���:");
	scanf("%d",&n);
	DFS(1);
	return 0;
 
}
