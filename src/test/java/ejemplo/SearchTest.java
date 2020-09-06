package ejemplo;

import ejemplo.pages.CoursePage;
import ejemplo.pages.HomePage;
import ejemplo.pages.SearchPage;
import org.testng.annotations.Test;

import static ejemplo.pages.CoursePage.getCoursePage;
import static ejemplo.pages.HomePage.getHomePage;
import static ejemplo.pages.SearchPage.getSearchPage;

public class SearchTest extends BaseTestClass {
    HomePage home = getHomePage();
    SearchPage search = getSearchPage();
    CoursePage course = getCoursePage();

    @Test
    public void basicFilterByTest() {
        home.search("Java");

        search.filterBySkillLevel("Beginner")
                .filterByRole("Software Development")
                .selectTabCourse()
                .selectCourse("Java Fundamentals: The Java Language");

        course.verifyCoursePreviewIsDisplayed()
                .verifyFreeTrialIsDisplayed();
    }
}
