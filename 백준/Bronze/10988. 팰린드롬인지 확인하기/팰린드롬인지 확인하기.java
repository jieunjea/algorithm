import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		int count = input.length();
		boolean pd = true;

		for (int i = 0; i < count / 2; i++) {
			if (input.charAt(i) != input.charAt(count - i - 1)) {
				pd = false;
				break;
			} else;
		}
		if (pd == false) {
			System.out.println(0);
		} else
			System.out.println(1);
	}
}
