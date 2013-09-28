package factory;

import service.Service2;
import serviceImpl.Service2Impl;

public class Service2Factory {

	public static Service2 getService2Instance(){
		return new Service2Impl();
	}
}
