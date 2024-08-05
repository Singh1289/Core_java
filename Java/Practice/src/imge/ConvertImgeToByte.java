package imge;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;

import javax.imageio.stream.FileImageOutputStream;

public class ConvertImgeToByte {
	
	public static byte[] readImageConvertIntoByte(String path) throws IOException {
		return Files.readAllBytes(new File(path).toPath());
	}
	
	
	public static void main(String[] args) throws IOException {
		String imagePath= "files/image.jpg";
		
		byte[] imageInByte = readImageConvertIntoByte(imagePath);
		
		FileOutputStream out1 = new FileOutputStream("files/outputFile.txt");
		
		out1.write(imageInByte);
		out1.close();
		
		
		
		
	}
}
