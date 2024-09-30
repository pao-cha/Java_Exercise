package org.example;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownLoadFile {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://ucc-private-download.oss-cn-beijing.aliyuncs.com/e9af0d4111234bfda5813c72a368a168.pdf?Expires=1713237481&OSSAccessKeyId=LTAIvsP3ECkg4Nm9&Signature=HuAZsseMPVZ2iZxC1JfM8eSyj84%3D");
            InputStream in = url.openStream();
            FileOutputStream out = new FileOutputStream("E:\\test\\downloaded_file.pdf");

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = in.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }

            in.close();
            out.close();
            System.out.println("File downloaded successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
