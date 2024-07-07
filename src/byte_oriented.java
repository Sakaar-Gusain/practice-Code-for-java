import java.io.*;

class byte_oriented {
    public static void main(String[] args) {
        // Byte-Oriented and Character Oriented Streams
        try {
            // Write bytes to a file
            FileOutputStream fos = new FileOutputStream("byte_file.txt");
            fos.write(65); // 'A'
            fos.write(66); // 'B'
            fos.write(67); // 'C'
            fos.close();

            // Read bytes from a file
            FileInputStream fis = new FileInputStream("byte_file.txt");
            int b;
            while ((b = fis.read()) != -1) {
                System.out.print((char) b);
            }
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Java I/O Streams
        try {
            // Write bytes to a file
            OutputStream os = new FileOutputStream("stream_file.txt");
            os.write(65); // 'A'
            os.write(66); // 'B'
            os.write(67); // 'C'
            os.close();

            // Read bytes from a file
            InputStream is = new FileInputStream("stream_file.txt");
            int b;
            while ((b = is.read()) != -1) {
                System.out.print((char) b);
            }
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // Java Reader/Writer
        try {
            // Write characters to a file
            Writer writer = new FileWriter("writer_file.txt");
            writer.write('A');
            writer.write('B');
            writer.write('C');
            writer.close();

            // Read characters from a file
            Reader reader = new FileReader("writer_file.txt");
            int c;
            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
