package ejemplo;

import ejemplo.pages.course.CoursePage;
import ejemplo.pages.home.HomePage;
import ejemplo.pages.search.Role;
import ejemplo.pages.search.SearchPage;
import ejemplo.pages.search.SkillLevel;
import ejemplo.pages.search.Tab;
import org.testng.annotations.Test;

import static ejemplo.pages.course.CoursePage.*;
import static ejemplo.pages.home.HomePage.getHomePage;
import static ejemplo.pages.search.SearchPage.getSearchPage;

public class SearchTest extends BaseTestClass {
    HomePage home = getHomePage();
    SearchPage search = getSearchPage();
    //CommonVerification commonVerification = getCommonVerification();
    CoursePage coursePage = getCoursePage();

    @Test
    public void basicFilterByTest() {
        home.act()
                .search("Java");

        search.act()
                .filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");

        coursePage.verify()
                .verifyIsDisplayed(coursePreviewButton())
                .verifyIsDisplayed(freeTrialButton());
    }
}
