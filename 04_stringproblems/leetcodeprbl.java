class Solution {

    public int[][] rotateGrid(int[][] grid, int k) {

        int m = grid.length;
        int n = grid[0].length;

        int layers = Math.min(m, n) / 2;

        // Process each layer
        for (int layer = 0; layer < layers; layer++) {

            List<Integer> elements = new ArrayList<>();

            int top = layer;
            int left = layer;
            int bottom = m - layer - 1;
            int right = n - layer - 1;

            // Step 1: Extract layer elements

            // Top row
            for (int j = left; j <= right; j++) {
                elements.add(grid[top][j]);
            }

            // Right column
            for (int i = top + 1; i <= bottom - 1; i++) {
                elements.add(grid[i][right]);
            }

            // Bottom row
            for (int j = right; j >= left; j--) {
                elements.add(grid[bottom][j]);
            }

            // Left column
            for (int i = bottom - 1; i >= top + 1; i--) {
                elements.add(grid[i][left]);
            }

            // Step 2: Rotate counter-clockwise
            int size = elements.size();
            int rotate = k % size;

            List<Integer> rotated = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                rotated.add(elements.get((i + rotate) % size));
            }

            // Step 3: Put rotated values back
            int idx = 0;

            // Top row
            for (int j = left; j <= right; j++) {
                grid[top][j] = rotated.get(idx++);
            }

            // Right column
            for (int i = top + 1; i <= bottom - 1; i++) {
                grid[i][right] = rotated.get(idx++);
            }

            // Bottom row
            for (int j = right; j >= left; j--) {
                grid[bottom][j] = rotated.get(idx++);
            }

            // Left column
            for (int i = bottom - 1; i >= top + 1; i--) {
                grid[i][left] = rotated.get(idx++);
            }
        }

        return grid;
    }
}