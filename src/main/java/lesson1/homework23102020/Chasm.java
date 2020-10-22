package lesson1.homework23102020;

public class Chasm extends Obstacle {

    private final int height;

    public Chasm(String name, int height) {
        super(name);
        this.height = height;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = false;
        String reason = null;
        if (participant instanceof FlyAble) {
            result = participant.getMaxFlyVal() >= height;
        }
        if(!(participant instanceof FlyAble)) { reason = ", так как не умеет летать"; }
        System.out.printf("Участник %s%s перелетел пропасть высотой %d" + reason + "%n",
                participant.getName(), result ? "" : " не", height);
        return result;
    }
}
