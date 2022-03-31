package com.rookie.basics.network;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author Masker
 */
public class socketTCP03Server {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(9997);
        Socket socket = serverSocket.accept();

        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(inputStream));

        OutputStream outputStream = socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));

        while(true){

//            System.out.println(bufferedReader.readLine());
            bufferedWriter.write("hello client 字符流 from server");
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println(bufferedReader.readLine());

        }

//        OutputStream outputStream = socket.getOutputStream();
//        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
//        bufferedWriter.write("hello client 字符流");
//        bufferedWriter.newLine();
//        socket.shutdownOutput();
//        bufferedWriter.flush();
//        bufferedReader.close();
//        bufferedWriter.close();
//        socket.close();
//        serverSocket.close();

    }
}
