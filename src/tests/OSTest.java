// Macs give: `Mac OS X`

public class OSTest {
    public static void main(String[] argv) {
	String command = System.getProperty("os.name");

	System.out.println(command);
    }
}
