package ejemplo.pages.course;

import org.openqa.selenium.By;

public class CoursePage {

    CourseVerifyController verify;

    private CoursePage(){}

    private CoursePage(CourseVerifyController verify) {
        this.verify = verify;
    }

    public static CoursePage getCoursePage() {
        return new CoursePage(new CourseVerifyController());
    }

    public CourseVerifyController verify() {
        return verify;
    }

    public static By freeTrialButton() {
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][1]");
    }

    public static By coursePreviewButton() {
        return By.xpath("//div[@id='course-page-hero']//div[@class='ps-button section'][2]");
    }
}
