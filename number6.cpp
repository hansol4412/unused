#include <stdio.h> 

// ���ڸ� ����  
/* ���ڿ� ���ڰ� �����ִ� ���ڿ��� �־����� �� �� ���ڸ� �����Ͽ� �� �������
	�ڿ����� ����ϴ�. �� �ڿ����� ����� ������ ����մϴ�.  */ 
 
int main() {
	char a[100];
	int res = 0 ;
	int cnt = 0;
	scanf("%s",&a);
	for(int i = 0; a[i]!='\0'; i++){
		if(a[i]>=48&&a[i]<=57){
			res = res*10+(a[i]-48);
		}
	}
	printf("�ڿ����� %d �Դϴ� \n",res);
	for(int j = 1; j<=res; j++){
		if(res%j==0)cnt++;
	}
	printf("����� �ڿ����� ����� ������ %d �Դϴ� \n",cnt);
	
	return 0;
}
