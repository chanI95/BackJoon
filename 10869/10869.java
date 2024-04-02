// 첫번째 풀이
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
		int B = sc.nextInt();
 
		System.out.println(A+B);
		System.out.println(A-B);
		System.out.println(A*B);
		System.out.println(A/B);
		System.out.println(A%B);
    }
}


// 두번째 풀이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));  // 선언

        String s = bf.readLine();
        StringTokenizer st = new StringTokenizer(s);  //StringTokenizer인자값에 입력 문자열 넣음
        int a = Integer.parseInt(st.nextToken());  //첫번째 호출
        int b = Integer.parseInt(st.nextToken());  //두번째 호출

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
