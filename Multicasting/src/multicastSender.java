import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class multicastSender {
    public static void main(String [] args){
        try {
            InetAddress group = InetAddress.getByName("143.129.39.106");
            MulticastSocket multicastSocket = new MulticastSocket();
            String msg = "Hello group1";
            DatagramPacket packet = new DatagramPacket(msg.getBytes(), msg.length(), group, 3008);
            multicastSocket.send(packet);
            multicastSocket.close();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
