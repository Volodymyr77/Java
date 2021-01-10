package HW4;

public enum SizeOfClothing {

    XXS() {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    XS() {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    S() {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    M() {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    L() {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    ;


    private int euroSize;

    void SizeOfClothing(int euroSize) {
        this.euroSize = euroSize;
    };

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }

    public abstract void getDescription();





}
