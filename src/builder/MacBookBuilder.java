package builder;

public class MacBookBuilder extends Builder {


    private Computer computer = new MacBook();

    @Override
    public void buildBoard(String board) {
        computer.setmBoard(board);
    }

    @Override
    public void buildDisPlay(String disPlay) {
        computer.setmDisplay(disPlay);
    }

    @Override
    public void buildOS() {
        computer.setmOs();
    }

    @Override
    public Computer create() {
        return computer;
    }
}
