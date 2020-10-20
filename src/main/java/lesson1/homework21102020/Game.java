package lesson1.homework21102020;

public class Game {

    private final Player[] players;

    private static final int MAX_BARRIERS = 3;
    private static Treadmill[] treadmills = new Treadmill[MAX_BARRIERS];
    private static Wall[] walls = new Wall[MAX_BARRIERS];

    public Game(Player... players) {
        this.players = players;
    }

    public void printAllNames() {
        for (Player player : players) {
            System.out.println(player.getName());
        }
    }

    public void getRunInfo() {
        for (Player player : players) {
            if(player.getRun() > 0) {
                System.out.println(player.getName() + " успешно пробежал " + player.getRun() + " метров.");
            } else if(player.getRun() <= 0) {
                System.out.println(player.getName() + " не смог бежать.");
                player.setRun(0);
            }
        }
    }

    public void getJumpInfo() {
        for (Player player : players) {
            if (player.getJump() > 0) {
                System.out.println(player.getName() + " перепрыгнул успешно " + player.getJump() + " метров в высоту.");
            } else if (player.getJump() <= 0) {
                System.out.println(player.getName() + " не смог перепрыгнуть.");
                player.setJump(0);
            }
        }
    }

    private void startGame() {
        boolean isWin = true;
        for (Player player : players) {
            for(int i = 0; i < MAX_BARRIERS; i++) {
                System.out.println(player.getName() + ": " + treadmills[i].getName());
                if(player.getRun() >= treadmills[i].getMeters()) {
                    System.out.println(player.getName() + " успешно пробежал " + treadmills[i].getMeters() + " метров.");
                    player.setRun(player.getRun() - treadmills[i].getMeters());
                    isWin = true;
                } else if(player.getRun() < treadmills[i].getMeters()) {
                    System.out.println(player.getName() + " не смог бежать.");
                    System.out.println("----------");
                    player.setRun(0);
                    isWin = false;
                    break;
                }
                System.out.println(player.getName() + ": " + walls[i].getName());
                if (player.getJump() >= walls[i].getHeight()) {
                    System.out.println(player.getName() + " перепрыгнул успешно " + walls[i].getHeight() + " метров в высоту.");
                    player.setJump(player.getJump() - walls[i].getHeight());
                    isWin = true;
                } else if (player.getJump() < walls[i].getHeight()) {
                    System.out.println(player.getName() + " не смог перепрыгнуть.");
                    System.out.println("----------");
                    player.setJump(0);
                    isWin = false;
                    break;
                }
            }
            if(isWin) {
                System.out.println(player.getName() + " успешно прошел все испытания.");
                System.out.println("----------");
            }
        }
    }

    public static void main(String[] args) {

        treadmills = new Treadmill[] {
                new Treadmill("Первый забег", 100),
                new Treadmill("Второй забег", 90),
                new Treadmill("Третий забег", 110)
        };
        walls = new Wall[] {
                new Wall("Первый прыжок", 50),
                new Wall("Второй прыжок", 40),
                new Wall("Третий прыжок", 60)
        };

        Game game = new Game(
                new Cat("Кот", 120,50, treadmills, walls),
                new Human("Человек", 110,99, treadmills, walls),
                new Robot("Робот", 10000,500, treadmills, walls)
        );

        game.printAllNames();
        System.out.println("----------");
        game.getRunInfo();
        System.out.println("----------");
        game.getJumpInfo();
        System.out.println("----------");
        game.startGame();
    }

}
