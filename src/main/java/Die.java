public class Die {
    int sides;
    int value;
    int[] probabilities;
    int[] dieArray;

    public Die(int sides,int... probabilities) {
        this.sides = sides;
        this.probabilities = probabilities;
    }

    public void roll() throws Exception {
    }
}


