#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int main() { 
// 72. ���� ���ϱ�(ť �ڷᱸ���� �ذ�) 
/* N���� ���ڰ� �ð� �������� ���׶��� �ɰ� 1�� ���ں��� 1���� �����ϸ� ��ȣ�� ��ģ��.
�� ���ڰ� Ư�� ���� M�� ��ġ�� �� ���ڴ� ���ָ� ���Ϸ� ���µ��� ���ܵȴ�. ���������� ��� ���� ������ ��ȣ�� ����϶� */
	int n;
	printf("���� ���� �Է��Ͻÿ�:");
	scanf("%d",&n); 
	int m;
	printf("Ư�� ���� �Է��Ͻÿ�.:");
	scanf("%d",&m);
	queue<int> Q;
	for(int i=1; i<=n; i++){
		Q.push(i);
	} 
	while(!Q.empty()){
		for(int i=1; i<m; i++){
			Q.push(Q.front());
			Q.pop();
		}
		Q.pop();
		if(Q.size()==1){
			printf("���������� ���� ���ڴ� %d�̴�\n", Q.front());
			break;
		}
	}
	
	return 0;
  
}
