package lesson_5;

public class Main4 {
    public static void main(String[] args) throws InterruptedException {

        // газовикам нужно обойти все квартиры в районе и проверить оборудование. Домов - 3, этажей в доме - 5, квартир на этаже - 4.

        int a = 1;

        for (int house = 1; house <= 3; house++) {
            a = 1;
            for (int floor = 1; floor <= 5 ; floor++) {
                for (int flat = 1; flat <= 4 ; flat++) {
                    System.out.printf("Проверено оборудование в доме %d, на этаже %d, в квартире %d\n", house, floor,a);
                    a++;
                    Thread.sleep(1000);
                }
            }
        }
    }
}
