package lesson4;

import lesson3.Printable;

public enum CarType implements Printable  {


// publik static final CarType SEDAN = new CarType("седан")
        SEDAN("седан") {
    @Override
    public void paint() {
        System.out.println(this.getUkrainianTranslation() + "фарбуємо в червноний");
    }
}, SUV("кросовер") {
        @Override
        public void paint() {
            System.out.println(this.getUkrainianTranslation() + "фарбуємо в чиній");
        }
    },

    HATCHBACK("хечбек") {
        @Override
        public void paint() {
            super.paint();
        }
    };



        private String ukrainianTranslation;

        CarType(String ukrainianTranslation) {
                this.ukrainianTranslation = ukrainianTranslation;
        }

        public String getUkrainianTranslation() {
                return ukrainianTranslation;
        }

        public void setUkrainianTranslation(String ukrainianTranslation) {
                this.ukrainianTranslation = ukrainianTranslation;
        }


        @Override
        public String toString() {
                return super.toString();
        }

    @Override
    public void paint() {
        System.out.println("painted");

    }
}
