package ru.spbstu.telematics.axis2.client;


public class HelloServiceClient {
	public static void main(String[] args) throws Exception {
		HelloServiceStub stub = new HelloServiceStub();
		System.out.println(stub.sayHello("Tom"));
	}
}
