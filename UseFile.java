import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;


public class UseFile {
	public static void main(String[] args) {
		Path myFile = Paths.get("dvkj.txt");
		String content = "안녕하세요";
		System.out.println(Arrays.deepToString(args));
		System.out.println(args[0]);
		System.out.println(args[1]);
		try {
//			Files.write(myFile, content.getBytes());
			System.out.print(Files.readAllLines(myFile).toString());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
