package lesson17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Map;

public class WPStream {
    public static void main(String[] args) throws IOException {

        File file = new File("resource/wp.txt");
        Map<String, Long> map = Files.lines((file.toPath()))
                .parallel()
                .map(String::toLowerCase)
                .flatMap(line -> Arrays.stream(line.split(" ")))
                .count()

    }
}
