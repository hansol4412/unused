#include <stdio.h> 
// 38. Inversion Sequence
/* 1���� N���� ���� �� ������ ����Ͽ� �̷���� ������ ���� ��, 1���� N���� ������ �� �տ� ���� �ִ� �� �߿���
	�ڽź��� ū �� ���� ������ ������ ǥ�h�ϴ� ���� inversion sequence��� �Ѵ�. */
// ������ inversion sequence�� �־����� ��, ������ ������ ����ϴ� ���α׷��� �ۼ��ϼ���. 
int b[20];
int main() {
	int n;
	int pos;
	printf("���� �Է��ϼ���: ");
	scanf("%d",&n); 
	int a[n+1];
	for(int i=1; i<=n; i++){
		scanf("%d",&a[i]);	
	}

	for(int i =n; i>=1;i--){
		pos = i;
		for(int j=1;j<=a[i];j++){
			b[pos]= b[pos+1];
			pos++;
		}
		b[pos]=i;
	}
	
	
	for(int i=1; i<=n; i++){
		printf("%d  ", b[i]);
	}
	
	
	 
	return 0;

}
