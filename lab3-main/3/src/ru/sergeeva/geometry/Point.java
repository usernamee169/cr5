package ru.sergeeva.geometry;

/**
 * Класс для представления точки на плоскости.
 * @param x координата X (int)
 * @param y координата Y (int)
 * @param z координата Z (int), по умолчанию 0
 */
public class Point {
    private int x;
    private int y;
    private int z;

    /**
     * Конструктор для двумерной точки.
     */
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        this.z = 0;
    }

    /**
     * Конструктор для трехмерной точки.
     */
    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
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
        return z == 0 ? 
            "{" + x + ";" + y + "}" : 
            "{" + x + ";" + y + ";" + z + "}";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return x == point.x && y == point.y && z == point.z;
    }
}
