package lesson15;

import org.w3c.dom.ls.LSOutput;

import java.io.File;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.FileChannel;
import java.nio.channels.SocketChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class NIOFiles {
    public static void main(String[] args) {
        //NIO
        // каналы Chanel
        // буффер Buffer
        // Кодировки


        //Chanel:
//        FileChannel позволяет рабоать с фалами
//       DatagramChannel для передачи данных по UDP протоколу
//        SocketChannel  и ServerSocketChanel для передачи TCP протоколу

        File file = new File("nio.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            writeFromFile(file.toPath(), "String");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeToFile(Path path, String string) throws IOException {
        //    Files.write(path, string.getBytes(), StandardOpenOption.APPEND); // передать путь к файлу, массив байт,
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(path, StandardOpenOption.APPEND)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(string.getBytes().length);
            byteBuffer.put(string.getBytes(StandardCharsets.UTF_8));
            byteBuffer.flip();

            fileChannel.write(byteBuffer); //  будет писать из буфера в канал

        }

    }

    public static void writeFromFile(Path path, String string) throws IOException {
        try (FileChannel fileChannel = (FileChannel) Files.newByteChannel(path)) {
            ByteBuffer byteBuffer = ByteBuffer.allocate(512);
            while (fileChannel.read(byteBuffer) > 0) {
                byteBuffer.flip();
                for (int i = 0; i < byteBuffer.limit(); i++) {
                    System.out.println((char) byteBuffer.get());
                }
                byteBuffer.clear();
            }
        }
        List<String> lenes = Files.readAllLines(path);
        Files.lines(path, StandardCharsets.UTF_8).forEach(System.out::println);

    }
}
