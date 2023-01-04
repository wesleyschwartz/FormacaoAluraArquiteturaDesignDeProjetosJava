package src.main.java.com.compasso.loja.http;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {
    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL url1 = new URL(url);
            URLConnection urlConnection = url1.openConnection();
            urlConnection.connect();
        } catch (IOException e) {
            throw new RuntimeException("Erro ao enviar requisao http",e);
        }

    }
}
