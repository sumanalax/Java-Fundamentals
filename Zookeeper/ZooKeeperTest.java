public class ZooKeeperTest{
    public static void main(String[]args) {
        System.out.println("Here");

        ZooKeeperMammal animal = new ZooKeeperMammal();
        ZooKeeperGorilla gorilla = new ZooKeeperGorilla();
        ZooKeeperBat bat = new ZooKeeperBat();

        System.out.println(animal.getEnergy());
        animal.setEnergy(190);
        System.out.println(animal.getEnergy());
        animal.setEnergy(200).setEnergy(400);
        System.out.println(animal.getEnergy());

        gorilla.throwSomething().throwSomething().eatBananas().throwSomething();
        bat.fly().fly().fly().eatHumans().eatHumans().attackTown().attackTown();

        
    }
}