package algorithm;
import java.util.Scanner;
public class Number64 {
	public static int n;
	public static int cnt=0;
	public static int DFS(int v, int[][] a, int[] ch) {
		if(v==n) { //도착점에 도달
			cnt++;
		}
		else {
			for(int i =1; i<=n; i++) {
				if(a[v][i]==1 && ch[i]==0) {
					ch[i]=1;
					DFS(i, a, ch);
					ch[i]=0;
				}
			}
		}
		return cnt;
	}
	
	public static void main(String[] args) {
		//64. 경로탐색
		// 방향그래프가 주어지면 1번 정점에서 N번 정접까지 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정점의 수를 입력하세요:");
		n = stdIn.nextInt();
		System.out.print("간선의 수를 입력하세요:");
		int v = stdIn.nextInt();
		int[][] a = new int[n+1][n+1];
		int[] ch = new int[n+1];
		int i;
		int o;
		for(int k =0; k<v; k++) {
			i = stdIn.nextInt();
			o = stdIn.nextInt();
			a[i][o]=1;
		}
		ch[1]=1; //정점 1은 시작점, 무조건 방문
		System.out.println("1부터 "+n+"까지의 모든 경로의 수는 "+DFS(1,a,ch)+"이다");
	}
}
