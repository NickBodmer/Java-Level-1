public class Main {

    public static void main(String[] args) {


        Worker[] Array = new Worker[5];
        Array[0] = new Worker("Ivan", "Driver", "324@inbox.ru",
                "8965478252", 12000, 40);
        Array[1] = new Worker("Roman", "Engeer", "222@inbox.ru", "8965423178",
                15000, 36);
        Array[2] = new Worker("Igor", "Teacher", "245@inbox.ru", "897542165",
                20000, 45);
        Array[3] = new Worker("Alex", "Doctor", "222@inbox.ru", "8965423178",
                12000, 21);
        Array[4] = new Worker("Denis", "Nurse", "222@inbox.ru", "8965423178",
                14000, 42);


        for (Worker c : Array) {
            if (c.getAge() >= 40) {
                c.info();
            }

        }
    }
}
       
       
      

    
  






