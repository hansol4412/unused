#include <iostream>

// 1���� N������ M�� �����
// �ڿ��� N�� �ԷµǸ� 1���� N������ ������� ����ϴ� ���α׷��� �ۼ��Ͻÿ�. 
 
using namespace std;
int main() {
	int n;
	int m;
	int sum=0;
	std::cin>>n>>m;
	for(int i=1; i<=n; i++)
	{
		if(i%m==0){
			sum += i;
		} 
			
	}
	std::cout<<sum;
	
	return 0;
}
