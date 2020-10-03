package algorithm;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;
public class Number66 {
	public static int n;
	public static int cnt=0;
	public static int DFS(int v, List<LinkedList<Integer>> map, int[] ch) {
		if(v==n) { //도착점에 도달
			cnt++;
		}
		else {
			for(int i =0; i<map.get(v).size(); i++) {
				if(ch[map.get(v).get(i)]==0) {
					ch[map.get(v).get(i)]=1;
					DFS(map.get(v).get(i), map, ch);
					ch[map.get(v).get(i)]=0;
				}
			}
		}
		return cnt;
	}
	public static void main(String[] args) {
		//66. 경로탐색 (인접리스트)
		// 방향그래프가 주어지면 1번 정점에서 N번 정접까지 가는 모든 경로의 가지수를 출력하는 프로그램을 작성하세요.
		Scanner stdIn = new Scanner(System.in);
		System.out.print("정점의 수를 입력하세요:");
		n = stdIn.nextInt();
		System.out.print("간선의 수를 입력하세요:");
		int m = stdIn.nextInt();
		List<LinkedList<Integer>> map = new LinkedList<LinkedList<Integer>>();
		int[] ch = new int[20];
		int i;
		int o;
		for(int k=0; k<=m; k++) {
			map.add(new LinkedList<Integer>());
		}
		for(int k=1; k<=m; k++) {
			i = stdIn.nextInt();
			o = stdIn.nextInt();
			map.get(i).add(o);
		}
		/*
		for(int a =1; a<=map.size(); a++) {
			for(int b=0; b<map.get(a).size(); b++) {
				System.out.print(map.get(a).get(b)+ " ");
			}
			System.out.println();
		}
		*/
		ch[1]=1;
		
		System.out.println("1부터 "+n+"까지의 모든 경로의 수는 "+DFS(1,map,ch)+"이다");
	}

}
