#include <stdio.h> 
#include <algorithm>
// 16. Anagram (���� ���ͺ� ����)
// �Ƴ��׷��̶� �� ���ڿ��� ���ĺ��� ���� ������ �ٸ����� �� ������ ��ġ�ϸ� �� �ܾ�� �Ƴ��׷��̶�� �Ѵ�
// �Ƴ��׷� �Ǻ��� ��ҹ��ڴ� �����ȴ�.
int ac[52], bc[52];
int main() {
		int num;
		char a[100];
		scanf("%s",&a);
		for(int i =0; a[i]!='\0';i++){
			num = a[i]-'A';
		    if(num>=32) {
		    	num=num-6;
		    }
		    ac[num]++;
		}
		
		char b[100];
		scanf("%s",&b);
		for(int i =0; b[i]!='\0';i++){
			num = b[i]-'A';
		    if(num>=32) {
		    	num=num-6;
		    }
		    bc[num]++;
		}
		
		for(int i=0; i<52; i++)
		{
			if(ac[i]!=bc[i]){
				printf("NO \n");
				exit(0);
			}
			
		}
		
		printf("YES \n");
	
	return 0;
}
