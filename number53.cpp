#include <stdio.h>
int ptr = -1;
int stack[10];
void push(int m){
	stack[++ptr]=m;
}

int pop(){
	return stack[ptr--];
}
int main() { 
// 53. K���� ��� (Stack Ŭ���� ���x)
/* 10���� n�� �ԷµǸ� m������ �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
   ���� �ڷᱸ���� ����Ͽ��� */
	int n; 
	printf("�����ϴ� ���� n�� �Է��ϼ���:");
	scanf("%d",&n);
	int m;
	printf("m������ �Է��ϼ���:");
	scanf("%d", &m);
	char str[20] ="0123456789ABCDEF"; 
	
	
	while(n>0){
		push(n%m);
		n= n/m;
	}
	
	while(ptr!=-1){
		printf("%c",str[pop()]);
	}
	return 0;

}
