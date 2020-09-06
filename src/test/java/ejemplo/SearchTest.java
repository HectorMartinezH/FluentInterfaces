package ejemplo;

import ejemplo.pages.CommonVerification;
import ejemplo.pages.HomePage;
import ejemplo.pages.search.Role;
import ejemplo.pages.search.SearchPage;
import ejemplo.pages.search.SkillLevel;
import ejemplo.pages.search.Tab;
import org.testng.annotations.Test;

import static ejemplo.pages.CommonVerification.getCommonVerification;
import static ejemplo.pages.CoursePage.coursePreviewButton;
import static ejemplo.pages.CoursePage.freeTrialButton;
import static ejemplo.pages.HomePage.getHomePage;
import static ejemplo.pages.search.SearchPage.getSearchPage;

public class SearchTest extends BaseTestClass {
    HomePage home = getHomePage();
    SearchPage search = getSearchPage();
    CommonVerification commonVerification = getCommonVerification();

    @Test
    public void basicFilterByTest() {
        home.search("Java");

        search.filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");

        commonVerification.verifyIsDisplayed(coursePreviewButton())
                            .verifyIsDisplayed(freeTrialButton());
    }
}
