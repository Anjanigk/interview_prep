package GraphProblems;

  
public class AmazonGraphTest1 
{ 
	public static void main(String[] args) 
    { 
        FastReader s=new FastReader(); 
        int r = s.nextInt(); 
        int c = s.nextInt(); 
        int arr[][] = new int[r][c];
        boolean v[][] = new boolean[r][c];
        for(int i =0; i< r;i++) {
        	for(int j =0; j< c;j++) {
        		arr[i][j] = s.nextInt();
        	}
        }
        int count = 0;
        for(int i =0; i< r;i++) {
        	for(int j =0; j< c;j++) {
        		if(arr[i][j] == 1 && v[i][j] == false) {
        			count ++;
        			dfs(arr,i,j,v);
        		}
        	}
        }
        System.out.println("count="+count);
    }

    private static void dfs(int[][] arr, int x, int y, boolean[][] v) {
    	v[x][y] = true;
    	int dx[] = new int[] {0,0,1,-1};
    	int dy[] = new int[] {1,-1,0,0};
    	for(int i=0; i<4;i++) {
    		int nx= x+dx[i];
    		int ny = y+dy[i];
    		if(nx>=0 && ny>=0 && nx<arr.length && ny<arr[0].length && arr[nx][ny] ==1 && v[nx][ny] == false) {
                dfs(arr,nx,ny,v);
    		}

    	}

    } 
} 