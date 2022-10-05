import java.io.File;
import java.io.IOException;
import java.util.Map;

public class Main {

    public static void main(String[] args){
	    ProcessBuilder pb = new ProcessBuilder();
        pb.command("cmd.exe", "/c", "code", ".");

        pb.directory(new File("C:\\Users\\Dani\\Documents"));
        Process process = null;

        System.out.println(pb.environment());
        Map<String, String> env = pb.environment();
        env.put("Delegado", "Edunator");
        System.out.println(env);

        try {
            process = pb.start();
            int exitCode = process.waitFor();
            System.out.println("Esto hizo chin pun con codigo " + exitCode);

        }catch (IOException | InterruptedException e) {
            System.out.println("Ta petao");
            e.printStackTrace();
        }
    }
}
