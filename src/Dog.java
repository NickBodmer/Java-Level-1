
public class Dog extends Animal {
    public Dog(String name,
               float run_max_distance,
               float swim_max_distance,
               double jump_max_distance) {
        super(name, run_max_distance, swim_max_distance, (float) jump_max_distance);
    }

    public void run(float distance) {
        if (distance > run_max_distance) {
            System.out.println("Недопустимое значение");
        } else {
            System.out.println(name + " бегает на " + run_max_distance + " метров");
        }

    }

    public void jump(float distance) {
        if (distance > jump_max_distance) {
            System.out.println("Недопустимое значение");
        } else {
            System.out.println(name + " прыгает на: " + jump_max_distance + " метров ");
        }
    }

    public void swim(float distance) {
        if (distance > jump_max_distance) {
            System.out.println("Недопустимое значение");
        } else {
            System.out.println(name + " прыгает на: " + jump_max_distance + " метров ");
        }
    }
}


