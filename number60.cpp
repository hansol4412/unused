#include <stdio.h>
using namespace std;
int n; 
int a[10];
int total;
int flag=0;
void DFS(int L, int sum){
	if(sum>(total/2)) return;
	if(flag==1) return;

	if(L>n){
		if(sum==(total-sum)){
			flag=1;
		}	
	}
	else{
		DFS(L+1, sum+a[L]);
		DFS(L+1, sum);
	}
}
int main() { 
// 60. ���� ���� �κ����� (DFS) 
/* N���� ���ҷ� ������ �ڿ��� ������ �־�����, �� ������ �� ���� �κ��������� �������� ��
   �� �κ������� ������ ���� ���� ���� ��찡 �����ϸ� YES�� ����ϰ�, �׷��� ������ NO�� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/ 
	printf("������ ������ �Է��ϼ���:");
	scanf("%d",&n);
	total=0;
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);
		total+= a[i];
	}
	DFS(1,0);
	if(flag==1) printf("YES \n");
	if(flag==0) printf("No \n");
	return 0;
 
}
