#include <stdio.h> 
#include <algorithm>
using namespace std;
// 44. ������ ���ϱ� (�̺а˻� ����)
/* N���� �������� M������ ���� �ֽ��ϴ�. ������ ���� �Ѹ����� ���� �־� ��ġ���� �� ���� ����� �� ���� �Ÿ���
	�ִ밡 �Ǵ� ���� ����Ͻÿ�*/
int n;
int count(int mid,int a[]){
	int cnt =1;
	int pos =a[0];
	for(int i=1; i<n; i++){
		if(a[i]-pos>=mid){
			cnt++;
			pos=a[i];
		}
	}
	return cnt;
}
	
	
int main() {   
	int result=0;
	printf("�������� ������ �Է��ϼ��� :");
		scanf("%d",&n);
		int a[n];
	printf("���� ������ �Է��ϼ��� :");
		int m; 
		scanf("%d",&m);
	for(int i=0; i<n; i++){
		scanf("%d", &a[i]);
	}
	sort(a,a+n);
	
	int left=0; 
	int right =a[n-1];
	while(left<=right){
		int mid = (left+right)/2;
		if(count(mid,a)>=m ){
			left=mid+1;
			result=mid;
		}
		else{
		right=mid-1;
		}
	}
	
	 
	 printf("%d \n",result);
	return 0;

}
