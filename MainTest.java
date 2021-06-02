package fs.apidef.identifyservice.java.class_10;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.assertj.core.api.Java6Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;


class MainTest {

    @Test
    void test1() {
      assertEquals(10, Main.sum(2, 8));
        assertNotEquals(1, Main.sum(2, 3));
    }

    @Test
    void test2() {
        assertTrue(Main.compare(5, 6));
        assertFalse(Main.compare(8, 5));

    }

    @Test
    void test3() {
        assertNull(Main.devied(3, 0));
        assertNotNull(Main.devied(9, 3));

    }

    @Test
    void test4() {
        String s1 = "java";
        String s2 = "java";
        assertSame(s1, s2);
    }

    @Test
    void test5() {
        String s1 = "java";
        String s2 = "test";
        assertNotSame(s1, s2);
    }

    @Test
    void test6() {
        int[] arr1 = new int[]{1, 2, 3};
        int[] arr2 = new int[]{1, 2, 3};
        assertArrayEquals(arr1, arr2);
    }

    @Test
    void test7() {
        int[] a1 = new int[]{1, 3, 5};
        int[] a2 = new int[]{1, 4, 6};
        assertArrayEquals(a1, a2);
    }

    @Test
    @DisplayName("Testarray")
    void sameple() {
        String[] countries = new String[]{"A", "B", "C"};
        assertThat(countries).contains("A");
        assertThat(countries).isNotNull()
                .contains("A")
                .doesNotContainNull()
                .containsSequence("B", "C");
        assertThat(countries).hasSize(3);

    }

    @Test
    void mang() {
        int[] so = new int[]{1, 2, 3, 4};
        assertThat(so).contains(3);
        assertThat(so).isNotNull()
                .contains(4)
                .doesNotContain(13);

        assertThat(so).hasSize(4);

    }

    @Test
    void test_string() {
        String s = "Trời xanh mây trắng";
        String s1 = "nắng vàng";
        String sclone = s;
        assertThat(s).isNotNull()
                .startsWith("Trời")
                .doesNotContain("xanh1")
                .contains("mây trắng");
        assertThat(s).isNotEqualTo(s1);
        assertThat(s).isEqualTo(sclone);
    }

    @Test
    void test_number() {
        double s1 = 12.0;
        double s2 = 11.0;
        assertThat(s1).isEqualTo(12.3, withPrecision(1d));
        assertThat(s1).isCloseTo(15.0, Offset.offset(4d));
        assertThat(s1).isBetween(10.0, 15.0);
        assertThat(s2).isStrictlyBetween(10.0, 15.0);
        int s3 = 3;
        assertThat(s3).isBetween(1, 4);
        assertThat(s3).isStrictlyBetween(2, 5);
        assertThat(s3).isNotZero();
    }
    @Test
    void test_sdt(){
        String sdt = "1234567890";
        assertThat(sdt).startsWith("0")
                .hasSize(10)
                .containsOnlyDigits();
    }

    @Test
    void  test_email(){
        String email="A@gmail.com";
        assertThat(email).isNotNull()
                .contains("@")
                .doesNotContain("#$%^");
        assertThat(email).endsWith(".com");

    }
}