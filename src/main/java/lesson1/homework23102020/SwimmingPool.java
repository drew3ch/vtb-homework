package lesson1.homework23102020;

public class SwimmingPool extends Obstacle {

    private final int length;

    public SwimmingPool(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = false;
        String reason = null;
        if (participant instanceof SwimAble) {
            result = participant.getMaxSwimVal() >= length;
        }
        if(!(participant instanceof SwimAble)) { reason = ", так как не умеет плавать"; }
        System.out.printf("Участник %s%s перепрыл водоем длиной %d" + reason + "%n",
                participant.getName(), result ? "" : " не", length);
        return result;
    }
}
