#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int ch[10];
int cnt=0;
int DFS(int s){
	if(s==n){
		cnt++;
	}
	else{
		for(int i =1; i<=n; i++){
			if(a[s][i]==1 && ch[i]==0){
				ch[i]=1;
				DFS(i);
				ch[i]=0;
			}
		}
	}
	return cnt;
}
int main() { 
//64. ���Ž��
// ����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&n); 
	int v;
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&v); 
	
	int i;
	int o;
	for(int k=1; k<=v; k++){
		scanf("%d %d",&i,&o);
		a[i][o]=1; 
	}
	ch[1]=1;
	printf("1���� %d������ �ִ� ��μ��� %d�̴�. \n",n,DFS(1));
	return 0;
  
}
