package allcafe.model;

public enum Page {
	
	RESTAURANTS("http://spb.allcafe.ru/restaurants", 
			"Все рестораны Санкт-Петербурга: расположение на карте, отзывы, рейтинг ресторанов СПб", ".restaurants .item .img-container"),
	REVIEWS("http://spb.allcafe.ru/restaurants/guide", "Отзывы о ресторанах Санкт-Петербурга", ".reviews-block"),
	POSTER("http://spb.allcafe.ru/restaurants/posters", "Вся афиша на сегодня", ".posters-block"),
	JOURNAL("http://spb.allcafe.ru/restaurants/journal", "Журналы ресторанов Санкт-Петербурга", ".reviews-block .journal"),
	RATINGS("http://spb.allcafe.ru/rating", "Рейтинги ресторанов Санкт-Петербурга", ".tops-block .top-item"),
	DISCOUNTS("http://spb.allcafe.ru/restaurants/discount", "Cкидки в ресторанах Санкт-Петербурга", ".advanced-block .block"),
	DELIVERY("http://spb.allcafe.ru/restaurants/delivery", "Компании по доставке еды Санкт-Петербурга", ".restaurants .delivery"),
	ADD_RESTARAUNT("http://spb.allcafe.ru/restaurants/guest-add", "Добавление ресторана в каталог региона Санкт-Петербург", "#entity-edit .add-form"),
	TOP("http://spb.allcafe.ru/rating", "Рейтинги ресторанов Санкт-Петербурга", ".tops-block .top-item"),
	BANKET_OFFERS("http://spb.allcafe.ru/restaurants/specials", "Банкеты и спецпредложения", ""),
	CORPORATE("http://spb.allcafe.ru/restaurants/specials/1","Корпоративные праздники", ""),
	BANKETS("http://spb.allcafe.ru/restaurants/specials/3", "Банкеты в Санкт-Петербурге. Рестораны с банкетными залами", ""),
	WEDDING("http://spb.allcafe.ru/restaurants/specials/4",
			"Свадьба в ресторанах Санкт-Петербурга: предложения по проведению свадебных банкетов в ресторанах", ""),
	CHILD_CELEBRATION("http://spb.allcafe.ru/restaurants/specials/5", "Детские праздники", ""),
	CATERING("http://spb.allcafe.ru/restaurants/specials/7", "Catering (выездное обслуживание)", ""),
	NEWS_REVIEWS("http://spb.allcafe.ru/news", "Новости и открытия, обзоры, интервью", ""),
	OPENNING("http://spb.allcafe.ru/news/opennews", "Открытия", ""),
	RESTARAUNT_CRITIC("http://spb.allcafe.ru/news/boris", "Колонка ресторанного критика", ""),
	INTERVIEWS("http://allcafe.ru/news/interview", "�?нтервью", ""),
	AUTHOR_COLUMN("http://spb.allcafe.ru/news/i-dobruy", "«Добрые» заметки", ""),
	ALL_NEWS("http://spb.allcafe.ru/news/total", "Новости ресторанов Санкт-Петербурга", ""),
	EXCURSIONS("http://spb.allcafe.ru/news/excursions", "Ресторанные экскурсии", "");
	
	private String url;
	private String title;
	private String selectorElementPage;
	
	Page (String url, String title, String selectorElementPage) {
		this.url = url;
		this.title = title;
		this.selectorElementPage = selectorElementPage;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public String getTitle() {
		return this.title;
	}
	
	public String getSelectorElementPage() {
		return this.selectorElementPage;
	}
	
}