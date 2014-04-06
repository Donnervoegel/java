// Macs give: `Mac OS X`
// Windows 8.1 gives: `Windows 8.1`

public class OSTest {
    public static void main(String[] argv) {
	String command = System.getProperty("os.name");

	System.out.println(command);
    }
}
