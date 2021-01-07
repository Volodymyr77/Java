package HW2;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Method;

@NoArgsConstructor
@AllArgsConstructor
@Data

public  class Animal {

    private  String food;
    private String location;

       public void makeNoise () {
           System.out.println(this + "make noise");
    }



    public  void animalEat() {

           System.out.println("hrum-hrum" + getFood());
    }

    public void   animalSleep(boolean isSleepWell) {
        if (isSleepWell) {
           System.out.println(this + "hrrrrrrrrrr....");
           return;
    }

        System.out.println(this + "sleeps bad");

}
