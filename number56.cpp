#include <stdio.h>
using namespace std;
int DFS(int n){
	if(n<=1){
		printf("%d ",1);
	}
	else{
		printf("%d ",n);
		DFS(n-1);
	}
}
int main() { 
// 56. ����Լ� �м�
// �ڿ��� N�� �־����� ����Լ��� ����Ͽ� 1���� N���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	int n;
	printf("n�� ���� �Է��ϼ���:");
	scanf("%d",&n);
	DFS(n);
	return 0;

}
