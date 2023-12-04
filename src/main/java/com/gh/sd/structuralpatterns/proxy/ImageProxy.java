package com.gh.sd.structuralpatterns.proxy;

//Proxy class
public class ImageProxy implements Image {

    private String name;
    private BitmapImage image;
    private Point2D location;

    public ImageProxy(String filename) {
        this.name = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        if (image != null) {
            image.setLocation(point2D);
        } else {
            location = point2D;
        }
    }

    @Override
    public Point2D getLocation() {
        return image != null ? image.getLocation() :
            location;
    }

    @Override
    public void render() {
        if (image == null) {
            image = new BitmapImage(name);
            if (location != null) {
                image.setLocation(location);
            }
        }
        image.render();
    }
}
