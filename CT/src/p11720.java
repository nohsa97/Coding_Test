import java.util.Scanner;

public class p11720 {
    public static void main(String[] args) {
        int N;
        int sum = 0;
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        //갯수 입력받기
        char arr[] = new char[N];
        String s = new String();
        s = sc.next();
        arr = s.toCharArray();

        for (int i = 0; i < N; i++){
            sum += arr[i] - 48;
        }
        System.out.println(sum);
    }
}
