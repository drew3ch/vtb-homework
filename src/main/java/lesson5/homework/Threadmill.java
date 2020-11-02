package lesson5.homework;

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
        if (participant instanceof Runable) {
            Runable runable = (Runable) participant;
            result = runable.getMaxRunVal() >= length;
        }
        if(!(participant instanceof Runable)) { reason = ", так как не умеет бегать"; }
        System.out.printf("Участник %s%s пробежал дорожку длиной %d" + reason + "%n",
                participant.getName(), result ? "" : " не", length);
        return result;
    }
}