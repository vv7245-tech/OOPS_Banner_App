

public class array {

    public static void main(String[] args) {

        // 1. Create String array with 7 lines
        String[] lines = new String[7];

        // 2. Populate array using String.join()
        lines[0] = String.join(" ", " *** ", "  ***  ", " ***** ", " ***** ");
        lines[1] = String.join(" ", "*   *", " *   * ", "*     *", "*     *");
        lines[2] = String.join(" ", "*   *", " *   * ", "*     *", "*");
        lines[3] = String.join(" ", "*   *", " *   * ", " ***** ", " ***** ");
        lines[4] = String.join(" ", "*   *", " *   * ", "*       ", "      *");
        lines[5] = String.join(" ", "*   *", " *   * ", "*       ", "*     *");
        lines[6] = String.join(" ", " *** ", "  ***  ", "*       ", " ***** ");

        // 3. Enhanced for-loop to print banner
        for (String line : lines) {
            System.out.println(line);
        }
    }
}