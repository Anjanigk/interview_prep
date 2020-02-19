package GraphProblems;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AmazonGraphTest2 { 
	
	public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 
        int r = s.nextInt(); 
        int c = s.nextInt(); 
        int arr[][] = new int[r][c];
        Queue<Integer[]> v = new LinkedList<Integer[]>();
        for(int i =0; i< r;i++) {
        	for(int j =0; j< c;j++) {
        		arr[i][j] = s.nextInt();
        	}
        }
        for(int i =0; i< r;i++) {
        	for(int j =0; j< c;j++) {
        		if(arr[i][j] == 1) {
        			Integer m[] = new Integer[] {i,j};
        			v.add(m);
        		}
        	}
        }
        int count = bfs(arr,v);
        System.out.println("count="+count);
    }

    private static int bfs(int[][] arr, Queue<Integer[]> v) {
    	int count = 0;
    	if(v.size() == 0) {
    		return 0;
    	}
    	int dx[] = new int[] {0,0,1,-1};
    	int dy[] = new int[] {1,-1,0,0};
    	while (v.size() > 0) {
    		int times = v.size();
    		count++;
    		for(int j= 0; j<times ;j++) {
    			Integer[] temp = v.peek();
    			int x = temp[0];
    			int y = temp[1];
    			v.poll();
    			
        		
    			for(int i=0; i<4;i++) {
    				int nx= x+dx[i];
    				int ny = y+dy[i];
    				if(nx>=0 && ny>=0 && nx<arr.length && ny<arr[0].length && arr[nx][ny] ==0) {
    					arr[nx][ny] = 1;
    					v.add(new Integer[] {nx,ny});
    				}

    			}
    		}
    		

    	}
    	
    	return count-1;
    }

	
}
