import fruitboxes.Box;
import fruitboxes.fruits.Apple;
import fruitboxes.fruits.Orange;
import org.junit.Assert;
import org.junit.Test;

public class BoxesTest {

    @Test
    public void orangeBoxWeightTest() {
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        Assert.assertEquals(orangeBox.getBoxWeight(), 4.5f, 0);
    }

    @Test
    public void appleBoxWeightTest() {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple());
        appleBox.addFruit(new Apple());
        Assert.assertEquals(appleBox.getBoxWeight(), 3, 0);
    }

    @Test
    public void compareBoxWeights() {
        Box<Apple> appleBox = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange());
        Assert.assertTrue(appleBox.compareTo(orangeBox));
    }
}
