#include <stdio.h>

int main() { 
// 52. ugly number 
// � ���� ���μ� ���� ���� �� �� ���μ��� 2 �Ǵ� 3 �Ǵ� 5�θ� �̷���� ���� ugly number��� �θ��ϴ�.
// ���� 1�� ugly number�� ù��° �� �Դϴ�.
// �ڿ��� N�� �־����� ugly number�� ���ʷ� ���� �� N��° ugly number�� ����Ͻÿ�.
	int n;
	printf("���° ugly number�� ����Ͻʴϱ�?");
	scanf("%d",&n);
	int a[n+1];
	a[1]=1;
	int p2 =1;
	int p3 =1;
	int p5 =1;
	int min =0;
	
	for(int i=2; i<=n; i++){
		if(2*a[p2]<=3*a[p3])min=2*a[p2];
		else min= 3*a[p3];
		if(5*a[p5]<min) min = 5*a[p5];
		if(min==2*a[p2])p2++;
		if(min==3*a[p3])p3++;
		if(min==5*a[p5])p5++;
		a[i]=min;
	}
	
	printf("%d��° ugly number�� %d�Դϴ�.\n",n,a[n]);
	
	return 0;

}
