package ru.sergeeva.geometry;

/**
 * Трехмерная точка с координатами X, Y и Z.
 * @param x координата X (int)
 * @param y координата Y (int)
 * @param z координата Z (int)
 * @param color цвет точки (String)
 * @param creationTime время создания (String)
 */
public class Point3D extends AbstractPoint {
    private int x;
    private int y;
    private int z;

    public Point3D(int x, int y, int z, String color, String creationTime) {
        super(color, creationTime);
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        this(x, y, z, "не указан", "не указано");
    }

    public int getX() { 
        return x; 
    }
    
    public void setX(int x) { 
        this.x = x; 
    }

    public int getY() { 
        return y;
    }
    
    public void setY(int y) { 
        this.y = y; 
    }

    public int getZ() {
        return z; 
    }
    
    public void setZ(int z) { 
        this.z = z;
    }

    @Override
    public String toString() {
        return "Трехмерная точка: {" + x + ";" + y + ";" + z + "}, " + super.toString();
    }
}
