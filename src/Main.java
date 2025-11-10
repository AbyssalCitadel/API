import java.net.HttpURLConnection;
import java.net.*;
import com.google.gson.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        try {

        URL url = new URL("https://color.serialif.com/aquamarine");
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("GET");


        int responseCode = connection.getResponseCode();
        System.out.println("Response Code: " + responseCode);


            if (responseCode == HttpURLConnection.HTTP_OK) {
                BufferedReader in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
                String inputLine;
                StringBuilder response = new StringBuilder();

                while ((inputLine = in.readLine()) != null) {
                    response.append(inputLine);
                }
                in.close();
                System.out.println(response.toString());



                //Lots of possible errors, my goodness
            }
    } catch (ProtocolException e) {
            throw new RuntimeException(e);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }}

//https://color.serialif.com/aquamarine