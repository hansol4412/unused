#include <stdio.h>
using namespace std;
int n;
int a[10][10];
int main() { 
// 63_3. ������� (������׷���)

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
		a[o][i]=1;
	}
	
	for(int k=1; k<=n; k++){
		for(int j =1; j<=n; j++){
			printf("%d ",a[k][j]);
		}
		printf("\n");
	}
	return 0;
  
}
