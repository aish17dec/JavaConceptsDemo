package Java8Features;

public class StaticDefaultDemo {
    public static void main(String[] args) {
        NewGenCars gv = new MarutiGrandVitara();
        System.out.println(gv.isAutomatic());
        System.out.println(gv.isHybridModel());
        System.out.println(NewGenCars.isPetrolVariant());

        NewGenCars fg = new ForceGurkha();
        System.out.println(fg.isHybridModel());
    }
}

interface NewGenCars{
    static boolean isPetrolVariant(){
        return true;
    }

    default boolean isHybridModel(){
        return true;
    }

    public abstract boolean isAutomatic();
}

class MarutiGrandVitara implements NewGenCars{
    public boolean isAutomatic(){
        return true;
    }
}

class ForceGurkha implements NewGenCars{
    public boolean isAutomatic(){
        return false;
    }

    public boolean isHybridModel(){
        return false;
    }
}
