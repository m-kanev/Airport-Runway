package runway.Model;

public class Obstacle {

    private String name;
    private double height, length;
    private ObstaclePositionParam oParam;

    public Obstacle(String name, double height, double length) {
        this.name = name;
        this.height = height;
        this.length = length;
    }

    // Getter and setters for instance variables
    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setoParam(ObstaclePositionParam oParam) {
        this.oParam = oParam;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }
}
