package com.example.socket_java;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import java.net.URISyntaxException;


import io.socket.client.IO;
import io.socket.client.Socket;


public class MainActivity extends AppCompatActivity {

    private Socket mSocket;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        try {
            mSocket = IO.socket("13.124.108.182:3000");
            mSocket.connect();
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }
        mSocket.connect();

    }
}
