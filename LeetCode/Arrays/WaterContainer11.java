public class WaterContainer11 {
    public static int maxArea(int[] height) {
        int max = 0;

        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {

                int width = j - i;
                int area = Math.min(height[i], height[j]) * width;

                if (area > max) {
                    max = area;
                }
            }
        }

        return max;

    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };

        System.out.println(maxArea(height));

    }
}
