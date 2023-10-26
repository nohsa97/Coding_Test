import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;
import org.*;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //로그 사이즈
        int m = sc.nextInt();
        //줄 갯수 . 4 고정

        try {
            URL url = new URL("http://localhost:8080/rest/getJson");
            HttpURLConnection conn = (HttpURLConnection)url.openConnection();

            conn.setRequestMethod("GET"); // http 메서드
            conn.setRequestProperty("Content-Type", "application/json"); // header Content-Type 정보
            conn.setRequestProperty("auth", "myAuth"); // header의 auth 정보
            conn.setDoOutput(true); // 서버로부터 받는 값이 있다면 true

            // 서버로부터 데이터 읽어오기
            BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            StringBuilder sb = new StringBuilder();
            String line = null;

            while((line = br.readLine()) != null) { // 읽을 수 있을 때 까지 반복
                sb.append(line);
            }

            JSONObject obj = new JSONObject(sb.toString()); // json으로 변경 (역직렬화)
            System.out.println("code= " + obj.getInt("code") + " / message= " + obj.getString("message"));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
