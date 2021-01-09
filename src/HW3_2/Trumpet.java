package HW3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@Data
@NoArgsConstructor
@ToString

public class Trumpet implements Instrument {

    int diametr;


    @Override
    public void playNote() {

    }
}
