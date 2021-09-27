package com.lzl.client;

import com.lzl.utils.FastDFSClient;

import java.io.*;
import java.util.Arrays;
import java.util.UUID;

/**
 * Created by 金喆
 */

public class MyClient {

    public static void main(String[] args) {

        try {
//
//            File file = new File("E:/you.jpg");
//            InputStream inputStream = new FileInputStream(file);
//            String fileName = UUID.randomUUID().toString() + ".jpg";
//            String[] result = FastDFSClient.uploadFile(inputStream , fileName);
//            System.out.println(Arrays.toString(result));


            InputStream is = FastDFSClient.downloadFile("group1","M00/00/00/wKiSgWFRL9-AOnW4AAA3JsOAxBg032.jpg");
            OutputStream os = new FileOutputStream(new File("E:/image/you.jpg"));
            int index = 0 ;
            while((index = is.read())!= -1)
            {
                os.write(index);
            }
            os.flush();
            os.close();
            is.close();

        }catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
