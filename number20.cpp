#include <stdio.h> 
// 20. ���� ���� ��
// �� n���� ���� ���� �� ������ �Ͽ� A�� �̱�� A�� ����ϰ� B�� �̱�� B�� ����ϰ� ���� D�� ����Ѵ�
// 1:����  2:����   3:��

int main() {
	int n;
	printf("�� ���� ������ ������ ���ΰ�?:");
	scanf("%d",&n);
	int a[n];
	int b[n];
	int cna=0;
	int cnb=0;
	for (int i =0; i<n; i++) {
			scanf("%d %d",&a[i],&b[i]);
			if(a[i]==b[i]) printf("D \n");
			else if(a[i]==2 && b[i]==1) {printf("A \n"); cna++;}
			else if(a[i]==3 && b[i]==2) {printf("A \n"); cna++;}
			else if(a[i]==1 && b[i]==3) {printf("A \n"); cna++;}
			else { printf("B \n"); cnb++;}
		}
		if(cna>cnb)printf("���� ���ڴ� A�Դϴ�.\n");
		else if(cna<cnb)printf("���� ���ڴ� B�Դϴ�.\n");
		else printf("���� �����ϴ�.\n");
	return 0;
}
