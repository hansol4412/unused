#include <stdio.h>

// ������� ��   
// �ڿ��� N�� �־����� �ڿ��� N�� ������� ���� ���İ� �Բ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 
int main() {
	int n;
	int sum=1;
	scanf("%d", &n);
	printf("%d", 1);
	for(int i = 2; i<n; i++){
		if(n%i==0){
			sum+=i;
			printf(" + %d", i);	
		}
	}
	printf(" = %d", sum);
	
	return 0;
}
