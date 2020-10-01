#include <stdio.h>
using namespace std;
int n; 
int a[10][10];
int ch[10][10];
int dx[4]= {-1, 0, 1, 0};
int dy[4]= {0, -1, 0, 1};
int pathX[100];
int pathY[100];
int cnt=0;

int DFS(int x, int y ,int L){
	if(x==n&&y==n){
		cnt++;
		for(int i=0; i<L-1;i++){
			printf("(%d, %d) -> ",pathX[i],pathY[i]);
		}
		printf("(7,7)\n");
	}
	else{
		for(int i=0; i<4; i++){
			int xx = x+1*dx[i];
			int yy = y+1*dy[i];
			if(xx<1||xx>n||yy<1||yy>n){
				continue;
			}
			if(a[xx][yy]==0 && ch[xx][yy]==0){
				ch[xx][yy]=1;
				pathX[L]=xx;
				pathY[L]=yy;
				DFS(xx,yy,L+1);
				ch[xx][yy]=0;
			}
		}	
	}
	return cnt;
}
int main() { 
//65_1.�̷�Ž��
/* �ڿ��� n�� �־����� n*n  ������ �̷θ� Ż���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
   �������� (1,1) ��ǥ�̰� Ż�� �������� (n,n)�̴�.
   �������� 1�� ���̰�, 0�� ����̴�. �������� �������� �����¿�θ� �����δ�.*/ 
// ������ ��θ� ����Ͽ���. 
	printf("n�� �Է��Ͻÿ�:") ;
	scanf("%d",&n);
	for(int i=1; i<=n; i++){
		for(int j=1; j<=n; j++){
			scanf("%d",&a[i][j]);
		}
	}
	ch[1][1]=1;
	pathX[0]=1;
	pathY[0]=1;
	printf("�̷�Ż�� ��μ��� �� %d�����̴� \n",DFS(1,1,1));
	return 0;
  
}
