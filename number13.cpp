#include <stdio.h> 

// 13. ���� ���� ���� �ڸ���
// N�ڸ��� �ڿ����� �ԷµǸ� �ڿ����� �ڸ��� �� ���� ���� ���� ���ڸ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ���� ���� ���� ��� �� �߿��� ���� ū ���� ����Ͻÿ�. 
int n[10];
int main() {
	
	char a[100];
	printf("���ڸ� �Է��Ͻÿ�:");
	
	scanf("%s",&a);
		
		
		for (int i = 0; a[i]!='\0'; i++) {
			int num = a[i]-48;
		    n[num]++;
		}
		
		
		int max = 0;
		int numMax = 0;
		for(int j= 0; j<=9; j++ )
		{
			if(n[j]>max) {
				max=n[j];
				numMax=j;
			}
			else if(n[j]==max) {
				if(numMax<j) numMax=j;
			}
		}
		
		printf("���� ���� ����� ���� %d�Դϴ�.\n",numMax);
	
	
	return 0;
}
