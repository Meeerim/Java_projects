import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;




    @RunWith(Suite.class)
    @Suite.SuiteClasses(
            TestToyota.class
    )
    public class SmokeRunner{

        @BeforeClass
        public  static void beforeAll(){
            System.out.println("Before class run first");
        }

        @AfterClass
        public static void afterAll(){
            System.out.println("After all classes");
        }
    }

