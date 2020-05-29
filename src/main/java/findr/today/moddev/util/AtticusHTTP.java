package findr.today.moddev.util;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class AtticusHTTP {
	public static String get(String url) throws Exception {
		HttpURLConnection httpClient =
                (HttpURLConnection) new URL(url).openConnection();
        httpClient.setRequestMethod("GET");
        httpClient.setRequestProperty("User-Agent", "Atticus/1.0");
        int responseCode = httpClient.getResponseCode();
        try (BufferedReader in = new BufferedReader(
                new InputStreamReader(httpClient.getInputStream()))) {
            StringBuilder response = new StringBuilder();
            String line;
            while ((line = in.readLine()) != null) {
                response.append(line);
            }
            return response.toString();
        }
	}
}
