package com.rookie.basics.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class MyServer {
    public static  void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9099);

        Socket client = server.accept();

//        byte[] result = new byte[1024];
//
//        try(BufferedInputStream bufferedInputStream = new BufferedInputStream(client.getInputStream());){
//            bufferedInputStream.read(result);
//
//            System.out.println(Arrays.toString(result));
//        }
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()));
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()))){

            String result = bufferedReader.readLine();
            System.out.println("client:"+result);
            bufferedWriter.write("hello client");
        }
    }
}
