#include <stdio.h> 
// 17. ������ ����
/* �л��� n�� �ֽ��ϴ�. �������� �� �л��鿡�� ���ڰ� ���� ī�带 �ְ�, �л����� 1���� �ڱ� ī����� ���� ���մϴ�.
   �л����� �Է��� ���� ������ YES Ʋ���� NO�� ����Ͻÿ� */

int main() {
		int n;
		int teacher, student;
		int sum;
		scanf("%d",&n);
		for(int i= 1; i<=n; i++){
			scanf("%d %d",&teacher, &student);
			sum=0;
			for(int j =1; j<=teacher; j++){
				sum=sum+j;
			}
			if(sum==student)printf("YES \n");
			else printf("NO \n");
			
		}
	
	return 0;
}
