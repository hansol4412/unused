#include <stdio.h> 
//29. 3�� ���� (small)
//�ڿ��� n�� �ԷµǸ� 1���� n���� �ڿ����� ���̿� ���� �� �� ���� �� 3�� ������?
//ex) n�� 15�̸� 3�� 13�� ���ԵǾ� 2�̴�.

int main() {

	int n;
	scanf("%d",&n);
	int cnt=0;
		
		for(int i=1; i<=n; i++) { 
			int tmp=i;
			// for(int j=i;j>0;j=j/10) ->while�� ��� ���
			while(tmp>0) {
				if(tmp%10==3)cnt++;
				tmp=tmp/10;
			}
		}
		
		printf("%d\n",cnt);
	return 0;

}
