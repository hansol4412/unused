#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int main() { 
//73. �ִ�����  (�켱���� ť)
/* �ִ������� ��������Ʈ���� ������ �ڷᱸ��, �θ� ��尪�� �����ڽĿ� ������ �ڽĳ����
   �� ���� ũ�� Ʈ���� ����. ��Ʈ����� ���� ���� ū ���� ��ġ�Ѵ�.
   1) �ڿ����� �ԷµǸ� �ִ�������  �Է��Ѵ�.
   2) ���� 0�� �ԷµǸ� �ִ� �������� �ִ��� ���� ����Ѵ�.
   3) -1�� �ԷµǸ� ���α׷��� �����Ѵ�.  
*/ 
	priority_queue<int> pq;
	
	while(1){
		int n;
		scanf("%d",&n);
		if(n==0){
			if(pq.empty()){
				printf("-1\n");
				break;	
			}
			printf("�ִ�����:%d \n",pq.top());
			pq.pop(); 
		}
		if(n==-1){
			break;
		}
		else{
			pq.push(n);
		}
	} 
	
	return 0;
  
}
