package com.rookie.basics.socket.groupchat;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class Server {
    private static List<Socket> sockets = new ArrayList<>();

    static class ServerReadThread implements Runnable{
        private Socket socket;

        public ServerReadThread(Socket socket) {
            this.socket = socket;
        }

        @Override
        public void run() {
            try{
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                while(true){
                    String message = bufferedReader.readLine();
                    for (Socket socket: sockets){
                        if (socket == this.socket){
                            continue;
                        }
                        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
                        bufferedWriter.write(socket.toString()+":"+message);
                        bufferedWriter.newLine();
                        bufferedWriter.flush();
                    }
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(9099);

        while(true){
            Socket client = server.accept();

            sockets.add(client);

            new Thread(new ServerReadThread(client)).start();
        }
    }
}
