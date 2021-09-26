package com.rookie.basics.socket.groupchat;

import java.io.*;
import java.net.Socket;

public class ClitentTwo {
    static class ClientThread implements Runnable{
        private Socket socket;

        public ClientThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try {
                while (true) {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                    System.out.println(bufferedReader.readLine());
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1",9099);

        new Thread(new ClientOne.ClientThread(socket)).start();

        while(true){
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            String message = bufferedReader.readLine();

            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            bufferedWriter.write(message);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
    }
}
