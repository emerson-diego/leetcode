public class P278_FirstBadVersion {

    public static void main(String args[]) {
        int n = 5;

        System.out.println(new P278_FirstBadVersion().firstBadVersion(n));

    }

    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int mid = 0;
        int result = n;

        while (low <= high) {
            mid = (low + high) / 2;
            if (isBadVersion(mid)) {
                result = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return result;

    }

    public static boolean isBadVersion(int version) {
        if (version == 4)
            return true;

        return false;
    }
}
