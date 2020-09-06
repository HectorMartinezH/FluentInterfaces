package ejemplo;

import ejemplo.pages.CoursePage;
import ejemplo.pages.HomePage;
import ejemplo.pages.search.Role;
import ejemplo.pages.search.SearchPage;
import ejemplo.pages.search.SkillLevel;
import ejemplo.pages.search.Tab;
import org.testng.annotations.Test;

import static ejemplo.pages.CoursePage.getCoursePage;
import static ejemplo.pages.HomePage.getHomePage;
import static ejemplo.pages.search.SearchPage.getSearchPage;

public class SearchTest extends BaseTestClass {
    HomePage home = getHomePage();
    SearchPage search = getSearchPage();
    CoursePage course = getCoursePage();

    @Test
    public void basicFilterByTest() {
        home.search("Java");

        search.filterBySkillLevel(SkillLevel.BEGINNER)
                .filterByRole(Role.SOFTWARE_DEVELOPMENT)
                .selectTab(Tab.COURSES)
                .selectCourse("Java Fundamentals: The Java Language");

        course.verifyCoursePreviewIsDisplayed()
                .verifyFreeTrialIsDisplayed();
    }
}
