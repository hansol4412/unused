#include <stdio.h>
#include <math.h> 
int main() { 
// 48. �� ���� ��հ� ���� ����� ��
/* 9X9 �����ǿ� ������ 81���� �ڿ����� �־��� ��, �� ���� ����� ���ϰ� �� ��հ� ���� ����� ���� ����ϴ� ���α׷��� �ۼ��ϼ���.
����� �Ҽ��� ù �� �ڸ����� �ݿø��մϴ�. ����� ���� �� �� �̸� �� �� ū ���� ����ϼ���.*/ 
	int a[9][9];
	for(int i =0; i<9; i++){
		int sum=0;
		for(int j=0; j<9 ; j++){
			scanf("%d",&a[i][j]);
			sum+=a[i][j];
		}
		int avg=round(sum/9.0);
		int min=100;
		int store=-100;
		for(int j=0; j<9;j++){
			if(abs(avg-a[i][j])<min){
				min=abs(avg-a[i][j]);
				store=a[i][j];
			}
			else if(abs(avg-a[i][j])==min){
				if(a[i][j]>store){
					 store=a[i][j];
				}
					min=abs(avg-a[i][j]);
			}
			
		}
		printf("���:%d  ��տ� ����� ��:%d\n",avg, store);
		
		
	}
		
	return 0;

}
