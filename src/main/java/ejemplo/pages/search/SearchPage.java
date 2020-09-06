package ejemplo.pages.search;

public class SearchPage {

    private SearchActController act;
    private SearchVerifyController verify;
    private SearGetController get;

    public SearchActController act() {
        return act;
    }

    public SearchVerifyController verify() {
        return verify;
    }

    public SearGetController get(){
        return get;
    }
    
    private SearchPage() {}

    private SearchPage(SearchActController act, SearchVerifyController verify, SearGetController get) {
        this.act = act;
        this.verify = verify;
        this.get = get;
    }

    public static SearchPage getSearchPage() {
        return new SearchPage(new SearchActController(),
                new SearchVerifyController(),
                new SearGetController());
    }


}
