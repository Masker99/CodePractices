package com.rookie.basics.socket;

import java.io.*;
import java.net.Socket;

public class MyClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("127.0.0.1",9099);

        String mess = "i'm ok";

        try(BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(client.getOutputStream()));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(client.getInputStream()))){

            bufferedWriter.write(mess);
            bufferedWriter.newLine();
            bufferedWriter.flush();

            System.out.println("server:"+bufferedReader.readLine());;
        }
    }
}
