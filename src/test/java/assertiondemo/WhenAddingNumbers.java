package assertiondemo;

import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class WhenAddingNumbers {

    @Test
    public  void shouldAddTwoIntegersTogetherCorrectly(){
        int a =1;
        int b = 2;
        int sum = a + b;
        assertThat(sum).isEqualTo(3);

        String color = "red";
        String otherColor = "Red";
        assertThat(color).isEqualToIgnoringCase(otherColor);

        String colors = "red, green, blue";
        assertThat(colors).contains("red");

        assertThat(colors).containsPattern("[g|G]reen");



    }
    @Test
    public  void assertingLists(){

        List<String> colors = Arrays.asList("red", "green", "blue");

        assertThat(colors).hasSize(3);
        assertThat(colors).contains("green");
        assertThat(colors).containsExactly("red", "green", "blue");
        assertThat(colors).containsExactlyInAnyOrder("blue", "red", "green");
        assertThat(colors).doesNotContain("yellow");





    }
}
