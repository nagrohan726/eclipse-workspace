import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class BufferedReaderDemo {

	public static void main(String[] args) {

		FileReader fr = null;
		BufferedReader br = null;

		int wordCount = 0;

		try {
			fr = new FileReader("C:\\D-drive\\Shared\\myfile2.txt");
			br = new BufferedReader(fr);

			String line;

			while ((line = br.readLine()) != null) { // br.readLine() reads a line
//				System.out.println(line);
				StringTokenizer st = new StringTokenizer(line);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					++wordCount;
				}
			}
			System.out.println("Number of words in the file are: " + wordCount);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
