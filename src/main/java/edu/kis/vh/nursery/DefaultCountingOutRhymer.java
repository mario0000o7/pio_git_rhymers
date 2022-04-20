package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int NUMBERS = 12;
    public static final int TOTAL = -1;
    public int total = TOTAL;
    private final int[] numbers = new int[NUMBERS];

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
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
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
