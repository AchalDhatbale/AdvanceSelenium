import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileData {
	public static void main(String[] args) throws IOException {
		File f=new File("./driver/Shree.txt");
		FileOutputStream fos=new FileOutputStream(f);
		String s="Shreepad";
		fos.write(s.getBytes());
		
		FileInputStream fis = new FileInputStream(f);
		int name = fis.read();
		
		while(name!=-1)
		{
			System.out.print((char)name);
			name=fis.read();
		}
	}
}
