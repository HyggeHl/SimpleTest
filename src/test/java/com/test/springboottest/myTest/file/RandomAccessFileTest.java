package com.test.springboottest.myTest.file;

import org.apache.commons.io.FileUtils;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @program: springbootTest
 * @description: 文件
 * @author: hygge
 * @create: 2023/06/26
 */
@SpringBootTest
public class RandomAccessFileTest {

  @Test
  public void testFile() throws IOException {
    File file = new File("D:/1testFiles/test.txt");

    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");

//    randomAccessFile.seek(1);
//    randomAccessFile.write(Byte.MAX_VALUE);

    randomAccessFile.setLength(20);
    long length = randomAccessFile.length();
    System.out.println("length：" + length);

    byte[] bytes = FileUtils.readFileToByteArray(file);

    randomAccessFile.close();
  }
}
