#include <stdio.h> 
// 32. ��������
// N���� ���ڰ� �ԷµǸ� ������������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��ϼ���.
// ���� ���� ���� ã�� �տ��� ���� �����Ѵ�. 

int main() {
	int n;
	printf("�Է��� ���� ������ �Է��ϼ���: ");
	scanf("%d",&n);
	int a[n];
	for(int i=0; i<n; i++){
	scanf("%d",&a[i]);	
	}
	int idx;
	for(int i=0; i<n; i++){
		idx =i;
		for(int j=i+1; j<n; j++){
			if(a[idx]>a[j]) idx= j;	
		}
		int temp = a[i];
		a[i]=a[idx];
		a[idx]=temp;
	}
	
	for(int i=0; i<n; i++){
		printf("%d ",a[i]);
	}
		
	
	 
	return 0;

}
