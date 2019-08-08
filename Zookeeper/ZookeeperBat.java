public class ZooKeeperBat extends ZooKeeperMammal{
    private int energy;

    public ZooKeeperBat(){
        setEnergy(300);
    }

    public ZooKeeperBat fly(){
        if(getEnergy() - 50 >0){
            System.out.println("Flap, Flap, Flap.");
            setEnergy(getEnergy() - 50 ) ;   
        }
        else{
            System.out.println("Too Tired.");
        }
        
        return this;

    }

    public ZooKeeperBat eatHumans(){
        System.out.println("Crunch, Crunch, Crunch");
        setEnergy(getEnergy()+25);
        return this;
    }

    public ZooKeeperBat attackTown(){
        if(getEnergy() - 100 >0){
            System.out.println("attacking the town.");
            setEnergy(getEnergy() - 100 ) ;   
        }
        else{
            System.out.println("Too Tired.");
        }
            System.out.println(getEnergy());
        
        return this;


    }

    

}