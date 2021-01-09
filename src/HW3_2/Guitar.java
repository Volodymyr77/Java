package HW3_2;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@ToString

public class Guitar extends MainBand implements Instrument {

    int stringsNumber;


    @Override
    public void playNote() {

    }
}
