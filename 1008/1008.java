// 첫번째 풀이
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        sc.close();
        System.out.print(a/b);
    }
}

// 두번째 풀이
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] str = br.readLine().split(" ");
		double a = Double.parseDouble(str[0]);
		double b = Double.parseDouble(str[1]);

		System.out.println(a/b);
	}
}