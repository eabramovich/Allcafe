package allcafe.applogic;

public interface NavigationHelper {
	
	void openMainPage();
	void openRelativeUrl(String url);
	void gotoLoginPage();
	void townSelect(String name);
    boolean isTownSelect(String name);
    void gotoRestaurantsCatalog();
    void gotoReviews();
    boolean isRestaurantCatalogLoaded();
    void gotoDomainMainPage();
    boolean isReviewsLoaded();
    void gotoPoster();
    void gotoJournal();
	void gotoRatings();
	void gotoDelivery();
    boolean isPosterLoaded();
	void gotoDiscounts();
	void gotoAddRestaurant();
	void gotoTop();
	
}
