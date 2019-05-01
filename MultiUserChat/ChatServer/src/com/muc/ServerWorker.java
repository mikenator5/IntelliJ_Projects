package com.muc;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class ServerWorker extends Thread {

    private final Socket clientSocket;

    public ServerWorker(Socket clientSocket) {
        this.clientSocket = clientSocket;

    }

    @Override
    public void run() {
        try {
            handleClientSocket();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void handleClientSocket() throws IOException, InterruptedException {
        InputStream inputStream = clientSocket.getInputStream();
        OutputStream outputStream  = clientSocket.getOutputStream();

        
        clientSocket.close();
    }
}
