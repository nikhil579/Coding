class Main {
    // Brute force solution
    public static int trap(int[] height) {
        int water = 0;
        for (int i = 0; i < height.length; i++) {
            int leftmax = 0;
            int rightmax = 0;
            // left side maximum height
            for (int j = 0; j <= i; j++) {
                if (height[j] > leftmax) {
                    leftmax = height[j];
                }
            }
            // right side maximum value
            for (int j = i; j < height.length; j++) {
                if (height[j] > rightmax) {
                    rightmax = height[j];
                }
            }
            // if (Math.min(leftmax, rightmax) - height[i] > 0)
            water += Math.min(leftmax, rightmax) - height[i];
        }
        return water;
    }

    // fastest solution
    public static int fastTrap(int[] height) {
        int res = 0;
        int level = 0;
        int l = 0;
        int r = height.length - 1;
        while (l < r) {
            int lower = height[height[l] < height[r] ? l++ : r--];
            level = Math.max(level, lower);
            res += level - lower;
        }
        return res;
    }

    // optimised solution
    public static int getWater(int[] arr) {
        if (arr.length < 3) {
            return 0;
        }
        int start = 0;
        int end = arr.length - 1;
        int leftMax = arr[0];
        int rightMax = arr[arr.length - 1];
        int water = 0;
        while (start <= end) {
            if (leftMax < rightMax) {
                leftMax = Math.max(leftMax, arr[start]);
                water += leftMax - arr[start];
                start++;
            } else {
                rightMax = Math.max(rightMax, arr[end]);
                water += rightMax - arr[end];
                end--;
            }
        }
        return water;
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}; // {6,4,2,0,4,6,4,8};
        System.out.println(trap(arr));
        System.out.println(fastTrap(arr));
        System.out.println(getWater(arr));
    }
}
