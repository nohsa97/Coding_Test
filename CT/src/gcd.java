public class gcd {
    public static void main(String[] args) {
        int arr[] = {10,20};
        int tmp = arr[0];

        for(int i = 1; i < arr.length; i++){
            tmp = gcdCalc(tmp, arr[i]);
        }

        System.out.println(tmp);
    }

    private static int gcdCalc(int a, int b){
        int tmp = 0;
        while(b != 0){
            tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
