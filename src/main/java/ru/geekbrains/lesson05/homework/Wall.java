package ru.geekbrains.lesson05.homework;

public class Wall extends Obstacle {

    private final int height;

    public Wall(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = false;
        String reason = "";
        if (participant instanceof Jumpable) {
            Jumpable jumpable = (Jumpable) participant;
            result = jumpable.getMaxJumpVal() >= height;
        }
        if(!(participant instanceof Jumpable)) { reason = ", так как не умеет прыгать"; }
        System.out.printf("Участник %s%s перепрыгнул стену высотой %d" + reason + "%n",
                participant.getName(), result ? "" : " не", height);
        return result;
    }
}