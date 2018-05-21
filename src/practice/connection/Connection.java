package practice.connection;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Connection {

    private int port = 1234; //Puerto para la conexión
    private String host = "localhost"; //Host para la conexión
    protected String serverMessage; //Mensajes entrantes (recibidos) en el servidor
    protected ServerSocket ss; //Socket del servidor
    protected Socket cs; //Socket del cliente
    protected DataOutputStream serverOutput, clientOutput; //Flujo de datos de salida
    protected DataInputStream serverInput, clientInput;

    public Connection(String tipo) throws IOException //Constructor
    {
        if(tipo.equalsIgnoreCase("servidor") || tipo.equalsIgnoreCase("server"))
        {
            ss = new ServerSocket(port);//Se crea el socket para el servidor en puerto 1234
            cs = new Socket(); //Socket para el cliente
        }
        else
        {
            cs = new Socket(host, port); //Socket para el cliente en localhost en puerto 1234
        }
    }

    public Connection(String tipo, int port, String host)throws IOException //Constructor
    {

        if(tipo.equalsIgnoreCase("servidor") || tipo.equalsIgnoreCase("server") )
        {
            ss = new ServerSocket(port);
            cs = new Socket();
        }
        else
        {
            cs = new Socket(host, port);
        }
    }
}
