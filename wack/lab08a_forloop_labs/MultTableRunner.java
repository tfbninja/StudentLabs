package lab08a_forloop_labs;

// A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
public class MultTableRunner {

    public static void main(String[] args) {
        int[] nums = {5, 3, 1, 9, 7};
        int[] stops = {5, 7, 6, 9, 8};
        MultTable tester = new MultTable();
        for (int i = 0; i < nums.length; i++) {
            tester.setTable(nums[i], stops[i]);
            System.out.println(tester);
        }
    }
}
