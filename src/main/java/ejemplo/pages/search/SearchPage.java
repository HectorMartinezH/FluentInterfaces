package ejemplo.pages.search;

public class SearchPage {

    SearchActController act;
    SearchVerifyController verify;

    public SearchActController act() {
        return act;
    }

    public SearchVerifyController verify() {
        return verify;
    }
    
    private SearchPage() {}

    private SearchPage(SearchActController act, SearchVerifyController verify) {
        this.act = act;
        this.verify = verify;
    }

    public static SearchPage getSearchPage() {
        return new SearchPage(new SearchActController(),
                new SearchVerifyController());
    }


}
