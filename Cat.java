package ru.geekbrains;

public class Cat implements Action{

    private String name;
    private int running;
    private int jumping;

    public Cat(String name, int running, int jumping) {
        this.name = name;
        this.running = running;
        this.jumping = jumping;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRunning() {
        return running;
    }

    public void setRunning(int running) {
        this.running = running;
    }

    public int getJumping() {
        return jumping;
    }

    public void setJumping(int jumping) {
        this.jumping = jumping;
    }

    @Override
    public void run(int distance) {
        System.out.printf("Кошка %s умеет бегать. Сможет пробежать %d м.\n",name,distance);

    }

    @Override
    public void jump(int distance) {
        System.out.printf("Кошка %s умеет прыгать. Сможет прыгнуть на %d м.",name,distance);

    }

}
