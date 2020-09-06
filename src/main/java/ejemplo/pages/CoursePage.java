package ejemplo.pages;

import org.openqa.selenium.By;

public class CoursePage {

    private CoursePage(){}

    public static CoursePage getCoursePage() {
        return new CoursePage();
    }
    
    public static By freeTrialButton() {
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]");
    }

    public static By coursePreviewButton() {
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]");
    }
}
