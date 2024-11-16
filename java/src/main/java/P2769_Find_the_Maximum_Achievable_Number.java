class P2769_Find_the_Maximum_Achievable_Number {

    public static void main(String args[]) {
        P2769_Find_the_Maximum_Achievable_Number instance = new P2769_Find_the_Maximum_Achievable_Number();
        System.out.println(instance.theMaximumAchievableX(4, 1));
    }


    public int theMaximumAchievableX(int num, int t) {
        return num + 2*t;
    }
}