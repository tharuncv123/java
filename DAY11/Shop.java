class Shop {
	String name;
	String ownerName;
	long mobNo;
	String date;
	
	Shop(){
		System.out.println("Running shop constructor in shop class");
	}
	Shop(String name){
		this.name=name;
	}
	Shop(String name,String ownerName){
		this(name);
		this.ownerName=ownerName;
	}
	Shop(String name,String ownerName,long mobNo){
		this(name,ownerName);
		this.mobNo=mobNo;
	}
	Shop(String name,String ownerName,long mobNo,String date){
		this(name, ownerName,mobNo);
		this.date=date;
	}
}