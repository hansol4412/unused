#include <stdio.h> 

// 11. ������ �� ����(large)
// �ڿ��� N�� �ԷµǸ� 1���� N������ �ڿ����� ���̿� ���� �� �� ���ڴ� ��� ���̴��� ���α׷��� �ۼ��Ͻÿ�.
// ���� ��� 1���� 15������ 1,2,3,4,5,6,7,8,9,1,0,1,1,1,2,1,3,1,4,1,5�� 21���� ���ڰ� ������.

int main() {
	printf("���� �Է��Ͻÿ�:");
	int n;
	scanf("%d",&n);
	int sum=0;
	int digit=9;
	int res=0;
	int cnt=1;
	while(sum+digit<n){
		sum=sum+digit;
		res=res+(digit*cnt);
		cnt++;
		digit=digit*10;
	}
	res= res+(n-sum)*cnt;
	printf("���� ������ �� ������ %d �� �Դϴ�.\n",res);
	
	
	return 0;
}
