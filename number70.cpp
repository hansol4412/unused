#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int dis[100];
int ch[100];
int main() { 
// 70. �׷����� �ִܰŸ� (BFS) 
// �׷������� 1�� �������� �� �������� ���� �ּ� �̵� �������� ���Ͽ���. 
	int n;
	printf("����� ���� �Է��ϼ���:");
	scanf("%d",&n); 
	int m;
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&m);
	int a;
 	int b;
 	vector<int> map[10];
 	for(int i =1; i<=m; i++){
		scanf("%d %d",&a,&b);
		map[a].push_back(b);
	 } 
	queue<int> Q; 
	 ch[1]=1; 
	 Q.push(1); 
	 int x; 
	 while(!Q.empty()){
	 	x=Q.front();
	 	Q.pop();
	 	for(int i=0; i<map[x].size(); i++){
	 		if(ch[map[x][i]]==0){
	 			ch[map[x][i]]=1;
	 			Q.push(map[x][i]);
				 dis[map[x][i]]=dis[x]+1;   
			 }
		 }
	 } 
	 for(int i=2; i<=n; i++){
		 	printf("%d : %d\n",i, dis[i]);
		 }
	return 0;
  
}
