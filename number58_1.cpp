#include <stdio.h>
using namespace std;
int DFS(int n,int x){
	if(x>n){
		return 0;
	}
	else{
		printf("%d",x);
		DFS(n,2*x);
		DFS(n,2*x+1);
	}
}
int main() { 
// 58. ����Ʈ�� ���̿켱Ʈ��(DFS)
// ������ȸ ���.
	int n;
	printf("����� ������ �Է��ϼ���:");
	scanf("%d",&n);
	DFS(n,1);
	return 0;
 
}
