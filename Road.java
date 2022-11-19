package ru.geekbrains;

public class Road implements Barrier {

    private int length;

    public Road(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void barrier(int distance) {
        if (distance <= length) {
            System.out.printf("Расстояние по трассе составляет %d км. Ура, дистанция была успешно пройдена!\n\n", distance);
        } else {
            System.out.printf("Расстояние по трассе составляет %d км. Дистанция слишком велика, чтобы ее пробежать.\n\n", distance);
        }
    }
}
