class ShopRunner {
	public static void main(String[] args){
		Shop shop=new Shop();
		System.out.println("Shop Name : "+shop.name);
		System.out.println("Shop owner Name : "+shop.ownerName);
		System.out.println("Shop mobile number : "+shop.mobNo);
		System.out.println("Shop establish date : "+shop.date);
		Shop shop1=new Shop("Vasavi Chats");
		System.out.println("Shop Name : "+shop1.name);
		System.out.println("Shop owner Name : "+shop1.ownerName);
		System.out.println("Shop mobile number : "+shop1.mobNo);
		System.out.println("Shop establish date : "+shop1.date);
		Shop shop2=new	Shop("Vasavi Chats","Tharun");
		System.out.println("Shop Name : "+shop2.name);
		System.out.println("Shop Owner Name : "+shop2.ownerName);
		System.out.println("Shop mobile number : "+shop2.mobNo);
		System.out.println("Shop establish date : "+shop2.date);
		Shop shop3=new	Shop("Vasavi Chats","Tharun",9902767258l);
		System.out.println("Shop Name : "+shop3.name);
		System.out.println("Shop Owner Name : "+shop3.ownerName);
		System.out.println("Shop Mobile Number: "+shop3.mobNo);
		System.out.println("Shop establish date : "+shop3.date);
		Shop shop4=new Shop("Vasavi chats","Tharun",9902767258l,"10-10-2008");
		System.out.println("Shop Name : "+shop4.name);
		System.out.println("Shop Owner Name : "+shop4.ownerName);
		System.out.println("Shop Mobile Number: "+shop4.mobNo);
		System.out.println("Shop Established date :"+shop4.date);
	}
}





