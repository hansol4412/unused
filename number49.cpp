#include <stdio.h>
int main() { 
// 49. ����� �ִ�
// ����� ���鿡�� �� �ܸ�� ������ ���鿡�� �� �ܸ��� �ְ� �ִ� ��ϰ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
	int n;
	printf("N*N�� �������� N�� ���� �Է��ϼ���.");
	scanf("%d", &n);
	int a[2][n];
	int b[n][n];
	
	printf("������ ���:");
	for(int i=0; i<n; i++){
		scanf("%d",&a[0][i]); 
	}
	printf("������ ������  ���:");
	for(int i=0; i<n; i++){
		scanf("%d",&a[1][i]); 
	}
	
	for(int i=0; i<n; i++){
		int temp = a[0][i];
		for(int j=0; j<n; j++){
			b[j][i]= temp;
		}
	}
	
	for(int i=0; i<n; i++){
		int temp2 = a[1][i];
		for(int j=0; j<n; j++){
			if(b[n-i-1][j]>temp2){
				b[n-i-1][j]=temp2;	
			}
		}
	}
	
	for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				printf("%d ",b[i][j]);
			}
			printf("\n");
		}
		
	int sum=0;
		for(int i=0; i<n; i++){
			for(int j=0; j<n; j++){
				sum+=b[i][j];
			}
				
		}
	
	printf("����� �ִ� ������ %d �̴� \n",sum);
		
	return 0;

}
