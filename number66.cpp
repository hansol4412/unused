#include <stdio.h>
#include <vector> 
using namespace std;
int n;
vector<int> a[30];
int ch[30];
int cnt=0;
int DFS(int v){
	if(v==n){
		cnt++;
	}
	else{
		for(int i =0; i<a[v].size(); i++){
			if(ch[a[v][i]]==0){
				ch[a[v][i]]=1;
				DFS(a[v][i]);
				ch[a[v][i]]=0;
			}
		}
	}
	return cnt;
}
int main() { 
//66. 경로탐색(인접리스트) 
// 방향그래프가 주어지면 1번 정점에서 N번 정접까지 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요.
	printf("정점의 수를 입력하세요:");
	scanf("%d",&n); 
	int m;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&m); 
	
	int i;
	int o;
	for(int k=1; k<=m; k++){
		scanf("%d %d",&i,&o);
		a[i].push_back(o);
	}
	ch[1]=1;
	printf("1부터 %d까지의 최대 경로수는 %d이다. \n",n,DFS(1));
	return 0;
  
}
