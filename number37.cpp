#include <stdio.h> 
// 37. Least Recently Used (īī�� ĳ�� ���� ����)
// ĳ�ø޸𸮴� LRU �˰��� ��, ���� �������� ������� �ʴ� ���� �����ϴ� �˰����� ����Ѵ�. 
// Cache Miss : �ؾ��� �۾��� ĳ�ÿ� ���� ���·� ��� �۾��� �ڷ� �и��� ���ο� �۾��� �տ� �߰� �ȴ�.
// Cache Hit : �ؾ��� �۾��� ĳ�ÿ� �ִ� ���·� ����ؾ� �ϴ� �۾� �տ� �ִ� �۾��� �ڷ� �и��� ����ϴ� �۾��� �� ������ �´�
// ĳ�� ũ��� �۾����� �Է��ϰ� ĳ�ø޸��� �۾� ������ ����Ͻÿ�..  
int m[20];
int main() {
	int memory;
	scanf("%d",&memory);
	int work;
	scanf("%d",&work);
	int w[work];
	for(int i=0; i<work; i++){
		scanf("%d",&w[i]);
	}	
	
	for(int i=0; i<work; i++){
		int pos=-1;
		for(int j=0; j<=memory; j++){
			if(w[i]==m[j]) pos =j;
		}
		if(pos==-1){
			for(int t=memory-1; t>=1; t--){
				m[t]=m[t-1];	
			}	
			m[0]= w[i];
		}
		else{
			for(int t=pos; t>=1; t--){
				m[t]= m[t-1];
			
			}
				m[0]=w[i];
			
		}
		
		for(int i=0; i<memory; i++){
			printf("%d ",m[i]);
		}
		printf("\n");
	}
	
	
	 
	return 0;

}
