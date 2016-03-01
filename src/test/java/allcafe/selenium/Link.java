package allcafe.selenium;

public enum Link {
	
	LOGO("http://spb.allcafe.ru","","#header .logo"),
	
	//Главное меню - Раздел "Рестораны"
	RESTAURANTS("http://spb.allcafe.ru/restaurants", "Рестораны", ".menu li.dropdown:first-child a[rel='1']"),
	RESTAURANTS_CATALOG("http://spb.allcafe.ru/restaurants", "Каталог ресторанов", 
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(1) a" ),
	REVIEWS("http://spb.allcafe.ru/restaurants/guide","Отзывы о ресторанах",
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(2) a"), 
	POSTER("http://spb.allcafe.ru/restaurants/posters", "Афиша", 
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(3) a"),
	JOURNAL("http://spb.allcafe.ru/restaurants/journal", "Журналы",
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(4) a"),
	RATINGS("http://spb.allcafe.ru/rating","Рейтинги ресторанов",
			".menu li.dropdown:first-child .submenu div:nth-child(3)  ul li:first-child a"),
	DISCOUNTS("http://spb.allcafe.ru/restaurants/discount","Скидки, бонусы, подарки",
			".menu li.dropdown:first-child .submenu div:nth-child(3)  ul li:nth-child(2) a"),
	DELIVERY("http://spb.allcafe.ru/restaurants/delivery","Доставка еды",
			".menu li.dropdown:first-child .submenu div:nth-child(3)  ul li:nth-child(3) a"),
	ADD_RESTARAUNT("http://spb.allcafe.ru/restaurants/guest-add","Добавить ресторан",
			".menu li.dropdown:first-child .submenu div:nth-child(4) a"),
	TOP("http://spb.allcafe.ru/rating", "Топ ресторанов", ".menu li.link a"),
	
	//Главное меню - Раздел "Банкеты"
	BANKET_OFFERS("http://spb.allcafe.ru/restaurants/specials", "Банкеты", ".menu li.dropdown a[rel='2']"),
	CORPORATE("http://spb.allcafe.ru/restaurants/specials/1","Корпоративные праздники",
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:first-child a"),
	BANKETS("http://spb.allcafe.ru/restaurants/specials/3","Банкеты",
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:nth-child(2) a"),
	WEDDING("http://spb.allcafe.ru/restaurants/specials/4", "Свадьбы",
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:nth-child(3) a"),
	CHILD_CELEBRATION("http://spb.allcafe.ru/restaurants/specials/5","Детские праздники", 
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:nth-child(4) a"),
	CATERING("http://spb.allcafe.ru/restaurants/specials/7", "Catering (выездное обслуживание)", 
			".menu li.dropdown .submenu[tag='2'] .column:nth-child(2) ul li:first-child a"),
	
	//Главное меню - Раздел "Новости и обзоры"
	NEWS_REVIEWS("http://spb.allcafe.ru/news","Новости и обзоры", ".menu li.dropdown a[rel='3']"),
	OPENNING("http://spb.allcafe.ru/news/opennews", "Открытия", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:first-child a"),
	RESTARAUNT_CRITIC("http://spb.allcafe.ru/news/boris", "Колонка ресторанного критика", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:nth-child(2) a"),
	INTERVIEWS("http://allcafe.ru/news/interview", "Интервью", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:nth-child(3) a"),
	AUTHOR_COLUMN("http://spb.allcafe.ru/news/i-dobruy", "Авторская колонка И.Доброго", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:nth-child(4) a"),
	ALL_NEWS("http://spb.allcafe.ru/news/total", "Все новости", 
			".menu li.dropdown .submenu[tag='3'] .column:nth-child(2) ul li:first-child a"),
	EXCURSIONS("http://spb.allcafe.ru/news/excursions", "Тематические обзоры", 
			".menu li.dropdown .submenu[tag='3'] .column:nth-child(2) ul li:nth-child(2) a");
	
	
	
	
	private String urlRedirectPage; // url страницы на которую ведет ссылка
	private String encore;  // анкор ссылки
	private String selector; // селектор для перехода на страницу ресторана
	
	Link(String urlRedirectPage, String encore, String selector) {
		this.urlRedirectPage = urlRedirectPage;
		this.encore = urlRedirectPage;
		this.selector = selector;
	}
	
	public String  getUrlRedirectPage() {
		return this.urlRedirectPage;
	}
	
	public String getEncore() {
		return this.encore;
	}
	
	public String getSelector() {
		return this.selector;
	}
	
}
