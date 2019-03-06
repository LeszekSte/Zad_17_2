import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Euler2Test {

    @Test
    public void sumaRoznicyKw_shouldReturn2640For10() {
        //given
        Euler2 euler2 = new Euler2();
        //when
        int result = euler2.sumaRoznicyKw(10);
        //then
        Assert.assertThat(result, CoreMatchers.is(2640));
    }

    @Test
    public void sumaRoznicyKw_shouldReturn25_164_150For100() {
        //given
        Euler2 euler2 = new Euler2();
        //when
        int result = euler2.sumaRoznicyKw(100);
        //then
        Assert.assertThat(result, CoreMatchers.is(25_164_150));
    }
//        @Test
//        public void shouldReturn10For10() {
//
//            //given
//            EulerProject eulerProject = new EulerProject();
//            // when
//            int result = eulerProject.zadanie1(10);
//            //then
//            assertThat(result, is(10));
//
//        }


}