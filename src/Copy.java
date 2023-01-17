import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Copy {
    public static void main(String[] args) {
        copy(args[0], args[1]);

    }

    private static void copy(String source, String dest) {
        Path p = null;
        InputStream is = null;
        Path pout = null;
        OutputStream os = null;
        try {
            // deschid un fisiser sursa
            // creez un fisier destinatie
            // sa copiez byte cu byte

            //Stream
            p = Paths.get(source);
            is = Files.newInputStream(p);
            pout = Paths.get(dest);
            os = Files.newOutputStream(pout);
            byte[] b = new byte[1024];
            while(is.read()!=-1){
                os.write(b);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(is!=null)
                is.close();
                if(os!=null)
                os.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
    }
