#include <stdio.h>
#include <vector>
#include <algorithm> 
using namespace std;
vector<int> map[10]; //vector�� ���� ����� �������� �޾Ƶ帮�� 
int Q[100];
int front=-1;
int back=-1;
int ch[100]; //main�� ���ǽ� �ǹٸ� ��� ������x 
int main() { 
// 69. ����Ʈ�� ���� �켱Ž��(BFS)
// �迭�� �̿��Ͽ� ť �ڷᱸ�� ��Ÿ���� 
	int n;
	printf("����� ���� �Է��ϼ���:");
	scanf("%d",&n); 
	int a;
 	int b;
 	for(int i =1; i<=n; i++){
		scanf("%d %d",&a,&b);
		map[a].push_back(b);
	 } 

	 Q[++back]=1; //������ �ο� 
	 ch[1]=1;  //���� ���� Ȯ��
	 int x; 
	 while(front<back){
	 	x=Q[++front];
	 	printf("%d ",x); //���� 
	 	for(int i=0; i<map[x].size(); i++){
	 		if(ch[map[x][i]]==0){
	 			ch[map[x][i]]=1;
	 			Q[++back]=map[x][i]; // �ֱ�  
			 }
		 }
	 } 
	return 0;
  
}
