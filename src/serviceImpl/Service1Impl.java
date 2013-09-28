package serviceImpl;

import service.Service1;
import service.Service2;

public class Service1Impl implements Service1{
	
	private Service2 service2;
	
	

	public Service2 getService2() {
		return service2;
	}

	public void setService2(Service2 service2) {
		this.service2 = service2;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		System.out.println("service1 do something");
		service2.execute();
	}
	
	public Service1Impl(Service2 s2){
		this.service2 = s2;
	}

}
