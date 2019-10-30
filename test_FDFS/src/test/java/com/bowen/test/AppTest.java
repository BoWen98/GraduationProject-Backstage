package com.bowen.test;

import org.csource.common.MyException;
import org.csource.fastdfs.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @ProjectName: GraduationProject-Backstage
 * @Package: com.bowen.test
 * @ClassName: AppTest
 * @Author: Bowen
 * @Description: a
 * @Date: 2019/10/30 10:56
 * @Version: 1.0.0
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class AppTest {

    @Test
    public void testUpload() {

        try {
            //加载fastdfs-client.properties配置文件
            ClientGlobal.initByProperties("conf/fastdfs-client.properties");
            //定义TrackerClient，用于请求TrackerServer
            TrackerClient trackerClient = new TrackerClient();
            //连接tracker
            TrackerServer trackerServer = trackerClient.getConnection();

            //获取Stroage
            StorageServer storeStorage = trackerClient.getStoreStorage(trackerServer);
            //创建stroageClient
            StorageClient1 storageClient1 = new StorageClient1(trackerServer, storeStorage);
            //向stroage服务器上传文件
            //本地文件的路径
            String filePath = "C:/Users/Bowen/Desktop/blog/timg.jpg";
            //上传成功后拿到文件Id
            String fileId = storageClient1.upload_file1(filePath, "png", null);
            System.out.println(fileId);
            //group1/M00/00/01/wKhlQVuhU3eADb4pAAAawU0ID2Q159.png

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

    @Test
    public void testDownload() {
        try {
            //加载fastdfs-client.properties配置文件
            ClientGlobal.initByProperties("conf/fastdfs-client.properties");
            //定义TrackerClient，用于请求TrackerServer
            TrackerClient trackerClient = new TrackerClient();
            //连接tracker
            TrackerServer trackerServer = trackerClient.getConnection();
            //获取Stroage
            StorageServer storeStorage = trackerClient.getStoreStorage(trackerServer);
            //创建stroageClient
            StorageClient1 storageClient1 = new StorageClient1(trackerServer, storeStorage);
            //下载文件
            //文件id
            String fileId = "group1/M00/00/00/wKgFZF25BzGAdddpAACkBAgC-D4467.png";
            byte[] bytes = storageClient1.download_file1(fileId);
            //使用输出流保存文件
            FileOutputStream fileOutputStream = new FileOutputStream(new File("C:/Users/Bowen/Desktop/blog/timg111.jpg"));
            fileOutputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}
