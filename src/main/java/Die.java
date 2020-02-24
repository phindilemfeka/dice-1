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
        dieArray = new int[sides]; //die array to hold the sides of the die
        for (int i = 0; i < dieArray.length; i++) {
            dieArray[i] = i + 1;
        }
        int sum = getSum();
        int randomise = (int) (Math.random() * sum + 1); //randomising the sum of probability
        for (int i = 0; i < sides; i++) {
            randomise -= this.probabilities[i]; //random value - weight of the die
            if (randomise <= 0) { //if random value is less/equal to 0...
                value = dieArray[i]; //return the value of that die
                return;
            }
            if (this.probabilities[i] < 0) {
                throw new Exception("negative probabilities not allowed");
            }
            if (sum < 1) {
                throw new Exception("probability sum must be greater than 0");
            }
        }
}
     /*Calculating the sum of probabilities or the weight of the die*/
    private int getSum() {
        int sum=0;
        for (int probability : this.probabilities) {
            sum += probability;
        }
        return sum;
    }

    public void setProbabilities(int... probabilitiesArray){
        this.probabilities = probabilitiesArray;
    }
}


