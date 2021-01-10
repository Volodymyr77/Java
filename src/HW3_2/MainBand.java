package HW3_2;

public class MainBand {

    public static void main(String[] args) {

        Instrument[] instrument = {
            new Guitar(),
                    new Guitar(),
                new Drums(),
            new Drums(),
            new Trumpet()
        };
        for (int i = 0; i < instrument.length; i++) {
            Instrument instrument1 = instrument[i];
            System.out.println(Instrument.key);


        }
    }
}
