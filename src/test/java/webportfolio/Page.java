package webportfolio;

public enum Page {
	
	RESTAURANTS("http://spb.allcafe.ru/restaurants", 
			"Все рестораны Санкт-Петербурга: расположение на карте, отзывы, рейтинг ресторанов СПб"),
	REVIEWS("http://spb.allcafe.ru/restaurants/guide", "Отзывы о ресторанах Санкт-Петербурга"),
	POSTER("http://spb.allcafe.ru/restaurants/posters", "Вся афиша на сегодня"),
	JOURNAL("http://spb.allcafe.ru/restaurants/journal", "Журналы ресторанов Санкт-Петербурга"),
	RATINGS("http://spb.allcafe.ru/rating", "Рейтинги ресторанов Санкт-Петербурга"),
	DISCOUNTS("http://spb.allcafe.ru/restaurants/discount", "Cкидки в ресторанах Санкт-Петербурга"),
	DELIVERY("http://spb.allcafe.ru/restaurants/delivery", "Компании по доставке еды Санкт-Петербурга"),
	ADD_RESTARAUNT("http://spb.allcafe.ru/restaurants/guest-add", "Добавление ресторана в каталог региона Санкт-Петербург"),
	TOP("http://spb.allcafe.ru/rating", "Рейтинги ресторанов Санкт-Петербурга"),
	BANKET_OFFERS("http://spb.allcafe.ru/restaurants/specials", "Банкеты и спецпредложения"),
	CORPORATE("http://spb.allcafe.ru/restaurants/specials/1","Корпоративные праздники"),
	BANKETS("http://spb.allcafe.ru/restaurants/specials/3", "Банкеты в Санкт-Петербурге. Рестораны с банкетными залами"),
	WEDDING("http://spb.allcafe.ru/restaurants/specials/4",
			"Свадьба в ресторанах Санкт-Петербурга: предложения по проведению свадебных банкетов в ресторанах"),
	CHILD_CELEBRATION("http://spb.allcafe.ru/restaurants/specials/5", "Детские праздники"),
	CATERING("http://spb.allcafe.ru/restaurants/specials/7", "Catering (выездное обслуживание)"),
	NEWS_REVIEWS("http://spb.allcafe.ru/news", "Новости и открытия, обзоры, интервью"),
	OPENNING("http://spb.allcafe.ru/news/opennews", "Открытия"),
	RESTARAUNT_CRITIC("http://spb.allcafe.ru/news/boris", "Колонка ресторанного критика"),
	INTERVIEWS("http://allcafe.ru/news/interview", "Интервью"),
	AUTHOR_COLUMN("http://spb.allcafe.ru/news/i-dobruy", "«Добрые» заметки"),
	ALL_NEWS("http://spb.allcafe.ru/news/total", "Новости ресторанов Санкт-Петербурга"),
	EXCURSIONS("http://spb.allcafe.ru/news/excursions", "Ресторанные экскурсии");
	
	private String url;
	private String title;
	
	Page (String url, String title) {
		this.url = url;
		this.title = title;
	}
	
	public String getUrl() {
		return this.url;
	}
	
	public String getTitle() {
		return this.title;
	}
	
}
