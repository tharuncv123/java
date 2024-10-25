class Mobile {
	double weight;
	double height;
	String colour;
	String brand;
	String model;
	int ram;
	int rom;
	int noOfCamera;
	int os;
	int network;
	
	Mobile(double weight,double height){
		this.weight=weight;
		this.height=height;
	}
	Mobile(double weight,double height,String colour,String brand){
		this(weight,height);
		this.colour=colour;
		this.brand=brand;
	}
	Mobile(int ram,int rom,int noOfCamera){
		this.ram=ram;
		this.rom=rom;
		this.noOfCamera=noOfCamera;
	}
	Mobile(int os){
		this.os=os;
		
	}
	Mobile(double weight,double height,String colour,String brand,int network){
		this(weight,height,colour,brand);
		this.network=network;
	}



}