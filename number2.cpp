#include <stdio.h>

// �ڿ�����  ��  
// �ڿ��� A, B�� �־����� A���� B������ ���� ���İ� �ղ� ����Ͻÿ�. 
 
int main() {
	int a;
	int b;
	int sum=0;
	scanf("%d %d", &a, &b);
	for(int i=a; i<b; i++)
	{
		printf("%d + ",i);
		sum+=i;		 		
	}
	sum+= b;
	printf("%d = %d", b, sum);
	
	return 0;
}
