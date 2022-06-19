package leet_code;

public class IslandPerimeterQ463 {

	public static void main(String[] args) {
		IslandPerimeterQ463 islandPerimeterQ463 = new IslandPerimeterQ463();
		System.out.println(islandPerimeterQ463.islandPerimeter(new int[][] {{1,0,0},{1,1,0},{0,1,0}}));
	}
	public int islandPerimeter(int[][] grid) {
        int landCount = 0;
        for(int i = 0;i<grid.length;i++){
            for(int j = 0;j<grid[0].length;j++){
                int mid = 4;
                if(grid[i][j] == 1){
                    if(i!=0){
                        if(grid[i-1][j] == 1){
                            mid--;
                        }
                    }
                    if(j != 0){
                        if(grid[i][j-1] == 1){
                            mid--;
                        }
                    }
                    if(i != grid.length-1){
                        if(grid[i+1][j] == 1){
                            mid--;
                        }
                    }
                    if(j != grid[0].length-1){
                        if(grid[i][j+1] == 1){
                            mid--;
                        }
                    }
                    landCount+=mid;
                }
            }
        }
        return landCount;
    }
}
