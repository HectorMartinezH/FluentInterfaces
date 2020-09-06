package ejemplo;

import ejemplo.pages.CoursePage;
import ejemplo.pages.HomePage;
import ejemplo.pages.SearchPage;
import org.testng.annotations.Test;

public class SearchTest extends BaseTestClass {
    HomePage home = new HomePage();
    SearchPage search = new SearchPage();
    CoursePage course = new CoursePage();

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
