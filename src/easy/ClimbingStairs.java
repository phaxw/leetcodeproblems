package easy;

public class ClimbingStairs {
    public int climbStairs(int n) {
        if (n == 1)
            return 1;
        if (n == 2)
            return 2;

        return climbStairs(n - 1) + climbStairs(n - 2);
    }

    public int climbStairs2(int x) {

        if (x == 1)
            return 1;
        if (x == 2)
            return 2;

        int array[] = new int[x+1];
        array[0] = 1;
        array[1] = 1;
        array[2] = 2;

        int number = 0;
        for (int i = 3; i <= array.length-1; i++){
            number = array[i - 1] + array[i - 2];
            array[i] = number;
        }

        return number;
    }

    public int climbStairs3(int x) {

        if (x == 1)
            return 1;
        if (x == 2)
            return 2;

        int one = 1;
        int two = 2;


        for (int i = 3; i <= x; i++){

            int number = one + two;
            one = two;
            two = number;
        }

        return two;
    }
}
