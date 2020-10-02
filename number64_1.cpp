#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int ch[10];
int path[10];
int cnt=0;
int DFS(int s, int L){
	if(s==n){
		cnt++;
		for(int i=0; i<L; i++){
			printf("%d ",path[i]);
		}
		printf("\n");
	}
	else{
		for(int i =1; i<=n; i++){
			if(a[s][i]==1 && ch[i]==0){
				ch[i]=1;
				path[L]=i;
				DFS(i,L+1);
				ch[i]=0;
			}
		}
	}
	return cnt;
}
int main() { 
//64_1. ���Ž��(�������) 
// ����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
// �־��� ��θ� ��� ����Ͻÿ�. 
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
	path[0]=1; //����� ó���� ������ 1���� ���� 
	printf("1���� %d������ �ִ� ��μ��� %d�̴�. \n",n,DFS(1,1));
	return 0;
  
}
