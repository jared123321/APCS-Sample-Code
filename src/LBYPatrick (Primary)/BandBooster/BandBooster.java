public class BandBooster {
    
    private String name = "";
    private int boxesSold = 0;

    public BandBooster(String nameOfBandBooster) {
        boxesSold = 0;
        name = nameOfBandBooster;
    }
    public String getName() {return name;}

    public void updateSales (int boxToAdd) {boxesSold += boxToAdd; return;}

    public String toString() { return name + ": " + boxesSold + " boxes";}

}