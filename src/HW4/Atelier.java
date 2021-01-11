package HW4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Atelier {

     private List<Clothes> clothes = new ArrayList<>();

    {
        clothes.add(new Dress(SizeOfClothing.S, 31, "pink"));
    }

}
