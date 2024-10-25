class PoliceStation {
	String name;
	String location;
	String subInspectorName;
	String constableName;
	String inspectorName;
	String headConstableName;
	
	PoliceStation(){
		System.out.println("Running Ploice station constructor in policeSation class");
	}
	PoliceStation(String name){
		this.name=name;
	}
	PoliceStation(String name,String location){
		this(name);
		this.location=location;
	}
	PoliceStation(String name,String location, String subInspectorName){
		this(name,location);
		this.subInspectorName=subInspectorName;
	}
	PoliceStation(String name,String location, String subInspectorName,String constableName){
		this(name,location,subInspectorName);
		this.constableName=constableName;
	}
	PoliceStation(String name,String location, String subInspectorName,String constableName,String inspectorName){
		this(name,location,subInspectorName,constableName);
		this.inspectorName=inspectorName;
	}
	PoliceStation(String name,String location, String subInspectorName,String constableName,String inspectorName,String headConstableName){
		this(name,location,subInspectorName,constableName,inspectorName);
		this.headConstableName=headConstableName;
	}
}