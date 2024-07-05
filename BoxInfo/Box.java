package BoxInfo;
//Create a class named “Box” which has 3 attribute: length, width, height and a method named
//getVolume(). getVolume() method will calculate the volume of the Box and return the value.
//From “main” method create 2 Box objects with different length, width, height, then call the
//getVolume() method and print the volumes.

//Class create
public class Box {
    double length;
    double width;
    double height;

    //Constructor create
    Box(double length, double width, double height)
    {
        this.height = height;
        this.length = length;
        this.width = width;
    }
    //Method Create
    public double getVolume()
    {
        return height*length*width;
    }
}
