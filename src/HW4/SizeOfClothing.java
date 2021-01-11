package HW4;

public enum SizeOfClothing {

    XXS(56) {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    XS(54) {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    S(52) {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    M(50) {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    L(48) {
        @Override
        public void getDescription() {
            System.out.println("size is " +  SizeOfClothing.XXS.name() +", euro size is " + this.getEuroSize());
        }
    },
    ;


    private int euroSize;

    SizeOfClothing(int euroSize) {
        this.euroSize = euroSize;
    }

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
