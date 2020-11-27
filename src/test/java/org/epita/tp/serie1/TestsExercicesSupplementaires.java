package org.epita.tp.serie1;

import org.assertj.core.api.AbstractLongAssert;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.catchThrowable;
import static org.epita.tp.serie1.ExercicesSupplementaires.*;
import static org.assertj.core.api.Assertions.assertThat;

public class TestsExercicesSupplementaires {

    @Test
    @DisplayName("Tests de l'exercice 1")
    public void test_exercice1(){
        assertThat(exercice1(1,2,3)).isEqualTo(14);
        assertThat(exercice1(14,9,-9,1,4,3)).isEqualTo(384);
        assertThat(exercice1(null)).isEqualTo(-1);
    }

    @Test
    @DisplayName("Tests de l'exercice 2")
    public void test_exercice2(){
        assertThat(exercice2(new float[]{10,20})).isEqualTo(15);
        assertThat(exercice2(new float[]{10,11,12,13,14,15,16})).isEqualTo(13);
        Throwable exception = catchThrowable(()->{exercice2(new float[]{});});
        assertThat(exception).isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    @DisplayName("Tests de l'exercice 3")
    public void test_exercice3(){
        assertThat(exercice3(new long[]{1,-2,10,-15,3})).isEqualTo(3);
        assertThat(exercice3(new long[]{-10,10,3,-5})).isEqualTo(1);
        assertThat(exercice3(new long[]{-10,10,3,10})).isEqualTo(1);
    }

    @Test
    @DisplayName("Tests de l'exercice 4")
    public void test_exercice4(){
        assertThat(exercice4(0)).isEqualTo(0);
        assertThat(exercice4(2)).isEqualTo(1);
        assertThat(exercice4(10)).isEqualTo(55);
        assertThat(exercice4(16)).isEqualTo(987);
        assertThat(exercice4(80)).isEqualTo(23416728348467685L);
    }

    @Test
    public void test_exercice5(){
        assertThat(exercice5(21, 9, 60000)).isTrue();
        assertThat(exercice5(17, 8, 90000)).isFalse();
        assertThat(exercice5(90, 2, 2000000)).isTrue();
    }

    @Test
    public void test_exercice6(){
        assertThat(exercice6("123456789012")).isEqualTo("########9012");
        assertThat(exercice6("1234 5678 9012")).isEqualTo("########9012");
        assertThat(exercice6("MomNomEstPersonne")).isEqualTo("#############onne");
        assertThat(exercice6("42")).isEqualTo("42");
    }

    @Test
    public void test_exercice7(){
        assertThat(exercice7("Toto")).isEqualTo("toto");
        assertThat(exercice7("TITi")).isEqualTo("TITI");
        assertThat(exercice7("taTA")).isEqualTo("taTA");
        assertThat(exercice7("taTAyOYO")).isEqualTo("TATAYOYO");
    }

    @Test
    public void test_exercice8(){
        assertThat(exercice8(new int[]{1, 3, 1})).isEqualTo(12);
        assertThat(exercice8(new int[]{5, 7, 5, 9, 7})).isEqualTo(579);
        assertThat(exercice8(new int[]{9, 1, 3, 1, 7, 4, 6, 6, 7})).isEqualTo(134679);
    }

    @Test
    public void test_exercice9(){
        assertThat(exercice9(new int[]{1, 3, 1})).isEqualTo(13);
        assertThat(exercice9(new int[]{5, 7, 5, 9, 7})).isEqualTo(579);
        assertThat(exercice9(new int[]{9, 1, 3, 1, 7, 4, 6, 6, 7})).isEqualTo(134679);
    }

    @Test
    public void test_exercice10(){
        assertThat(exercice10("1234",1)).isEqualTo(234);
        assertThat(exercice10("1234",2)).isEqualTo(34);
        assertThat(exercice10("1234",3)).isEqualTo(4);
        assertThat(exercice10("2020",1)).isEqualTo(202);
//        assertThat(exercice10("214543634532",3)).isEqualTo(202);
        System.out.println(exercice10("214543634532",3));
    }

    @Test
    public void test_exercice11(){
        assertThat(exercice11(0,0,0,50)).isEqualTo(false);
        assertThat(exercice11(2,2,2,200)).isEqualTo(false);
        assertThat(exercice11(1,2,2,10)).isEqualTo(true);
        assertThat(exercice11(1,2,2,80)).isEqualTo(true);
        assertThat(exercice11(1,2,2,90)).isEqualTo(true);
        assertThat(exercice11(0,2,5,80)).isEqualTo(false);
        assertThat(exercice11(1,1,1,55)).isEqualTo(false);

    }
    
}
