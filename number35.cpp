#include <stdio.h> 
// 35. Special Sort(����)
// N���� ������ �ԷµǸ� ���� ������ ���� ������ ���� ���ڵ��� ���� ������ �������� ���� ������ ���������� ������
//�Էµ� ���� ���� ������ �������� ������ ����� �Ѵ�..  

int main() {
	int n;
	printf("���� �Է��ϼ���: ");
	scanf("%d",&n); 
	int a[n];
	for(int i=0; i<n; i++){
	scanf("%d",&a[i]);	
	}

	for(int i=0; i<n-1;i++){
		for(int j=0; j<n-i-1; j++){
			if(a[j]>0&&a[j+1]<0){
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				
			}
		}
	} 
	
	for(int i=0; i<n; i++){
		printf("%d  ", a[i]);
	}
		
	
	 
	return 0;

}
