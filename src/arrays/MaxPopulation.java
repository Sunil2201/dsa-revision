package arrays;

public class MaxPopulation {
    public static void main(String[] args) {
        int[][] logs =  {
                            {1982,1998},
                            {2013,2042},
                            {2010,2035},
                            {2022,2050},
                            {2047,2048}
                        };
        System.out.println(maximumPopulation(logs));
    }
    static int maximumPopulation(int[][] logs) {
        int[] ppl = new int[101];
        int max = 0, idx = 0, lastSum = 0;
        for ( int i = 0; i < logs.length; i++ ) {
            ppl[logs[i][0] - 1950]++;
            ppl[logs[i][1] - 1950]--;
        }
        for ( int i = 0; i < ppl.length; i++ ) {
            lastSum += ppl[i];
            if ( lastSum > max ) {
                max = lastSum;
                idx = i;
            }
        }
        return idx + 1950;
    }
}
