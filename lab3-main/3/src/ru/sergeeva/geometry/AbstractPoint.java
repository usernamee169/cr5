package ru.sergeeva.geometry;


public abstract class AbstractPoint {
    /**
     * Абстрактный класс для представления точки с цветом и временем создания.
     * Служит базовым классом для всех типов точек.
     */
    
    private String color;
    private String creationTime;
    /**
     * Конструктор для создания точки с цветом и временем создания.
     *
     * @param color цвет точки (не может быть null или пустым)
     * @param creationTime время создания точки (не может быть null или пустым)
     * @throws IllegalArgumentException если color или creationTime null/пустые
     */
    
    public AbstractPoint(String color, String creationTime) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Цвет не может быть пустым");
        }
        if (creationTime == null || creationTime.trim().isEmpty()) {
            throw new IllegalArgumentException("Время создания не может быть пустым");
        }
        this.color = color;
        this.creationTime = creationTime;
    }

    /**
     * Возвращает цвет точки.
     * @return цвет точки
     */
    public String getColor() { 
        return color; 
    }

    /**
     * Устанавливает новый цвет точки.
     * @param color новый цвет (не может быть null или пустым)
     * @throws IllegalArgumentException если color null/пустой
     */
    public void setColor(String color) {
        if (color == null || color.trim().isEmpty()) {
            throw new IllegalArgumentException("Цвет не может быть пустым");
        }
        this.color = color; 
    }

    /**
     * Возвращает время создания точки.
     * @return время создания
     */
    public String getCreationTime() { 
        return creationTime; 
    }

    /**
     * Устанавливает новое время создания точки.
     * @param creationTime новое время создания (не может быть null или пустым)
     * @throws IllegalArgumentException если creationTime null/пустой
     */
    public void setCreationTime(String creationTime) { 
        if (creationTime == null || creationTime.trim().isEmpty()) {
            throw new IllegalArgumentException("Время создания не может быть пустым");
        }
        this.creationTime = creationTime; 
    }

    /**
     * Возвращает строковое представление точки.
     * @return строка в формате "Точка: цвет=[color], время создания=[creationTime]"
     */
    @Override
    public String toString() {
        return String.format("Точка: цвет=%s, время создания=%s", color, creationTime);
    }
}
