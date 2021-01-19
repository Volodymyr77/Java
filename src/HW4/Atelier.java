package HW4;

import HW4.interfaces.MensClothes;
import HW4.interfaces.WomensClothes;
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
//        clothes.add(new Dress((SizeOfClothing.L, 43, "green"));
//        clothes.add(new Tie(SizeOfClothing.M, 23, "gray"));
//        clothes.add(new Pants(SizeOfClothing.S, 99, "black"));
//        clothes.add(new Pants(SizeOfClothing.XS, 32, "white"));
//        clothes.add(new Thort(SizeOfClothing.M, 64, "red"));

    }

    public List<MensClothes> getMensClothes() {
        List<MensClothes> mensClothes = new ArrayList<>();

        for (Clothes item : clothes) {
            if (item instanceof MensClothes) {
                mensClothes.add((MensClothes) item);
            }
        }

        return mensClothes;
    }

//    public List<WomensClothes> get
}
