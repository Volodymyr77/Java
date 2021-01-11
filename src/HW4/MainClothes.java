package HW4;

import java.lang.reflect.Type;

public class MainClothes {

    public static void main(String[] args) {

        for (SizeOfClothing sizeOfClothing : SizeOfClothing.values()) {
            System.out.println(sizeOfClothing.getEuroSize());

        }
    }
}