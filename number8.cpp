#include <stdio.h> 

// �ùٸ� ��ȣ  
/* ��ȣ�� �ԷµǸ� �ùٸ� ��ȣ�̸� 'YES' �ùٸ��� ���� ��ȣ�̸� 'NO'�� ����Ѵ�. */ 
 
int main() {
	char a[100];
	int p=0;
	gets(a);
		for(int i=0; a[i]!='\0'; i++){
			if(a[i]=='(')p++;
			if(a[i]==')')p--;	
		}
		if(p==0)printf("YES");
		else printf("NO");
	
	return 0;
}
