package allcafe.selenium;

public enum Link {
	
	LOGO("http://spb.allcafe.ru","","#header .logo"),
	
	//������� ���� - ������ "���������"
	RESTAURANTS("http://spb.allcafe.ru/restaurants", "���������", ".menu li.dropdown:first-child a[rel='1']"),
	RESTAURANTS_CATALOG("http://spb.allcafe.ru/restaurants", "������� ����������", 
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(1) a" ),
	REVIEWS("http://spb.allcafe.ru/restaurants/guide","������ � ����������",
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(2) a"), 
	POSTER("http://spb.allcafe.ru/restaurants/posters", "�����", 
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(3) a"),
	JOURNAL("http://spb.allcafe.ru/restaurants/journal", "�������",
			".menu li.dropdown:first-child .submenu div:nth-child(2) ul li:nth-child(4) a"),
	RATINGS("http://spb.allcafe.ru/rating","�������� ����������",
			".menu li.dropdown:first-child .submenu div:nth-child(3)  ul li:first-child a"),
	DISCOUNTS("http://spb.allcafe.ru/restaurants/discount","������, ������, �������",
			".menu li.dropdown:first-child .submenu div:nth-child(3)  ul li:nth-child(2) a"),
	DELIVERY("http://spb.allcafe.ru/restaurants/delivery","�������� ���",
			".menu li.dropdown:first-child .submenu div:nth-child(3)  ul li:nth-child(3) a"),
	ADD_RESTARAUNT("http://spb.allcafe.ru/restaurants/guest-add","�������� ��������",
			".menu li.dropdown:first-child .submenu div:nth-child(4) a"),
	TOP("http://spb.allcafe.ru/rating", "��� ����������", ".menu li.link a"),
	
	//������� ���� - ������ "�������"
	BANKET_OFFERS("http://spb.allcafe.ru/restaurants/specials", "�������", ".menu li.dropdown a[rel='2']"),
	CORPORATE("http://spb.allcafe.ru/restaurants/specials/1","������������� ���������",
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:first-child a"),
	BANKETS("http://spb.allcafe.ru/restaurants/specials/3","�������",
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:nth-child(2) a"),
	WEDDING("http://spb.allcafe.ru/restaurants/specials/4", "�������",
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:nth-child(3) a"),
	CHILD_CELEBRATION("http://spb.allcafe.ru/restaurants/specials/5","������� ���������", 
			".menu li.dropdown .submenu[tag='2'] .column:first-child ul li:nth-child(4) a"),
	CATERING("http://spb.allcafe.ru/restaurants/specials/7", "Catering (�������� ������������)", 
			".menu li.dropdown .submenu[tag='2'] .column:nth-child(2) ul li:first-child a"),
	
	//������� ���� - ������ "������� � ������"
	NEWS_REVIEWS("http://spb.allcafe.ru/news","������� � ������", ".menu li.dropdown a[rel='3']"),
	OPENNING("http://spb.allcafe.ru/news/opennews", "��������", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:first-child a"),
	RESTARAUNT_CRITIC("http://spb.allcafe.ru/news/boris", "������� ������������ �������", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:nth-child(2) a"),
	INTERVIEWS("http://allcafe.ru/news/interview", "��������", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:nth-child(3) a"),
	AUTHOR_COLUMN("http://spb.allcafe.ru/news/i-dobruy", "��������� ������� �.�������", 
			".menu li.dropdown .submenu[tag='3'] .column:first-child ul li:nth-child(4) a"),
	ALL_NEWS("http://spb.allcafe.ru/news/total", "��� �������", 
			".menu li.dropdown .submenu[tag='3'] .column:nth-child(2) ul li:first-child a"),
	EXCURSIONS("http://spb.allcafe.ru/news/excursions", "������������ ������", 
			".menu li.dropdown .submenu[tag='3'] .column:nth-child(2) ul li:nth-child(2) a");
	
	
	
	
	private String urlRedirectPage; // url �������� �� ������� ����� ������
	private String encore;  // ����� ������
	private String selector; // �������� ��� �������� �� �������� ���������
	
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
