#include <stdio.h> 
// 21. ī�����
/* 0���� 9���� ���ڰ� ���� ī�带 ������ ������ �Ѵ�. �� ����� ī�带 ���� �� ���� �� ū ���� ���� ����� �̱��.
�̰��� �� 3���� �ְ� ���� ���� ������ �ο����� �ʴ´�. ����� ���� 1���� �ο��Ѵ�
10���� ������ �ϰ� �� ����� ���� ���� �̱�  ����� ����Ͻÿ�.*/

int main() {
	int a[10];
	int b[10];
		printf("������ �����մϴ�.\n");
		for(int i= 0; i<10; i++) {
			scanf("%d",&a[i]);
		}
		for(int i= 0; i<10; i++) {
			scanf("%d",&b[i]);
		}
		int ant=0;
		int bnt=0;
		for(int j =0; j<10; j++) {
			if(a[j]==b[j]) {
				ant++;
				bnt++;
			}
			else if(a[j]>b[j]) ant += 3;
			else bnt += 3;
		}
		
		printf("A�� ����: %d  B�� ����: %d\n",ant,bnt);
		if(ant==bnt) printf("���� �����ϴ�\n");
		else if(ant>bnt) printf("A�� �̰���ϴ�.\n");
		else printf("B�� �̰���ϴ�.\n");
		
	
	return 0;
}
