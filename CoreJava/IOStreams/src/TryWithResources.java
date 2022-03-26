import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class TryWithResources {

	public static void main(String[] args) {

		int wordCount = 0;

		try (FileReader fr = new FileReader("C:\\D-drive\\Shared\\myfile2.txt");
				BufferedReader br = new BufferedReader(fr);) {

			String line;

			while ((line = br.readLine()) != null) { // br.readLine() reads a line
//				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					++wordCount;
				}
				System.out.println();
			}
			System.out.println("Number of words in the file are: " + wordCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
