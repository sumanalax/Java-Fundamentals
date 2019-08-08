public class ZooKeeperGorilla extends ZooKeeperMammal{
    public ZooKeeperGorilla(){

    }
    public ZooKeeperGorilla throwSomething(){
        if(getEnergy() - 5 >0){
            System.out.println("Throwing stuff");
            setEnergy(getEnergy() - 5 ) ;   
        }
        else{
            System.out.println("Too Tired.");
        }
        
        return this;

    }

    public ZooKeeperGorilla eatBananas(){
        System.out.println("Nom, Nom, Nom.");
        // System.out.println(getEnergy());
        setEnergy(getEnergy()+10);
        // System.out.println(getEnergy());
        return this;

    }
    public ZooKeeperGorilla climb(){
        System.out.println(getEnergy());
        if(getEnergy()-10>0){
            System.out.println("Climbing stuff");
            setEnergy(getEnergy() -10);
        }
        else{
            System.out.println("Too Tired");
        }
            System.out.println(getEnergy());
            return this;

    }


}