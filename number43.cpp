#include <stdio.h> 
#include <algorithm>
using namespace std;
// 43. �������� (�̺а˻� ����)
/* ���ݿ� N���� ���� ���� �� ������ �״�� ������ ä�� DVD�� ��ȭ�Ϸ��� �Ѵ�. 
	���ۻ��� ������ M���� DVD�� ����ؼ� ������ �����Ϸ��Ѵ�. �߰��� ���� ©���� 2���� DVD�� ������ �����Ǹ� �ȵȴ�.
	�̶� �Ѱ��� DVD�� �ּ� ũ�� (�ּ� �ð�)�� ����Ͻÿ�.		 */
int n;
int a[100];
int count(int mid){
	int sum=0;
	int cnt=1;
	for(int i =0; i<n; i++){
		if(sum+a[i]>mid){
			cnt++;
			sum=a[i];
		}
		else{
			sum+=a[i];
		}
	}
	return cnt;
}
	
	
int main() {   
	int result=0;
	printf("�뷡�� ������ �Է��ϼ��� :");
		scanf("%d",&n);
	printf("DVD�� ������ �Է��ϼ���:");
		int m; 
		scanf("%d",&m);
	int sum=0;
	int max=0;
	for(int i=0; i<n; i++){
		scanf("%d", &a[i]);
		sum+=a[i];
		if(max<a[i])max=a[i];
	}
	
	int left=1; 
	int right =sum;
	while(left<=right){
		int mid = (left+right)/2;
		if(mid>=max && count(mid)<=m ){
			right= mid-1;
			result=mid;
		}
		else{
			left= mid+1;
		}
	}
	
	 
	 printf("%d \n",result);
	return 0;

}
