package ru.sergeeva.geometry;

/**
 * Абстрактный класс для представления геометрических фигур.
 * @param color цвет фигуры (String)
 * @param creationTime время создания фигуры (String)
 */
public abstract class Shape {
    private String color;
    private String creationTime;

    /**
     * Конструктор для создания фигуры с цветом и временем создания.
     * @param color цвет фигуры
     * @param creationTime время создания
     */
    public Shape(String color, String creationTime) {
        this.color = color;
        this.creationTime = creationTime;
    }

    /**
     * Получение цвета фигуры.
     * @return цвет фигуры (String)
     */
    public String getColor() { 
        return color; 
    }

    /**
     * Установка цвета фигуры.
     * @param color новый цвет фигуры
     */
    public void setColor(String color) { 
        this.color = color; 
    }

    /**
     * Получение времени создания фигуры.
     * @return время создания (String)
     */
    public String getCreationTime() { 
        return creationTime; 
    }

    /**
     * Установка времени создания фигуры.
     * @param creationTime новое время создания
     */
    public void setCreationTime(String creationTime) { 
        this.creationTime = creationTime; 
    }

    @Override
    public String toString() {
        return "Фигура: цвет=" + color + ", время создания=" + creationTime;
    }
}
