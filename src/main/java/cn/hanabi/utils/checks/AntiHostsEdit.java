package cn.hanabi.utils.checks;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

public class AntiHostsEdit {

    public static void run() throws IOException {
        String fileName = "/Windows/System32/drivers/etc/hosts";
        java.nio.file.Path path = Paths.get(fileName);
        byte[] bytes = Files.readAllBytes(path);
        List<String> allLines = Files.readAllLines(path, StandardCharsets.UTF_8);

        allLines.forEach(line -> {
            Stream.of("hypixel", "mineplex", "cubecraft").filter(server -> line.toLowerCase().contains(server)).forEach(server -> {
                try {
                    Class.forName("javax.swing.JOptionPane").getDeclaredMethod("showMessageDialog", java.awt.Component.class, Object.class, String.class, int.class).invoke(Class.forName("javax.swing.JOptionPane"), null, "Editing your hosts file really? " + "\n" + "Debugging is just skidding with extra work ;)", "Stop", 0);
                } catch (Exception ignored) {
                }
            });
        });
    }
}
