#include <stdio.h> 
#include <vector>
#include <algorithm>
using namespace std;
// 42. �̺а˻�
/* ������ N���� ���ڰ� �з����� �־�����, N���� ���� ������������ ������ ���� N���� �� ��
�� ���� ���� key�� �־����� �̺а˻����� key�� ���ĵ� ���¿��� ���° �ִ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ� */
int main() {   
	printf("�迭�� ũ�⸦ �Է��ϼ���.:");
		int n;
		scanf("%d",&n);
	printf("ã������ key�� �Է��ϼ���.:");
		int key;
		scanf("%d",&key);
	vector<int> a;
	int tmp;
		for(int i=0; i<n; i++) {
			scanf("%d",&tmp);
			a.push_back(tmp);
		}
	sort(a.begin(),a.end());
	
	int left=0;
	int right=n-1;
	while(left<=right){
		int mid = (left+right)/2;
		if(key==a[mid]){
			printf("ã�� ���� a[%d]�� �ֽ��ϴ�. \n",mid);
			break;
		}
		else if(key>a[mid]) left=mid+1;
		else right=mid-1;
		
	} 
	
	
	 
	return 0;

}
