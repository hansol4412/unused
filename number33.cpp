#include <stdio.h> 
// 33.3���� ������
// N���� ���а����� �־����� �� �� 3���� ���м����� ����ϴ� ���α׷��� �ۼ��ϼ���.
// ���� 100���� 3��, 99���� 2��, 98���� 5���̸� 1���� 3��, 2���� 2�� 3���� 3������ ��������.  

int main() {
	int n;
	printf("�л��� ���� �Է��ϼ���: ");
	scanf("%d",&n);
	int a[n];
	for(int i=0; i<n; i++){
	scanf("%d",&a[i]);	
	}
	int idx;
	for(int i=0; i<n; i++){
		idx =i;
		for(int j=i+1; j<n; j++){
			if(a[idx]<a[j]) idx= j;	
		}
		int temp = a[i];
		a[i]=a[idx];
		a[idx]=temp;
	}
	
	int cnt=1;
	for(int i=1; i<n; i++){
		if(a[i-1]!=a[i])cnt++;
		if(cnt==3){
			printf("3���� ������ %d�̴�\n",a[i]);
		}
	}
		
	
	 
	return 0;

}
