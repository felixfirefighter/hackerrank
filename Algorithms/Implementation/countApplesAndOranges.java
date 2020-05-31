// Problem: https://www.hackerrank.com/challenges/apple-and-orange/problem
static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    // s - t = range of Sam's house, we want to find apple and orange
    // that fall into this range
    // a = position of apple tree
    // b = position of orange tree
    int appleCount = 0;
    int orangeCount = 0;
    for(int apple : apples) {
        int applePos = apple + a;
        if(applePos >= s && applePos <= t) appleCount++;
    }

    for(int orange : oranges) {
        int orangePos = orange + b;
        if(orangePos >= s && orangePos <= t) orangeCount++;
    }
    System.out.println(appleCount);
    System.out.println(orangeCount);
  }