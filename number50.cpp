#include <stdio.h>
int main() { 
//50. ���� ����
/* ���� �������� ���� �ϻ��ϱ�� �ߴ�. ��ü ������ ������ ������ ������ �����ִµ� ������ ������ ������ �����Ѵ�.
	���� �ϻ� ���� ���� ���ο� ���ΰ� �������� ������ ������ �ִ밡 �Ǵ� ���� �����Ͽ� ������ ������ ������ ����϶�.*/
	int tc, tr, hc, hr;
	printf("��ü ������ ����:");
	scanf("%d",&tc);
	printf("��ü ������ ����:");
	scanf("%d",&tr);
		int a[tc][tr];
		for(int i =0; i<tc; i++) { 
			for(int j =0; j<tr; j++) {
			scanf("%d",&a[i][j]);
			}
		} 
		
		printf("�ϻ� ���� ������ ����:");
		scanf("%d",&hc);
		printf("�ϻ� ���� ������ ����:");
		scanf("%d",&hr);
		
		int max=0;
		int sum;
		
		for(int i=0; i<=tc-hc; i++){
			for(int j=0; j<=tr-hr; j++){
				sum=0;
				for(int c=i; c<i+hc; c++){
					for(int r= j; r<j+hr; r++){
						sum+=a[c][r];
					}
				}
				if(sum>max)max=sum;
			}
		}
		
		printf("�ϻ� ���� ���� ������ ������? %d \n",max );
	return 0;

}
