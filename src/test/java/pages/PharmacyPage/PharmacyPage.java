package pages.PharmacyPage;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class PharmacyPage {
    public PharmacyPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
