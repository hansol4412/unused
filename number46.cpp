#include <stdio.h> 
// 46. ��Ƽ �½�ŷ
/*  ��Ƽ�½�ŷ�� ������ ��ǻ�ʹ� 1�� �۾����� ������� 1�ʾ� �۾��Ѵ�.
	�۾� ���� N���� �׿� ���� �۾� �ð��� �Է��� �� M�� �� ������ �Դ�. ���� �� � �۾��� �ؾ��ϴ� �� ����Ͻÿ�.
	�� �̻� �۾��ؾ� �� �۾��� ������ -1�� ����Ͻÿ�. */
	
int main() {  
	int n;
	printf("�۾��� ������ �Է��ϼ���:");
		scanf("%d",&n);
		int a[n+1];
		int sum=0;
		for(int i=1; i<=n ; i++){
			scanf("%d",&a[i]);
			sum+=a[i];
		}
	printf("�� �� �Ŀ� ������ �Ͼ�°�?:");
		int m; 
		scanf("%d",&m);
	
	if(m>=sum){
		printf("-1\n");
		return 0;
	}
	
	//���� ���� �� �۾�  
	int cnt = 0;
	int p = 0;
	
	while(true){
		p++;
		if(p>n)p=1; 
		if(a[p]==0)continue;
		a[p]--;
		
		cnt++;
		if(cnt==m)break;
	}
	
	// ���� �� �۾� ã�� 
	while(true){
		p++;
		if(p>n)p=1;
		if(a[p]!=0){
			printf("%d \n",p);
			break;
		}
	} 
	
	
	
	
	
	
	

	return 0;

}
