package HW4;

import HW4.interfaces.MensClothes;
import HW4.interfaces.WomensClothes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Clothes implements MensClothes, WomensClothes {

    private SizeOfClothing size;
    private double price;
    private String color;

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
