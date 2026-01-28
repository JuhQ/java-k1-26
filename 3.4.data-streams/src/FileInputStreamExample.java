import java.io.*;

public class FileInputStreamExample {
    public static void main(String[] args) {

        try (InputStream inputStream = new FileInputStream("file.txt")) {
            int data;


            while ((data = inputStream.read()) != -1) {
                // Process the byte data
                System.out.print(data + " = ");
                System.out.println((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (OutputStream outputStream = new FileOutputStream("file.txt")) {
            String text = "Hello, World!";
            byte[] bytes = text.getBytes();
            outputStream.write(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Reader reader = new FileReader("file.txt")) {
            int data;
            while ((data = reader.read()) != -1) {
                // Process the character data
                System.out.print((char) data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        try (Reader reader = new FileReader("file.txt");
             BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process the line of text
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        try (Writer writer = new FileWriter("file.txt");
             BufferedWriter bufferedWriter = new BufferedWriter(writer)) {
            bufferedWriter.write("Hello, World!");
            bufferedWriter.newLine();  // Write a new line
            bufferedWriter.write("This is an example of BufferedWriter.");

            // It is important to flush or close the writer to ensure the data is written to the file
            bufferedWriter.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
