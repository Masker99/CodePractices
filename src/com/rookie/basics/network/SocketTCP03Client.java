package com.rookie.basics.network;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @author Masker
 */
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket(InetAddress.getLocalHost(),9997);

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));

        System.out.println("客户端已向服务端发送.....");
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

        while(true) {
            System.out.println(bufferedReader.readLine());
            bufferedWriter.write("hello, server 字符流  from client");
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
