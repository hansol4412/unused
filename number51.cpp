#include <stdio.h>
int a[700][700];
int dy[700][700];
int main() { 
//51. ���� ���� (large)
/* ���� �������� ���� �ϻ��ϱ�� �ߴ�. ��ü ������ ������ ������ ������ �����ִµ� ������ ������ ������ �����Ѵ�.
	���� �ϻ� ���� ���� ���ο� ���ΰ� �������� ������ ������ �ִ밡 �Ǵ� ���� �����Ͽ� ������ ������ ������ ����϶�.*/
	int tc, tr, hc, hr;
	printf("��ü ������ ����:");
	scanf("%d",&tc);
	printf("��ü ������ ����:");
	scanf("%d",&tr);
		
		for(int i =1; i<=tc; i++) { 
			for(int j =1; j<=tr; j++) {
			scanf("%d",&a[i][j]);
			dy[i][j]= dy[i-1][j]+dy[i][j-1]-dy[i-1][j-1]+ a[i][j];
			}
		} 
	
		printf("�ϻ� ���� ������ ����:");
		scanf("%d",&hc);
		printf("�ϻ� ���� ������ ����:");
		scanf("%d",&hr);
		
		int max=0;
		int sum =0;
		
		for(int i=hc; i<=tc; i++){
			for(int j=hr; j<=tr; j++){
				sum=dy[i][j]-dy[i-hc][j]-dy[i][j-hr]+dy[i-hc][j-hr];
				if(sum>max)max=sum;
			}
		}
		
		printf("�ϻ� ���� ���� ������ ������? %d \n",max );
	return 0;

}
