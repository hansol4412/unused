#include <stdio.h>
#include <stack>
using namespace std;
int main() { 
// 54. 올바른 괄호 (스택 클래스 사용)
// 괄호가 입력되면 올바른 괄호이면 'yes' 올바르지 않으면 'no'를 출력합니다.
	char a[50];
	scanf("%s",&a);
	stack<int> stk;
	int flag=0;
	
	for(int i=0; a[i]!='\0'; i++){
		if(a[i]=='('){
			stk.push(1);	
		}
		if(a[i]==')'){
			if(stk.empty()){
				printf("NO\n");
				flag=1;
				break;
			}
			else{
				stk.pop();
			}
		}
	
	}
	if(flag==0 && stk.empty()){
		printf("YES\n");
	}
	if(flag==0 && !stk.empty()){
		printf("NO");
	}
	
	return 0;

}
