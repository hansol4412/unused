#include <stdio.h> 
// 41. ���ӵ� �ڿ����� ��
// ���� ������ �ԷµǸ� 2�� �̻��� ���ӵ� �ڿ����� ������ ���� N�� ǥ���ϴ� ����� �������� ����ϴ� ���α׷��� �ۼ��մϴ�.
int main() {
	int n;
	printf("���� ������ �Է��ϼ���: ");
	scanf("%d",&n); 
	int temp = n;
	int b=2;
	int cnt=0;
	
	while(n>0){
		int sum=0;
		for(int i=1; i<=b; i++){
			sum+=i;	
		}
		if((n-sum)%b==0){
		int x= (n-sum)/b;
			for(int i=1; i<b; i++){
				printf("%d + ",x+i);
			}	
			printf("%d = %d \n",x+b,temp);
			cnt++;
		}
		b++;
		if((n-sum)/b<=0) break;
	}
	printf("%d��\n",cnt);
	
	
	 
	return 0;

}
