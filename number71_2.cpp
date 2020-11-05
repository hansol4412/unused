#include <stdio.h>
#include <vector>
#include <queue>
#include <algorithm> 
using namespace std;
int ch[100];
int main() { 
// 71. �۾��� ã�� (BFS : ����Ʈ��Ž��) 
/* ������ �۾����� �Ҿ���ȴ�.�۾������� ��ġ�����Ⱑ �޷��ִ�. ������ ��ġ��
   �۾����� ��ġ�� �������� ��ǥ ������ �־����� ������ ���� ��ġ���� �۾�����
   ��ġ���� ������ ���� ������� �̵��Ѵ�.
   ������ ��ī�� ������ Ÿ�� ���µ� �� ���� ������ ������ 1, �ڷ� 1, ������ 5��
   �̵��� �� �ִ�. �ּ� ����� ������ ������ �۾��� ��ġ���� �� �� �ִ���
   ���ϴ� ���α׷��� �ۼ��Ͻÿ�. */
// Queue�� ����� �ۼ��Ͽ���. 
	int s;
	printf("������ ��ġ�� �Է��Ͽ���:");
	scanf("%d",&s);
	int e;
	printf("�۾����� ��ġ�� �Է��Ͽ���:");
	scanf("%d",&e); 
	
	int dis[3]={1,-1,5}; //������ �̵������� ��� 
	queue<int> Q;
	Q.push(s); 
	 ch[s]=1;  
	 while(!Q.empty()){
	 	int x=Q.front();
	 	Q.pop();
	 	for(int i=0; i<3; i++){
	 		int pos = x + dis[i];
	 		if(pos<1 || pos>100) continue;
	 		if(pos==e){
	 			 printf("�۾����� ã�� ���� �ּ� %d�� ������ �ؾ��Ѵ�,\n",ch[x]); 
	 			 return 0;
			 }
			if(ch[pos]==0){
				Q.push(pos);
				ch[pos]=ch[x]+1; // �ּ����� ����ϱ� 
			}
		 }
	 } 
	return 0;
  
}
