#include <stdio.h> 
int a[10][10];
int dx[4]={-1, 0, 1, 0};
int dy[4]={0, -1, 0, 1};
int main() {  
	int n;
	printf("N*N의 지역에서 N의 값을 입력하세요:");
		scanf("%d",&n);
		
	for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				scanf("%d",&a[i][j]);
			}
		}
	int cnt=0;
	
	for(int i =1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				int flag =0;
				for(int k=0; k<4; k++){
					if(a[i][j]<=a[i+dx[k]][j+dy[k]]){
						flag=1;
						break;
					}
				}
				if(flag==0)cnt++;
			}
		}
		
	printf("봉우리의 갯수는 %d이다 \n", cnt);	
		
	return 0;

}
