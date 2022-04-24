package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int NUMBERS = 12;
    private static final int TOTAL = -1;
    private int total = getTOTAL();
    private final int[] numbers = new int[getNUMBERS()];

    public static int getNUMBERS() {
        return NUMBERS;
    }

    public static int getTOTAL() {
        return TOTAL;
    }

    public int getTotal() {
        return this.total;
    }


    public void countIn(int in) {
        if (!isFull())
            getNumbers()[++total] = in;
    }

    public boolean callCheck() {
        return total == -1;
    }

    public boolean isFull() {
        return total == 11;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return getNumbers()[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return getNumbers()[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
