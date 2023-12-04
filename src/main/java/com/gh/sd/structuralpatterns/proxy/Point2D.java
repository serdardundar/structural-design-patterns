package com.gh.sd.structuralpatterns.proxy;

public class Point2D {

    private final float x;
    private final float y;

    public static final Point2D ZERO = new Point2D(0, 0);

    public Point2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point2D normalize() {
        float mag = magnitude();
        return new Point2D(x / mag, y / mag);
    }

    private float magnitude() {
        return (float) Math.sqrt(x * x + y * y);
    }

    public Point2D multiply(float scale) {
        return new Point2D(x * scale, y * scale);
    }

    public Point2D add(Point2D vect) {
        return new Point2D(x + vect.x, y + vect.y);
    }

    @Override
    public String toString() {
        return "Position: " +
            "x=" + x +
            ", y=" + y;
    }
}
