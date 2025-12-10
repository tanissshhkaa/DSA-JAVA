class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originalColor = image[sr][sc];
        if (originalColor == newColor) return image;
        dfs(image, sr, sc, originalColor, newColor);
        return image;
    }
    private void dfs(int[][] image, int i, int j, int originalColor, int newColor) {
        if (i < 0 || j < 0 || i >= image.length || j >= image[0].length || image[i][j] != originalColor) {
            return;
        }
        image[i][j] = newColor;
        dfs(image, i + 1, j, originalColor, newColor);
        dfs(image, i - 1, j, originalColor, newColor);
        dfs(image, i, j + 1, originalColor, newColor);
        dfs(image, i, j - 1, originalColor, newColor);
    }
}
