#include <iostream>
using namespace std; 

// ���� ����  
/*  N���� ���̰� �Էµ˴ϴ�.�� N���� ��� �� ���� �������̰� ���� ���� ���� �������
 	�ִ� ���� ���̸� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.*/ 
 
int main() {
	//freopen("input.txt","rt",stdin);
	int n;
	int max=0;
	int min = 100;
	int age;
	cin>>n;
	for(int i =1; i<=n;i++){
		cin>>age;
		if(age>max)max= age;
		if(age<min)min= age;
	}
	cout<<max-min;
	
	return 0;
}
