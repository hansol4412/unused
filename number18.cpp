#include <stdio.h> 
// 18. ��������
/*����Ʈ�� �� ������ ����ġ�� m���� ������ ���� ȣ���� ���� �溸���� ������ ����Ϳ� �︰��
�� ������ n�� ������ �ǽð� ����ġ�� �־����� �ִ� �������� �溸���� �︰ �ð��� �����̼�.
�溸���� ������ -1�� ��µȴ�.*/

int main() {
		int n, m, num;
		int cnt=0;
		int max=0;
		scanf("%d %d", &n, &m);
		for(int i=1; i<=n; i++){
			scanf("%d",&num);
			if(num>m){
				cnt++;
				if(cnt>max)max=cnt;
			}
			else{
				cnt=0;
			}
		}
		printf("%d \n",max);
	
	return 0;
}
