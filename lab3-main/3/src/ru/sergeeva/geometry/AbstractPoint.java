package ru.sergeeva.geometry;

/**
 * Абстрактный класс для представления точки с дополнительными характеристиками.
 * @param color цвет точки (String)
 * @param creationTime время создания точки (String)
 */
public abstract class AbstractPoint {
    private String color;
    private String creationTime;

    /**
     * Конструктор для создания точки с цветом и временем создания.
     */
    public AbstractPoint(String color, String creationTime) {
        this.color = color;
        this.creationTime = creationTime;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color; 
    }

    public String getCreationTime() {
        return creationTime; 
    }
    public void setCreationTime(String creationTime) { 
        this.creationTime = creationTime; 
    }

    @Override
    public String toString() {
        return "Точка: цвет=" + color + ", время создания=" + creationTime;
    }
}
