package com.bowen.framework.utils;


import net.lingala.zip4j.core.ZipFile;
import net.lingala.zip4j.exception.ZipException;

public class ZipUtil {


    public static void unzip(String zipFilePath,String targetPath) throws Exception{
        ZipFile zipFile = new ZipFile(zipFilePath);
        zipFile.extractAll(targetPath);
    }


    public static void unzip(String zipFilePath,String password,String targetPath) throws Exception{
        ZipFile zipFile = new ZipFile(zipFilePath);
        if (zipFile.isEncrypted()) {
            zipFile.setPassword(password);
        }
        zipFile.extractAll(targetPath);
    }

    public static void main(String[] args) throws Exception {
        ZipUtil.unzip("F:\\develop\\upload\\upload.zip","F:\\develop\\upload\\zip\\");
    }
}
