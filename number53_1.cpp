#include <stdio.h>
#include <stack>
using namespace std;
int main() { 
// 53. K���� ��� (Stack Ŭ���� ���x)
/* 10���� n�� �ԷµǸ� m������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
   ���� �ڷᱸ���� ����Ͽ��� */
	int n; 
	printf("�����ϴ� ���� n�� �Է��ϼ���:");
	scanf("%d",&n);
	int m;
	printf("m������ �Է��ϼ���:");
	scanf("%d", &m);
	stack<int> stk;
	char str[20] ="0123456789ABCDEF"; 
	
	while(n>0){
		stk.push(n%m);
		n= n/m;
	}
	while(!stk.empty()){
		printf("%c",str[stk.top()]);
		stk.pop();
	}
	
	return 0;

}
