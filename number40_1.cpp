#include <stdio.h> 
#include <vector>
#include <algorithm>
using namespace std;
// 40_1. ������ (������Ʈ �˰���)
// �� ���� A, B�� �־�����  �� ������ �������� ����ϴ� ���α׷��� �ۼ��ϼ���.
//�������� ������������ �����Ͻÿ�. 
int main() {
	int n;
	printf("ù��° �迭�� ũ�⸦ �Է��ϼ���.: ");
	scanf("%d",&n); 
	vector<int> a(n);
	for(int i=0; i<n; i++){
		scanf("%d",&a[i]);	
	}
	sort(a.begin(), a.end());
	 
	int m;
	printf("�ι�° �迭�� ũ�⸦ �Է��ϼ���.: ");
	scanf("%d",&m); 
	vector<int> b(m);
	for(int i=0; i<m; i++){
		scanf("%d",&b[i]);	
	}
	sort(b.begin(), b.end());
	
	vector<int> c(n<m?n:m);
	int p1=0, p2=0, p3=0;

		while(p1<n && p2<m){
			if(a[p1]==b[p2]){
				c[p3++]=a[p1++];
				p2++;
			}
			else if(a[p1]<b[p2]){
				p1++;
			}
			else{
				p2++;
			}
		}
	
	for(int i=0; i<p3; i++){
		printf("%d  ", c[i]);
	}
	
	
	 
	return 0;

}
