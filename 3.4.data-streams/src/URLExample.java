import java.io.*;
import java.net.*;

public class URLExample {
    public static void main(String[] args) {
        // first, create the url
        URL myUrl;
        try {
            myUrl = new URL("https://users.metropolia.fi/~jarkkov/koe.txt");

            // open the connection and get the input stream
            // it will automatically generate HTTP GET-request
            InputStream istream = myUrl.openStream();


            // jump to character streams
            InputStreamReader istreamreader = new InputStreamReader(istream);

            // and to buffered reader for efficiency
            BufferedReader reader = new BufferedReader(istreamreader);

            // we use StringBuilder for efficiency, concatenating ordinary Strings is slow and
            // generates unnecessary objects
            String line;
            StringBuilder response = new StringBuilder();

            // here we read the content of the web page line by line
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            int[] arr = {1,2,3};

            System.out.println(arr[5]);

            // now it is time to print the result
            reader.close();
            System.out.println(response.toString());
        } catch (MalformedURLException e) {
            System.err.println(e);
            System.out.println("Virhe tapahtui (URL): " + e.getMessage());
            return;
        } catch (IOException e) {
            System.err.println(e);
            System.out.println("Virhe tapahtui (IOException): " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Virhe tapahtui (Exception): " + e.getMessage());
        }

    }
}