package webportfolio;

public enum SearchParams {
	DISTRICT("#top-search a[data-type='wm_district']"),
	UNDERGROUND("#top-search a[data-type='wm_underground']");
	
	private String selector;
	
	SearchParams(String selector) {
		this.selector = selector;
	}
	
	public String getSelector() {
		return this.selector;
	}
}
