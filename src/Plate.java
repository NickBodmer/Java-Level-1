public class Plate {

    private static int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        int balans = food - amount;
        if (balans < 0) return false;
        food -= amount;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }
    static void info() {
        System.out.println("еда " + food);
    }
}
