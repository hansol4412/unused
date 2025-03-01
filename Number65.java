package algorithm;
import java.util.Scanner;
public class Number65 {
	static int n;
	static int cnt=0;
	static int DFS(int x, int y, int[][] map, int[][] ch, int[] dx, int[] dy) {
		int xx;
		int yy;
		if(x==n && y==n) {
			cnt++;
		}
		else {
			for(int i=0; i<4; i++) {
				xx=x+1*dx[i];
				yy=y+1*dy[i];
				if(xx<1 || xx>n || yy<1 || yy>n) {
					continue;
				}
				if(map[xx][yy]==0 && ch[xx][yy]==0) {
					ch[xx][yy]=1;
					DFS(xx, yy, map, ch, dx, dy);
					ch[xx][yy]=0;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		// 65. 미로탐색 (DFS)
		/*  자연수  N이 주어지면 n*n 격자판 미로를 탈출하는 경로의 가지수를 출력하는 프로그램을 작성하시오.
		       출발점은 (1,1) 좌표이고 도착점은 (n,n)좌표이다. 격자판의 1은 벽이고 0은 통로이다/
		       격자판의 움직임은 상하좌우만 움직인다. */
		Scanner stdIn = new Scanner(System.in);
		System.out.print("n을 입력하세요:");
		n = stdIn.nextInt();
		int[][] map = new int[n+1][n+1];
		int[][] ch = new int[n+1][n+1];
		for(int i = 1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				map[i][j] = stdIn.nextInt();
			}
		}
		
		int[] dx = {-1,0,1,0};
		int[] dy = {0,-1,0,1};
		ch[1][1] =1;
		
		System.out.println("미로탈출의 경로수는 총 "+DFS(1,1,map,ch,dx,dy)+"가지수이다.");
		
	}

}
