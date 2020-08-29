#include <stdio.h>
int a[100];
int DFS(int n,int x){
	if(x>n) {
			for(int i =1; i<=n; i++) {
				if (a[i]==1)printf("%d ",i);
			}
			printf("\n");
		}
		else {
			a[x]=1;
			DFS(n, x+1);
			a[x]=0;
			DFS(n, x+1);
		}
}
int main() { 
// 59. 부분집합 (DFS)
// 자연수 n이 주어지면 1부터 n까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램을 작성하시오.
// 재귀에 이용한 완전탐색을 하며, 이진트리 전위 순회 방식으로 출력한다. 
	int n;
	printf("n을 입력하세요:");
	scanf("%d",&n);
	DFS(n,1);
	return 0;
 
}
