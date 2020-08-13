#include <stdio.h>
#include <stack>
using namespace std;
int main() { 
//55. ���� ���� (stack���)
/* A���ÿ��� ����� ������ �����ο� ��� ������ ������ �� B���÷� �����Ѵ�.  
	�������� ��ȣ�� �ο��Ǵµ�  P(push)�۾��� O(out)�۾��� ���� ������� B���ÿ� �����ϵ��� �ۼ��Ͽ���
	��ȣ ������� ������ �Ұ����� �۾��� Impossible�̶�� ����Ѵ�. */
	int n;
	printf("������ ������ �Է��Ͻÿ�:");
	scanf("%d",&n);
	int a[n+1];
	printf("������ ��ȣ�� �Է��ϼ���:");
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);
	}
	int j=1;
	stack<int> stk;
	for(int i=1; i<=n; i++){
		stk.push(a[i]);
		printf("P");
		while(true){
			if(stk.empty()){
				break;
			}
			if(j==stk.top()){
				stk.pop();
				printf("O");
				j++;
			}
			else{
				break;
			}
		}
	}
	if(!stk.empty()){
		printf("\nimpossible \n");
	}
	return 0;

}
