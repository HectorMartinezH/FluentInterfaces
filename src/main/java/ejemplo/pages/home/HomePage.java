package ejemplo.pages.home;

public class HomePage {

    HomeActController act;
    HomeVerifyController verify;

    private HomePage() {}

    private HomePage(HomeActController act, HomeVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static HomePage getHomePage() {
        return new HomePage(new HomeActController(),
                new HomeVerifyController());
    }

    public HomeActController act(){
        return act;
    }

    public HomeVerifyController verify() {
        return verify;
    }


}
