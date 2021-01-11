package HW4;

import HW4.interfaces.WomensClothes;

public class Dress extends Clothes implements WomensClothes {


    public Dress(SizeOfClothing size, double price, String color) {
        super(size,price, color);
    }

    @Override
    public void dressWoman() {
        super.dressWoman();
    }
}
