#include <stdio.h> 
// 31. źȭ���� ����
// ź��(C)�� ����(H)�� �̷���� źȭ���ҿ��� ź�Ҵ� �� ���� 12g, ���Ҵ� �� ���� 1g�̴�. źȭ���ҽĿ��� ������ ���϶�
// cf) C1H4�� ���� CH4��� �Է��ϰ� ����Ѵ�.

int main() {

	char ch[10];
	scanf("%s",&ch);
	
 		int c=12;
		int h=1;
		 for(int j =0; j<=3; j++) {
			 if(ch[j]==67 ||ch[j]==99) {
				 if(ch[j+1]<48 ||ch[j+1]>57) c=c*1; 
				 else c= c*(ch[j+1]-48);
			 }
			 if(ch[j]==72 ||ch[j]==104) {
				 if(ch[j+1]<48 ||ch[j+1]>57) h=h*1;
				 else h= h*(ch[j+1]-48);	 
			 }
		 }
		 
		 int sum= c+h;
	printf("%d\n",sum);
			 
	return 0;

}
