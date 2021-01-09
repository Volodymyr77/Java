package HW3_2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@Data
@AllArgsConstructor
@ToString

public class Drums implements Instrument {

    int Size;

    @Override
    public void playNote() {

    }
}
