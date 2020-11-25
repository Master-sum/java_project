public class Array {
    public static void main(String[] args){
        final int NMAX = 10;
        int[][] pd = new int[NMAX+1][];
        for (int n=0;n<=NMAX;n++){
            pd[n] = new int[n+1];
        }
        for (int n=0;n<pd.length;n++){
            for (int k = 0;k<pd[n].length;k++){
                int lot = 1;
                for (int i=1;i<=k;i++)
                    lot = lot *(n-i+1)/i;
                pd[n][k] = lot;

            }
            for (int[] row:pd){
                for(int d:row)
                    System.out.printf("%4d",d);
                System.out.println();
            }
        }
    }

}
