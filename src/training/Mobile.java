package training;

class Mobile {

	private String company;
	private int batteryCap;
	private String OS;
	public Mobile(String company, int batteryCap, String oS) {
		this.company = company;
		this.batteryCap = batteryCap;
		OS = oS;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getBatteryCap() {
		return batteryCap;
	}
	public void setBatteryCap(int batteryCap) {
		this.batteryCap = batteryCap;
	}
	public String getOS() {
		return OS;
	}
	public void setOS(String oS) {
		OS = oS;
	}
	
}

class Apple extends Mobile{
	
	private int version;
	private int RAM;
	private int memory;
	public Apple(String company, int batteryCap, String oS,int version, int rAM, int memory) {
		super(company,batteryCap,oS);
		this.version = version;
		RAM = rAM;
		this.memory = memory;
		
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
	
}

class Samsung extends Mobile{
	private int version;
	private int RAM;
	private int memory;
	public Samsung(String company, int batteryCap, String oS,int version, int rAM, int memory) {
		super(company,batteryCap,oS);
		this.version = version;
		RAM = rAM;
		this.memory = memory;
		
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public int getRAM() {
		return RAM;
	}
	public void setRAM(int rAM) {
		RAM = rAM;
	}
	public int getMemory() {
		return memory;
	}
	public void setMemory(int memory) {
		this.memory = memory;
	}
	
}
