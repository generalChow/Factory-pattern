package client;

import factory.Service1Factory;
import service.Service1;

public class Client {

	public void doSomething(){
		Service1 service = Service1Factory.getService1Intance();
		service.execute();
	}
	
	public static void main(String a[]){
		new Client().doSomething();
	}
}
