#include <stdio.h> 

// 14. ������ �Ҽ�
// N���� �ڿ����� �ԷµǸ� �� �ڿ����� ������ ���� �Ҽ��̸� �� ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ������ �޼ҵ��� int reverse(int x)�� �Ҽ��� Ȯ���ϴ� �޼ҵ� boolean isPrime(int x)�� �ۼ��Ͻÿ�.
int reverse(int x) {
		int a;
		int t=0;
		while(x>0) {
			a=x%10;
			t=t*10+a;
			x=x/10;
		}
		return t;
	}
	
bool isPrime(int x) {
		if(x==1) return false;
		bool flag= true;
				for(int j =2; j<x; j++) {
					if(x%j==0) {
						flag= false;
						break;
					}
				}
				return flag;
	}
int main() {
	int n;
	int num;
	int tmp;
		scanf("%d",&n);
		for(int i=0; i<=n; i++) {
			scanf("%d",&num);
			tmp = reverse(num);
			if(isPrime(tmp)) {
				printf("%d ", tmp);
			}
		}
	
	
	return 0;
}
