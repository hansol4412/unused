#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int main() { 
//74. �ּ�����  (�켱���� ť)
/* �ּ������� ��������Ʈ���� ������ �ڷᱸ��, �θ� ��尪�� �����ڽĿ� ������ �ڽĳ����
   �� ���� �۰� Ʈ���� ����. ��Ʈ����� ���� ���� ���� ���� ��ġ�Ѵ�.
   1) �ڿ����� �ԷµǸ� �ּ�������  �Է��Ѵ�.
   2) ���� 0�� �ԷµǸ� �ּ� �������� �ּڰ��� ���� ����Ѵ�.
   3) -1�� �ԷµǸ� ���α׷��� �����Ѵ�.   
*/ 

	priority_queue<int> pq;
	int n;
	while(1){
		scanf("%d",&n);
		if(n==-1){
			break;
		}
		if(n==0){
			if(pq.empty()){
				printf("-1\n");
				break;	
			}
			printf("�ּ�����:%d \n",-pq.top());
			pq.pop(); 
		}
		else{
			pq.push(-n);
		}
	} 
	
	return 0;
  
}
