#include <stdio.h> 

// 15. �Ҽ��� ����
// �ڿ��� N�� �ԷµǸ� 1���� N������ �Ҽ��� ������ ����ϴ� ���α׷��� �ۼ��Ͻÿ�.

int main() {
	int n;
	scanf("%d",&n);
	int flag, cnt=0;
	
	for(int i=2; i<=n; i++){
		flag=1;
		for(int j =2; j*j<=i; j++){
			if(i%j==0){
				flag=0;
				break;
			}
		}
		if(flag==1)cnt++;
	}
	
	printf("%d",cnt);
	
	return 0;
}
