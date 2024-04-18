import java.io.IOException;

/**
 * ReadFromConsole using System.in
 */
public class ReadFromConsole {

    public static void main(String[] args) throws IOException {
        int readedByte;
        
        System.out.print("Introduza uma linha de texto: ");
        do {
            readedByte = System.in.read();
            System.out.println("Caráter: " + (char) readedByte + " UNICODE code:" + readedByte);
        } while (readedByte != 10);

        byte[] bufferIn = new byte[25];

        System.out.print("Introduza outra linha de texto: ");

        System.in.read(bufferIn);

        for (byte b : bufferIn) {
            System.out.println("Caráter: " + (char) b + " UNICODE code:" + b);
        }

    }
}