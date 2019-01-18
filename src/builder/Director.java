package builder;

public class Director {
    private Builder mBuilder = null;

    public Director(Builder mBuilder) {
        this.mBuilder = mBuilder;
    }

    /**
     * 构建对象
     */
    public void construct(String board, String disPlay) {
        mBuilder.buildBoard(board);
        mBuilder.buildDisPlay(disPlay);
        mBuilder.buildOS();
    }
}

class DirectorText {

    public static void main(String[] args) {
        Builder builder = new MacBookBuilder();
        Director mDirector = new Director(builder);
        mDirector.construct("英特尔主板", "Retina 显示器");
        System.out.println("Computer info" + builder.create().toString());

    }
}
