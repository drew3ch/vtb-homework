package lesson1.homework23102020;

public class Threadmill extends Obstacle {

    private final int length;

    public Threadmill(String name, int length) {
        super(name);
        this.length = length;
    }

    @Override
    public boolean canPass(Participant participant) {
        boolean result = false;
        String reason = "";
        if (participant instanceof RunAble) {
            result = participant.getMaxRunVal() >= length;
        }
        if(!(participant instanceof RunAble)) { reason = ", так как не умеет бегать"; }
        System.out.printf("Участник %s%s пробежал дорожку длиной %d" + reason + "%n",
                participant.getName(), result ? "" : " не", length);
        return result;
    }
}