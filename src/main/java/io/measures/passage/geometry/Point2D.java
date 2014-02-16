package io.measures.passage.geometry;

/**
 * Point2D
 * @author Dietrich Featherston
 */
public class Point2D implements Projectable2D {

    private final float x, y;

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float x() { return x; }
    public float y() { return y; }

    @Override
    public Projectable2D add(Projectable2D b) {
        return new Point2D(x + b.x(), y + b.y());
    }

    @Override
    public Projectable2D sub(Projectable2D b) {
        return new Point2D(x - b.x(), y - b.y());
    }

    @Override
    public Projectable2D mid(Projectable2D b) {
        return new Point2D((x + b.x())/2f, (y + b.y())/2f);
    }

    public float[] toArray() {
        return new float[] { x(), y() };
    }
}
