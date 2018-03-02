package Les9StudieChecker;

public class Studieadviseur {

    public static boolean krijgtPositiefStudieadvies(Student s) {
        int[] cijfers = s.getCijfers();
        int amount = 0;
        for (int i = 0; i < cijfers.length; i++) {
            if (cijfers[i] >= 5.5) {
                amount++;
            }
        }

        return amount >= 4;
    }
}
