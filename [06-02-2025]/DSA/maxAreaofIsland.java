import java.util.*;

public class Solution {
    private static final int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public int maxAreaOfIsland(int[][] grid) {
        int maxArea = 0;
        
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    maxArea = Math.max(maxArea, bfs(grid, i, j));
                }
            }
        }
        return maxArea;
    }

    private int bfs(int[][] grid, int i, int j) {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{i, j});
        grid[i][j] = 2; // Mark as visited
        int area = 0;
        
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            area++;
            for (int[] dir : directions) {
                int newX = cell[0] + dir[0], newY = cell[1] + dir[1];
                if (newX >= 0 && newX < grid.length && newY >= 0 && newY < grid[0].length && grid[newX][newY] == 1) {
                    grid[newX][newY] = 2; // Mark as visited
                    queue.add(new int[]{newX, newY});
                }
            }
        }
        return area;
    }
}
