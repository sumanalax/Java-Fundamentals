public class ZooKeeperMammal{
    // private String name;
    private int energy = 100;

    public ZooKeeperMammal(){
        //this.name = name;
        this.energy = energy;
    }

    public int getEnergy(){
        return this.energy;
    }

    public ZooKeeperMammal setEnergy(int val){
        this.energy = val;
        return this;

    }


}