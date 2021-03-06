package data;

import java.io.Serializable;

/**
 * Coordinates of vehicle
 */
public class Coordinates implements Serializable {
    private Float x;
    private Double y;

    public Coordinates(Float x, Double y) {
        this.x = x;
        this.y = y;
    }

    public Float getX() {
        return x;
    }

    public Double getY() {
        return y;
    }

    @Override
    public String toString() {
        return "x:" + x +
                ", y:" + y ;
    }
}
