#include <stdio.h> 
#include <algorithm>
using namespace std;
// 45. ���� ���ϱ�
/* N���� ���ڰ� �ð� �������� ���׶��� �ɰ� 1�� ���ں��� 1���� �����ϸ� ��ȣ�� ��ģ��.
	�� ���ڰ� Ư�� ���� M�� ��ġ�� �� ���ڴ� ���ָ� ���Ϸ� ���µ��� ���ܵȴ�. ���������� ��� ���� ������ ��ȣ�� ����϶� */
	
int main() {  
	int n;
	printf("���� ���� �Է��Ͻÿ�:");
		scanf("%d",&n);
		int a[n+1];
		for(int i=1; i<=n ; i++){
			a[i]=0;
		}
	printf("Ư�� ���� �Է��Ͻÿ�:");
		int m; 
		scanf("%d",&m);
	
	int point=1;
	int cnt=0;
	int last=0;
	
	while(1){
		if(a[point]==0){
			cnt++;
			if(cnt==m){
				a[point]=1;
				cnt=0;
				last++;
			}
		}
		point++;
		if(point>n)point=1;
		if(last==n-1){
			break;
		}
	}
	
	for(int i=1; i<=n; i++){
		if(a[i]==0){
			printf("%d",i);
		}
	}

	return 0;

}
