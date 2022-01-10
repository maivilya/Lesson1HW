public class HomeWorkApp {
    public static void main(String[] args) {
        printWords();
        checkSumSign(10, -17);
        printColor(0);
        compareNumbers(3, 5);
    }
    static void printWords(){
        System.out.print("я - ");
        System.out.print("Мамаев");
        System.out.print(" Илья");
        System.out.println(" Евгеньевич");
    }
    static void checkSumSign(int a, int b){
        int c = a + b;
        if(c >= 0){
            System.out.println("Сумма положительная");
        }else{
            System.out.println("Сумма отрицательная");
        }
    }
    static void printColor(int value){
        if(value <= 0){
            System.out.println("Красный");
        }else if(value > 0 && value <= 100){
            System.out.println("Жёлтый");
        }else{
            System.out.println("Зеленый");
        }

    }
    static void compareNumbers(int a, int b){
        if(a >= b){
            System.out.println("a >= b");
        }else{
            System.out.println("a < b");
        }

    }
}
