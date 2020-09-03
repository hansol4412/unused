#include <stdio.h>
using namespace std;
int n; 
int m; 
int a[10];
int ch[10];
int cnt=0;
int DFS(int L, int sum){
	if(L>n){
		if(sum==m){
			for(int i=1; i<=n; i++){
				if(ch[i]==1){
					printf("+%d ",a[i]);
				}
			}
			printf(" = %d\n",sum);
			cnt++;
		}	
	}
	else{
	ch[L]=1;
	DFS(L+1,sum+a[L]);
	ch[L]=0;
	DFS(L+1,sum);	
	}
return cnt;
}

int main() { 
// 61. Ư�� �� ����� (DFS)
/* N���� ���ҷ� ������ �ڿ��� ������ �־����� ������ ���ҿ� "+" ������ ����Ͽ� Ư�� ���� M�� �����
* ��찡 ��� �ִ��� ����ϴ� ���α׷��� �ۼ��ϼ���.
�� ���Ҵ� ���꿡 �ѹ��� ���˴ϴ�. */
	printf("n���� ������ ������ �Է��ϼ���:");
	scanf("%d",&n);
	printf("����� ���� ���� m�� �Է��ϼ���:");
	scanf("%d", &m);
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);	
	}
	printf("%d�� ����� ���� ���� ������ ����� ���� %d�Դϴ�.\n",m,DFS(1, 0));
	return 0;
  
}
