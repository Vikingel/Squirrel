public class Squirrel {
    public static void getNuts(Tree tr1) {
        tr1.growNuts(15);
                for (int i = 0; i < 15; i++) {
            getNuts(tr1);
        }
        System.out.println(getNuts(tr1)*15);

    }
}