package com.example.project;


public class WhileLoops {


   // ============================================================
   // U2T5 - Programming Challenge! While Loop Practice (TIMED)
   // Rules:
   // - You MUST use while loops (no for loops, no recursion).
   // - Do not use any library methods that we haven't learned in class
   // and that can “solve” it for you (ex. streams).
   // - You may create helper variables inside methods if needed.

    //You have period 7 to complete the challenge. 
    //You should manually test with WhileLoopsRunner before running the gradle
    //tests
    //run ./gradlew test when you are ready. 
   //// ============================================================


   /**
    * Returns the number of even integers between 1 and n (inclusive).
    * If n < 1, return 0.
    *
    * Examples:
    * countEvensUpTo(1) -> 0 // no even numbers from 1 to 1
    * countEvensUpTo(2) -> 1 // {2}
    * countEvensUpTo(6) -> 3 // {2, 4, 6}
    * countEvensUpTo(10) -> 5 // {2, 4, 6, 8, 10}
    */
    public static int countEvensUpTo(int n) {
        int counter = 0;
        int numberEvenCount = 0;
        String list = "";
        if (n < 2) {
            return 0;
        }
        while (counter + 2 <= n) {
            counter = counter + 2;
            list = list + " " + counter;
            numberEvenCount++;
        }
        return numberEvenCount;
   }


   /**
    * Returns the sum of the digits of n.
    * n will be non-negative.
    *
    * Examples:
    * digitSum(0) -> 0
    * digitSum(7) -> 7
    * digitSum(123) -> 6 // 1 + 2 + 3
    * digitSum(4098) -> 21 // 4 + 0 + 9 + 8
    * digitSum(199) -> 19 // 1 + 9 + 9
    */
    public static int digitSum(int n) {
        int digit = ("" + n).length();
        int initialDigit = digit;
        int counter = 0;
        int sum = 0;
        int leftNumbers =  n;
        while (counter < initialDigit) {
            counter++;
            sum = sum + leftNumbers * (int) Math.pow(0.1, digit - 1);
            leftNumbers = leftNumbers % (int) Math.pow(0.1, digit - 1);
            digit = digit - 1;
        }
        return sum;
   }


   /**
    * Starting from start, subtract step repeatedly
    * UNTIL the next subtraction would make the number negative.
    *
    * Return the final value (which will always be >= 0).
    *
    * Examples:
    * countDownBy(20, 3) -> 2
    * // 20 -> 17 -> 14 -> 11 -> 8 -> 5 -> 2 (next would be -1, stop)
    *
    * countDownBy(10, 4) -> 2
    * // 10 -> 6 -> 2 (next would be -2, stop)
    *
    * countDownBy(5, 5) -> 0
    * // 5 -> 0
    *
    * countDownBy(4, 6) -> 4
    * // can't subtract without going negative
    */
   public static int countDownBy(int start, int step) {
       while (start - step >= 0) {
        start = start - step;
       }
       if (start < 0) {
        start = 0;
       }
       return start;
   }


   /**
    * You have some money saved and you deposit the same amount every week.
    * Return how many weeks it will take to reach at least goalBalance.
    *
    * Assume:
    * - startBalance >= 0
    * - weeklyDeposit > 0
    * - goalBalance >= 0
    *
    * If startBalance is already >= goalBalance, return 0.
    *
    * Examples:
    * weeksToReachGoal(0, 50, 200) -> 4
    * // Week 1: 50
    * // Week 2: 100
    * // Week 3: 150
    * // Week 4: 200 (goal reached)
    *
    * weeksToReachGoal(100, 20, 110) -> 1
    * // Already at 100, one more deposit makes it 120
    *
    * weeksToReachGoal(500, 100, 400) -> 0
    * // Already have 500, goal is 400, no weeks needed
    *
    * weeksToReachGoal(10, 10, 40) -> 3
    * // 10 -> 20 -> 30 -> 40
    */
   public static int weeksToReachGoal(int startBalance, int weeklyDeposit, int goalBalance) {
    int count = 0;
       while (startBalance < goalBalance) {
        count++;
        startBalance = startBalance + weeklyDeposit;
       }
       return count;
   }


   /**
    * Your phone battery is at startPercent (0-100)%, and you are using it
    * so that it loses perMinuteUse percent each minute.
    *
    * Each minute:
    * - the phone loses perMinuteUse (battery %)
    * - the minute counter goes up by 1
    *
    * Return how many whole minutes until the battery is at 0 or less.
    *
    * If startPercent <= 0 or perMinuteUse <= 0, return 0.
    *
    * Examples:
    * minutesUntilDead(100, 10) -> 10
    * Battery is fully charged and loses 10% per minute of use
    * // 100 -> 90 -> 80 -> ... -> 10 -> 0 (dead on minute 10)
    *
    * minutesUntilDead(15, 10) -> 2
    * // 15 -> 5 -> -5 (dead on minute 2)
    *
    * minutesUntilDead(5, 10) -> 1
    * // 5 -> -5 (dead on minute 1)
    *
    * minutesUntilDead(0, 10) -> 0
    * // battery already dead
    *
    * minutesUntilDead(50, 0) -> 0
    * // battery would never drain
    */
   public static int minutesUntilDead(int startPercent, int perMinuteUse) {
    int count = 0;
    if (startPercent == 0) {
        return 0;
    } else if (perMinuteUse == 0) {
        return 0;
    } else{
        while (startPercent > 0) {
            count ++;
            startPercent = startPercent - perMinuteUse;
        }
        return count;
    }
   }
}



