#include <stdio.h> 
// 31_1. źȭ���� ����
// ź��(C)�� ����(H)�� �̷���� źȭ���ҿ��� ź�Ҵ� �� ���� 12g, ���Ҵ� �� ���� 1g�̴�. źȭ���ҽĿ��� ������ ���϶�
// cf) C1H4�� ���� CH4��� �Է��ϰ� ����Ѵ�.

int main() {

		 char ch[10];
		 int c = 0;
		 int h = 0; 
		 int position = 0;
		 printf("���� �Է��Ͻÿ�:");
		 scanf("%s",&ch);
		 if(ch[1]=='H') {
			 c=1;
			 position = 1;
		 }
		 else {
			 for(int i=1; ch[i]!='H'; i++) {
				 c=10*c + (ch[i]-'0');
				 position=i+1;
			 }
			 
		 }
		 
		 if(ch[position+1]=='\0') h=1;
		 else {
			 for(int i = position+1; ch[i]!='\0'; i++) {
				 h=10*h+ (ch[i]-'0');
			 }
		 }
		 printf("C�� ����: %d\n",c);
		 printf("H�� ����:%d\n",h);
		 int sum = c*12+h;
		 printf("źȭ���� ������ %dg�̴�.\n",sum);
	return 0;

}
