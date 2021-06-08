public class RandomNumber {
    public int generateInteger(int min, int max) {
        double randomDouble = Math.random();
        int randomInteger = (int) (randomDouble * (max - min) + min);
        return randomInteger;
    }
}
