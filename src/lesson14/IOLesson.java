package lesson14;

import java.io.*;
import java.util.Arrays;
import java.util.RandomAccess;

public class IOLesson {
    public static void main(String[] args) {
        // io пакет
        // nio пакет

        //   InputStream
        //   OutputStream

        File file = new File("io.txt");
        try {
            writeToFile(file, true);
            //  writeWithBuffer(file);
            readByteArray(file);
            writeReadData(file);
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public static void writeToFile(File file, boolean append) throws IOException {
        try (FileOutputStream fileOutput = new FileOutputStream(file, append)) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 10; i++) {
                sb.append("Line ").append(i).append("\n");
            }
            byte[] bytes = sb.toString().getBytes();
            fileOutput.write(bytes);
        }
    }

    public static String readByteArray(File file) throws IOException {
        String string = null;
        try (FileInputStream fileInputStream = new FileInputStream(file);
             ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        ) {
            System.out.println(fileInputStream.available());

            byte[] buf = new byte[10];
            int data;

            while ((data = fileInputStream.read(buf)) > 0) {
                System.out.println(data);
                System.out.println(Arrays.toString(buf));
                outputStream.write(buf, 0, data);
            }
            string = new String(outputStream.toByteArray());
        }
        return string;
    }

    public static void writeWithBuffer(File file) throws IOException {
        try (FileOutputStream fileOutputStream = new FileOutputStream(file);
             BufferedOutputStream outputStream = new BufferedOutputStream(fileOutputStream);
        ) {
            for (int i = 0; i < 1_000_000; i++) {
                outputStream.write((i + " ").getBytes());
            }

        }
    }


    public static String readFromSeveralFiles(File... files) throws IOException {
        String string = null;
        try (
                FileInputStream input1 = new FileInputStream(files[0]);
                FileInputStream input2 = new FileInputStream(files[1]);
                ByteArrayOutputStream bout = new ByteArrayOutputStream()
        ) {
            SequenceInputStream sequenceInputStream = new SequenceInputStream(input1, input2);

            byte[] buf = new byte[10];
            int data;
            while ((data = sequenceInputStream.read(buf)) > 0) ;
            bout.write(buf, 0, data);

            string = new String(bout.toByteArray());
        }
        return string;
    }


    public static void writeReadData(File file) throws IOException {
        try (
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                DataOutputStream dataOutput = new DataOutputStream(fileOutputStream);
        ) {
            dataOutput.writeDouble(4.6);
            dataOutput.writeFloat(5.9f);
            dataOutput.writeUTF("hello");
        }
        try (FileInputStream fileInputStream = new FileInputStream(file);
             DataInputStream dataInputStream = new DataInputStream(fileInputStream);
        ) {
            System.out.println(dataInputStream.readDouble());
            System.out.println(dataInputStream.readFloat());
            System.out.println(dataInputStream.readUTF());
        }

    }

 // д.з     RandomAccess позволяет работать с серединой файла, позволяет открывать фаил в режиме записи/чтения
    //  написать свою реализацию инпутстрима и аутпут стрима, будут расширять фильт инпутстрим и аутпутстрим
    // шифровать "XOR

}