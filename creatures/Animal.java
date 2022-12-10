package creatures;


public class Animal {
    private static final Double DEFLAUT_WALK_DYSTANS = 1000.0 ;
    private static final Object DEFLAUT_WALK_RODZAJ = ;
    public final String species;
    public String name;
    public Double weight;

    public Boolean isAlive;
    public Boolean czyBiegniemy;
    public Animal(String species){
        this.isAlive = true;
        this.species = species;

    }

    public void feed() {
        if (this.isAlive){
            this.weight = this.weight + 0.5;
            System.out.println("mniam dzięki");
        } else{
            System.out.println("nie karm trupa");
        }
    }


    public void takeForAWalk() {
        if (this.isAlive) {
            this.weight = this.weight - 0.5;
            System.out.println("zwierzę zdechło");
            if (this.weight <=0) {
                this.isAlive = false;
                System.out.println("zwierzę zostało zagłodzone");
            }
        } else {
            System.out.println("policja została wezwana");
        }
    }
    void takeForAWalk() {
        this.takeForAWalk(DEFLAUT_WALK_DYSTANS);
    }
    void takeForAWalk(Double dystans) {
        this.takeForAWalk(dystans, DEFLAUT_WALK_RODZAJ);
    }
    void takeForAWalk(double dystans, String ){
        if (czyBiegniemy) {
            int rodzaj;
            switch(rodzaj) {
                case "sprint" -> this.takeForAWalk += ;
                case "trócht" -> this.takeForAWalk += (1000 * );
            }
        }
    }
    public String toString(){
        return species+" "+name+" "+weight+" "+isAlive;
    }



}
