#include <stdio.h> 
// 27. N!�� ǥ����
// N!�� 1���� N������ ���� �ǹ��Ѵ�. ���� ��� N�� 5�̸� 5*4*3*2*1=120�̴�.
// ������ �Ҽ��� �̿��� ǥ���ϴ� ����� �ִ�   ���� ��� N�� 5�̸� 2^3*3*5�̴�. N�� �Է½� �� �Ҽ��� �̿��� Ƚ���� ����Ͻÿ�.
int a[100];
int main() {
	int n;
	scanf("%d",&n);
	
	for(int i=2; i<=n; i++){
		int temp =i; 
		int j =2;
		while(true){
			if(temp%j==0){
				a[j]++;	
				temp=temp/j;
			}
			else j++;
			if(temp==1)break;

		}
		
	}
	
	printf("%d!��\n",n);
	for(int i=2; i<=n; i++){
		if(a[i]!=0) printf("%d�� %d�� ����ߴ� \n",i,a[i]);
	}
	
	
	
	return 0;
}
