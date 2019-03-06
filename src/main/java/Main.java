public class Main {

    public static void main(String[] args) {
        Euler2 euler2 = new Euler2();
        int  limit = 10;
        int result = euler2.sumaRoznicyKw(limit);
        System.out.println("Suma do " + limit + " - " + result);

        int limit1 = 100;
        int result1 = euler2.sumaRoznicyKw(limit1);
        System.out.println("Suma do " + limit1 + " - " + result1);


    }
}
