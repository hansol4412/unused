#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int ch[20];
int min=10000;
int DFS(int s, int sum){
	if(s==n){
		if(min>sum)min=sum;
	}
	else{
		for(int i =1; i<=n; i++){
			if(a[s][i]>0 && ch[i]==0){
				ch[i]=1;
				DFS(i,sum+a[s][i]);
				ch[i]=0;
			}
		}
	}
	return min;
}
int main() { 
// 67. �ּҺ�� (�������)
// ����ġ ���� �׷����� �־����� 1�� �������� N�� �������� ���� �ּҺ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&n); 
	int v;
	printf("������ ���� �Է��ϼ���:");
	scanf("%d",&v); 
	
	
	int i;
	int o;
	int x;
	for(int k=1; k<=v; k++){
		scanf("%d %d %d",&i,&o,&x);
		a[i][o]=x; 
	}
	ch[1]=1;
	printf("1���� %d������ �ּҰ���� ���� %d�̴� \n", n, DFS(1,0));
	return 0;
  
}
