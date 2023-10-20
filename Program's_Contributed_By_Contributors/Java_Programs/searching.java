public class searching {
    // linear search
    static int linear(int []arr, int target) {
        for (int i=0; i<arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    // binary search
    static int binary(int []arr, int target) {
        int low = 0;
        int high = arr.length - 1;
        int mid;

        while(low<=high) {
            mid = low + (high-low)/2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid]<target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr = {78, 2, 4, 92, 7, 24};
        int target = 4;

        int s1 = linear(arr, target);
        int s2 = binary(arr, target);
        
        System.out.println(s1);
        System.out.println(s2);
    }
}
