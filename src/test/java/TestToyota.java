import org.junit.Assert;
import org.junit.Test;
import toyota.Toyota;

public class TestToyota {
    Toyota camry = new Toyota("white",3.5,"Camry70",2009,false,35000,"avtomat");



    @Test
    public void testEngine (){
        Assert.assertEquals(3.5,camry.getEngine(),1);
    }
    @Test
    public void testIsCoupe (){
        Assert.assertTrue(camry.getColour().equals("white"));
    }

}
