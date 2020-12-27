package lesson4;

public enum CarType implements Paintable {


// publik static final CarType SEDAN = new CarType("седан")
        SEDAN("седан"), SUV("кросовер"), HATCHBACK("хечбек");



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
}
