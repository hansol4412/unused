#include <stdio.h> 

// �ڸ����� ��
/* 	N���� �ڿ����� �Էµ��� �� �ڿ����� �ڸ����� ���� ���ϰ� �� ���� �ֵ��� �ڿ����� 
	����ϴ� ���α׷��� �ۼ��Ͻÿ�.
	�ڸ����� ���� �ִ��� �ڿ����� �������� ��� �� �� ���� ���� ū ���� ����Ͻÿ�.*/
// int digit_sum(int x)�� �޼ҵ带 ����Ͽ� ���α׷����Ͻÿ�.. 

int digit_sum(int n) {
		int sum=0;
		while(n>0) {
			int res = n%10;
			sum+=res;
			n = n/10;
		}
		return sum;
	}
int main() {
	int max=0;
	int sum=0;
	int maxN=0;
	int n;
	int num;
		scanf("%d",&n);
		
		for(int i = 0; i<n; i++) {
			scanf("%d",&num);
			sum =  digit_sum(num);	
			
			if(max<sum) {
				max = sum;
				maxN = num;
			}
			else if(max==sum) {
				if(maxN < num) maxN=num;
			}
		}
		printf("%d \n",maxN);
	
	
	return 0;
}
