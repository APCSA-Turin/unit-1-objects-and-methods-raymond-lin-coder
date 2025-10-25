import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

public class CaptureHello {
    public static void main(String[] args) throws Exception {
        // save original System.out
        PrintStream originalOut = System.out;

        // set up a buffer to capture output
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        PrintStream capture = new PrintStream(baos, true, StandardCharsets.UTF_8);

        // redirect System.out to our capture stream
        System.setOut(capture);

        try {
            // --- code that prints to console (example) ---
            System.out.println("Teticle");
            // -----------------------------------------------

            // make sure everything is flushed into the buffer
            capture.flush();

            // convert buffer to a String
            String printedText = baos.toString(StandardCharsets.UTF_8);

            // decide what "printed Hello World!" means:
            // - use contains(...) to accept surrounding whitespace/newline
            // - use .trim().equals(...) to check exact content ignoring leading/trailing whitespace
            boolean found = printedText.contains("Teticle");

            // restore original System.out and print the boolean result
            System.setOut(originalOut);
            System.out.println(found); // prints "true" if "Hello World!" was printed
        } finally {
            // always restore System.out even if an exception is thrown
            System.setOut(originalOut);
            capture.close();
        }
    }
}