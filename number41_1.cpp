#include <stdio.h> 
// 41_1. ���ӵ� �ڿ����� ��
// ���� ������ �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��մϴ�.
int main() {
	int n;
	printf("���� ������ �Է��ϼ���: ");
	scanf("%d",&n); 
	int temp = n;
	int a=2;
	int cnt=0;
	n--;
	while(n>0){
		n=n-a;
		if(n%a==0){
			for(int i = 1; i<a; i++){
				printf("%d + ",n/a+i);
			}
			printf("%d = %d \n",n/a+a,temp);
			cnt++;
		}
		a++;
	}
	printf("%d��\n",cnt);
	
	
	 
	return 0;

}
