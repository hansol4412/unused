#include <stdio.h>
using namespace std;
int DFS(int n){
	if(n<=1){
		printf("%d ",n);
	}
	else{
		DFS(n/2);
		printf("%d ",n%2);
		
	}
}
int main() { 
// 57. ����Լ�  ������ ���
// 10���� N�� �ԷµǸ� ����Լ��� ����Ͽ� 2������ ��ȯ�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	int n;
	printf("10������ ���� �Է��ϼ���:");
	scanf("%d",&n);
	DFS(n);
	return 0;
 
}
