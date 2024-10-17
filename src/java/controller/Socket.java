/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;

/**
 *
 * @author Ishan
 */
@ServerEndpoint("/Socket")
public class Socket {

    @OnOpen
    public void open(Session session) throws IOException{
        System.out.println("Open");
        session.getBasicRemote().sendText("Server : Hello");
    }

    @OnClose
    public void close(Session session) {
        System.out.println("Close");
    }

    @OnError
    public void onError(Throwable error) {
        System.out.println("Error");
    }

    @OnMessage
    public void handleMessage(String message, Session session) {
        System.out.println(message);
    }

}
