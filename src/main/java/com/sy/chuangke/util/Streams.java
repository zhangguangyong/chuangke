package com.sy.chuangke.util;

import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.List;

/**
 * 流工具类
 * 参考：com.google.common.io.Files
 */
public class Streams {

    private static Streams instance = new Streams();
    private Streams(){}
    public static Streams getInstance() {
        return instance;
    }

    static final Charset DEFAULT_CHARSET = Charset.defaultCharset();

    public byte[] toByteArray(File file) throws IOException {
        return Files.toByteArray(file);
    }

    public String toString(File file, Charset charset) throws IOException {
        return Files.toString(file, charset);
    }


    /*----------------写入-------------------*/

    public void write(byte[] from, File to) throws IOException {
        Files.write(from, to);
    }

    public void write(CharSequence from, File to) throws IOException {
        Files.write(from, to, DEFAULT_CHARSET);
    }

    public void write(CharSequence from, File to, Charset charset) throws IOException {
        Files.write(from, to, charset);
    }

    public void append(CharSequence from, File to) throws IOException {
        Files.append(from, to, DEFAULT_CHARSET);
    }

    public void append(CharSequence from, File to, Charset charset) throws IOException {
        Files.append(from, to, charset);
    }

    /*----------------读取-------------------*/

    public static List<String> readLines(File file) throws IOException {
        return readLines(file, DEFAULT_CHARSET);
    }

    public static List<String> readLines(File file, Charset charset) throws IOException {
        return Files.readLines(file, charset);
    }

    //复制、移动文件
    public static void copy(File from, File to) throws IOException {
        Files.copy(from, to);
    }

    public static void copy(File from, OutputStream to) throws IOException {
        Files.copy(from, to);
    }

    public static void move(File from, File to) throws IOException {
        Files.move(from, to);
    }

}
