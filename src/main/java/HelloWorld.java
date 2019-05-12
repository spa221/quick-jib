/**
 * @author sns
 * @date 2019/5/12
 */

import com.google.common.io.Resources;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class HelloWorld {


    public static void main(String[] args) throws URISyntaxException, IOException {
        Path worldFile = Paths.get(Resources.getResource("world").toURI());
        String world = new String(Files.readAllBytes(worldFile), StandardCharsets.UTF_8);

        System.out.println("Hello " + world);
    }
}
