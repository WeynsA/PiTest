import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class multicastReceiver {
    public static void main (String [] args){
        try{
            InetAddress group = InetAddress.getByName("143.129.39.106");
            MulticastSocket multicastSocket = new MulticastSocket(3009);
            multicastSocket.joinGroup(group); //blocking call

            byte[] buffer = new byte [100];
            DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
            multicastSocket.receive(packet);
            System.out.println(new String(buffer));

            multicastSocket.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
