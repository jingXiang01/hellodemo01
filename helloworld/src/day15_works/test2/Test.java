package day15_works.test2;

public class Test {
    public static void main(String[] args) {
        newPhone np = new newPhone();
        usePhone(np);

        oldPhone op = new oldPhone();
        usePhone(op);
    }

    public static void usePhone(Phone p)
    {
        if(p instanceof oldPhone)
        {
            oldPhone op = (oldPhone) p;
            op.call();
            op.sendMessage();
        } else if (p instanceof newPhone) {
            newPhone np = (newPhone) p;
            np.playGame();
            np.call();
            np.sendMessage();
        }
    }
}
