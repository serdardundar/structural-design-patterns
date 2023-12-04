package com.gh.sd.structuralpatterns.proxy;

//Our concrete class providing actual functionality
public class BitmapImage implements Image {

    private Point2D location;
    private String name;

    public BitmapImage(String filename) {
        //Loads the image from file on disk
        System.out.println("Loaded from disk: " + filename);
        name = filename;
    }

    @Override
    public void setLocation(Point2D point2D) {
        location = point2D;
    }

    @Override
    public Point2D getLocation() {
        return location;
    }

    @Override
    public void render() {
        System.out.println("Rendered: " + name);
    }
}
