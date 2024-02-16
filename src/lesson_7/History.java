package lesson_7;

public class History {

     String operationName;
     int money;
     int id;

     public History(String operationName, int money, int id) {
          this.operationName = operationName;
          this.money = money;
          this.id = id;
     }

     public History(String operationName, int money) {
          this.operationName = operationName;
          this.money = money;
     }
}
