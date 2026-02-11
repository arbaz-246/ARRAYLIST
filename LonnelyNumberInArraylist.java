import java.util.*;

public class LonnelyNumberInArraylist {
    public static ArrayList<Integer> lonelyno(ArrayList<Integer> nums) {
        Collections.sort(nums);
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.size();
        if (n == 0)
            return list;
        for (int i = 0; i < n; i++) {
            boolean left = i == 0 || nums.get(i) - nums.get(i - 1) > 1;
            boolean right = i == n - 1 || nums.get(i + 1) - nums.get(i) > 1;
            if (left && right) {
                list.add(nums.get(i));
            }
        }
        return list;
    }

    public static void main(String args[]) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(11);
        nums.add(12);
        System.out.println(lonelyno(nums));

    }
}
