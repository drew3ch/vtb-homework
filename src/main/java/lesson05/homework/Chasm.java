package lesson05.homework;

public class Chasm extends Obstacle {

    private final int height;

    public Chasm(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = false;
        String reason = "";
        if (participant instanceof Flyable) {
            Flyable flyable = (Flyable) participant;
            result = flyable.getMaxFlyVal() >= height;
        }
        if(!(participant instanceof Flyable)) { reason = ", так как не умеет летать"; }
        System.out.printf("Участник %s%s перелетел пропасть высотой %d" + reason + "%n",
                participant.getName(), result ? "" : " не", height);
        return result;
    }
}
