public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 1.3, 7.5, 4.2}; //ile dizilerdeki sayıları tanımlayabiliriz
        double total = 0;
        double max = myList[0];
        for (double number : myList) {
            if (max < number) {
                max = number;
            }
            total = total + number;
            System.out.println(number);
        }
        System.out.println("Toplam =" + total);
        System.out.println("En büyük sayı =" + max);

    }
}
