package com.test.springboottest.myTest.IO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * @program: SimpleTest
 * @description:
 * @author: hugge
 * @create: 2023/10/20
 */
public class DownloadUrlTest {
  public static void main(String[] args) throws IOException {
    String urlPath = "https://p6-magic.byteimg.com/tos-cn-i-tokbwntzau/magic_eco/00f7433e22bd5f2029d7b721a7fcce7b~tplv-tokbwntzau-perf:0:0:q75.webp?size=750x1624&magic_type=image_png";
    String savePath = "C:\\Users\\26624\\Desktop\\temp\\1024.png";

    InputStream inputStream = null;
    FileOutputStream fileOutputStream = null;

    try {
      //使用Java中的URL和URLConnection类来实现
      URL url = new URL(urlPath);

      URLConnection urlConnection = url.openConnection();

      // 设置请求超时为5秒
      urlConnection.setConnectTimeout(5 * 1000);

      inputStream = urlConnection.getInputStream();

      // 读取数据到本地
      fileOutputStream = new FileOutputStream(savePath);
      int len;
      byte[] cacheData = new byte[1024];
      while ((len = inputStream.read(cacheData)) != -1) {
        fileOutputStream.write(cacheData, 0, len);
      }
      System.out.println("下载成功！");
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      inputStream.close();
      fileOutputStream.close();
    }

  }
}
