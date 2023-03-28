import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class App {
    public static void main(String[] args) throws Exception {
        System.setProperty("https.protocols", "TLSv1,TLSv1.1,TLSv1.2");
        URL url = new URL("https://viacep.com.br/ws/01001000/json/");
        URLConnection connection = url.openConnection();
        InputStream conected = connection.getInputStream();

        BufferedReader br = new BufferedReader(new InputStreamReader(conected, "UTF-8"));

        String cep = "";
        StringBuilder jsonCep = new StringBuilder();
        while(( cep = br.readLine()) != null) {
            jsonCep.append(cep);
        }

        System.out.println(jsonCep.toString());
    }
}