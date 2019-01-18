package builder;

public abstract class Builder {

    public abstract void buildBoard(String board);

    public abstract void buildDisPlay(String disPlay);

    public abstract void buildOS();

    //创建computer
    public abstract Computer create();

}
