#include <stdio.h> 
// 40. ������ (������Ʈ �˰���)
// �� ���� A, B�� �־�����  �� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//�������� ������������ �����Ͻÿ�. 
int c[20];
int main() {
	int n;
	printf("ù��° �迭�� ũ�⸦ �Է��ϼ���.: ");
	scanf("%d",&n); 
	int a[n];
	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);	
	}
	 
	int m;
	printf("�ι�° �迭�� ũ�⸦ �Է��ϼ���.: ");
	scanf("%d",&m); 
	int b[m];
	for(int i=0; i<m; i++){
		scanf("%d",&b[i]);	
	}
	
	int p3=0;

		for(int i=0; i<n; i++) {
			for(int j =0; j<m; j++) {
				if(a[i]==b[j]) {
					c[p3]=a[i];
					p3++;
				}
			}
		}
		
		for(int i=0; i<p3-1; i++) {
			int idx=i;
			for(int j =i+1; j<p3; j++ ) {
				if(c[j]<c[idx]) idx=j;
			}
			int temp = c[i];
			c[i]=c[idx];
			c[idx]=temp;
		}
	
	for(int i=0; i<p3; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
