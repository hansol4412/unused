#include <stdio.h>
#include <vector> 
#include <algorithm>
using namespace std;
int n;
vector<pair<int,int> > a[30];
int ch[30];
int cost=1000;
int DFS(int v,int sum){
	if(v==n){
		if(cost>sum)cost=sum;
	}
	else{
		for(int i =0; i<a[v].size(); i++){
			if(ch[a[v][i].first]==0){
				ch[a[v][i].first]=1;
				DFS(a[v][i].first,sum+a[v][i].second);
				ch[a[v][i].first]=0;
			}
		}
	}
	return cost;
}
int main() { 
// 68. �ּҺ�� (��������Ʈ)
// ����ġ ���� �׷����� �־����� 1�� �������� N�� �������� ���� �ּҺ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&n); 
	int m;
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&m); 
	int i;
	int o;
	int x;
	for(int k=1; k<=m; k++){
		scanf("%d %d %d",&i,&o, &x);
		a[i].push_back(make_pair(o,x));
	}
	ch[1]=1;
	printf("1���� %d������ �ִ� ��μ��� %d�̴�. \n",n,DFS(1,0));
	return 0;
  
}
