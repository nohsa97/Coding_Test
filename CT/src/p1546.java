import java.util.Scanner;

public class p1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        int Max = 0;
        int sum = 0;
        double result = 0;
        N = sc.nextInt();

        int arr[] = new int[N];

        for(int i = 0; i < N; i++){
            arr[i] = sc.nextInt();
            sum += arr[i];
            if (arr[i] > Max){
                Max = arr[i];
            }
        }

        result = (double)sum * 100 / Max / N;
        System.out.println(result);


    }
}
