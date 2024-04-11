public class Tree {
    private Nut[] nuts;

    public Tree(int countOfNuts) {
        nuts = growNuts(countOfNuts);
    }

    public Nut[] getNutTree() {
        return nuts;
    }

    public Nut[] growNuts(int n) {
        this.nuts = new Nut[n];
        for (int i = 0; i < n; i++) {
            this.nuts[i] = new Nut();
        }
        return this.nuts;
    }
}

