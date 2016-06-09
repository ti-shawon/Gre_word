package server;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;




public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket server=new ServerSocket(4444);
        Socket socket=server.accept();
        
        
        DataOutputStream ToServer = new DataOutputStream(socket.getOutputStream());
        BufferedReader FromServer = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        
        
        FileReader fin_user=new FileReader("username.txt");
        FileReader fin_pass=new FileReader("password.txt");
        Scanner src=new Scanner(fin_user);
        Scanner scan=new Scanner(fin_pass);
        
        
        
    }
    
}
