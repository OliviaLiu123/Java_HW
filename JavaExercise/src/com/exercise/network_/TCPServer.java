package com.exercise.network_;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/*TCP 编程（字节）
1. 编写一个服务端和一个客户端
2.服务端在9999端口监听
3.客户端连接到服务端，发送"hello,server",然后退出
4.服务器端接收到客户端发送的信息，输出，并退出

 */
//服务端
public class TCPServer {
    public static void main(String[] args) throws IOException {


        //思路：
        //1.在本机9999端口监听，等待连接
        //细节：要求本机没有其他服务监听9999端口
        ServerSocket serverSocket = new ServerSocket(9999);

        //2.当客户端连接9999端口是，程序会 阻塞，等待连接
        // 如果有客户端链接，
        Socket socket=serverSocket.accept();


    }
}
