package com.example.hellolib;

/**
 * Created by lenovo on 2018/4/10.
 */

// 文件名 GreetingClient.java

import java.net.*;
import java.io.*;

public class GreetingClient
{
    public static void main(String [] args)
    {
        if (args.length > 2) {
            String serverName = args[0];
            int port = Integer.parseInt(args[1]);
        } else {
            String serverName = "localhost";
            int port = 5050;
        }
        String serverName = "localhost";
        int port = 5050;

        try
        {
            System.out.println("连接到主机：" + serverName + " ，端口号：" + port);
            Socket client = new Socket(serverName, port);
            System.out.println("远程主机地址：" + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("Hello from " + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in = new DataInputStream(inFromServer);
            System.out.println("服务器响应： " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}