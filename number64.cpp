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
//64. 경로탐색
// 방향그래프가 주어지면 1번 정점에서 N번 정접까지 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요.
	printf("정점의 수를 입력하세요:");
	scanf("%d",&n); 
	int v;
	printf("간선의 수를 입력하세요:");
	scanf("%d",&v); 
	
	int i;
	int o;
	for(int k=1; k<=v; k++){
		scanf("%d %d",&i,&o);
		a[i][o]=1; 
	}
	ch[1]=1;
	printf("1부터 %d까지의 최대 경로수는 %d이다. \n",n,DFS(1));
	return 0;
  
}
