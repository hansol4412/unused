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

	for(int i=1;i<n;i++){
		int temp = a[i];
		int j;
		for(j=i-1;j>=0; j--){
			if(a[j]>temp)a[j+1]=a[j];
			else break;
		}
		a[j+1]=temp;
		
	} 
	
	for(int i=0; i<n; i++){
		printf("%d  ", a[i]);
	}
		
	
	 
	return 0;

}
