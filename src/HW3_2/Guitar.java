package HW3_2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString

public class Guitar extends MainBand implements Instrument {

    int stringsNumber;

    public static void playString() {
        playString();
        System.out.println("Gm, Cm");
    }


    @Override
    public void playNote() {

    }
}
