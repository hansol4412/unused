#include <stdio.h>
#include <vector> 
using namespace std;
int n;
vector<int> a[30];
int ch[30];
int cnt=0;
int path[30];
int DFS(int v, int L){
	if(v==n){
		cnt++;
		for(int i =0; i<L; i++){
			printf("%d ",path[i]);
		}
		printf("\n");
	}
	else{
		for(int i =0; i<a[v].size(); i++){
			if(ch[a[v][i]]==0){
				ch[a[v][i]]=1;
				path[L]=a[v][i];
				DFS(a[v][i], L+1);
				ch[a[v][i]]=0;
			}
		}
	}
	return cnt;
}
int main() { 
//66_1. ���Ž��(��������Ʈ) 
// ����׷����� �־����� 1�� �������� N�� �������� ���� ��� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//��θ� ����Ͽ���. 
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&n); 
	int m;
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&m); 
	
	int i;
	int o;
	for(int k=1; k<=m; k++){
		scanf("%d %d",&i,&o);
		a[i].push_back(o);
	}
	ch[1]=1;
	path[0]=1;
	printf("1���� %d������ �ִ� ��μ��� %d�̴�. \n",n,DFS(1,1));
	return 0;
  
}
