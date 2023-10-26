public class Solution_135807 {



    public static void main(String[] args) {

    }

    public int solution(int[] arrayA, int[] arrayB) {
        int answer = 0;
        return answer;
    }

    public int gcd(int a, int b){
        int tmp = 0;
        while(b != 0){
            tmp = a;
            a = b;
            b = tmp % b;
        }
        return a;
    }
}
