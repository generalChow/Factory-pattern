package factory;

import service.Service1;
import service.Service2;
import serviceImpl.Service1Impl;

public class Service1Factory {

	public static Service1 getService1Intance(){
		Service2 service2 = Service2Factory.getService2Instance();
		return new Service1Impl(service2);
	}
}
