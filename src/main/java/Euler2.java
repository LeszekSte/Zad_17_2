import static java.lang.Math.*;

public class Euler2 {

    int sumaRoznicyKw( int breake){

        int kwadratSumy = 0;
        int sumakadratow = 0;
        for (int i=1; i<= breake; i++) {

            sumakadratow += (i*i);
            kwadratSumy += i;
        }


        return (int) (pow(kwadratSumy,2)-sumakadratow);
    }

}
