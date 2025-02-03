import java.util.*;
class Solution {
    public int[][] highestPeak(int[][] isWater) {
        int r = isWater.length, c = isWater[0].length;
        int[][] h = new int[r][c];
        Queue<int[]> queue = new LinkedList<>();
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (isWater[i][j] == 1) {
                    h[i][j] = 0;
                    queue.offer(new int[]{i, j});
                } else {
                    h[i][j] = -1;
                }
            }
        }
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        while (!queue.isEmpty()) {
            int[] cell = queue.poll();
            int x = cell[0], y = cell[1];
            for (int[] dir : directions) {
                int newX = x + dir[0], newY = y + dir[1];
                if (newX >= 0 && newX < r && newY >= 0 && newY < c && h[newX][newY] == -1) {
                    h[newX][newY] = h[x][y] + 1;
                    queue.offer(new int[]{newX, newY});
                }
            }
        }
        return h;
    }
}
