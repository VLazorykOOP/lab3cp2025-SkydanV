package Bridge;

public class DarkRomanceAuthor implements Author {
    @Override
    public void writeText() {
        System.out.println("Dark romance author write dark romance...");
    }
}