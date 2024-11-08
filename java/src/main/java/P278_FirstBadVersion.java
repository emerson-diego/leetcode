public class P278_FirstBadVersion {

    public static void main(String args[]) {
        int n = 5;

        System.out.println(new P278_FirstBadVersion().firstBadVersion(n));

    }

    public int firstBadVersion(int n) {
        int left = 1, right = n;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (isBadVersion(mid)) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        if (isBadVersion(left)) {
            return left;
        }
        return left + 1;
    }

    public static boolean isBadVersion(int version) {
        if (version == 4)
            return true;

        return false;
    }
}
