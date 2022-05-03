package edu.kis.vh.nursery;

/**
 * Klasa dostarczająca klasyczną wyliczankę oparta o kolejkę First In First Out
 */
public class FIFORhymer extends DefaultCountingOutRhymer {

    private final DefaultCountingOutRhymer temp = new DefaultCountingOutRhymer();

    /**
     * @return Metoda countOut odlicza elementy, które zawiera klasa FIFORhymers
     */
    @Override
    public int countOut() {
        while (!callCheck())

            getTemp().countIn(super.countOut());

        int ret = getTemp().countOut();

        while (!getTemp().callCheck())

            countIn(getTemp().countOut());

        return ret;
    }

    /**
     * @return Metoda zwraca tablice elementów temp
     */
    public DefaultCountingOutRhymer getTemp() {
        return temp;
    }
}
