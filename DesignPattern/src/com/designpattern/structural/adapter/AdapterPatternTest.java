package com.designpattern.structural.adapter;
/*
Adapter Design Pattern Example in JDK

Some of the adapter design pattern example I could easily find in JDK classes are;

java.util.Arrays#asList()
java.io.InputStreamReader(InputStream) (returns a Reader)
java.io.OutputStreamWriter(OutputStream) (returns a Writer)
 */

public class AdapterPatternTest {

	public static void main(String[] args) {		
		testObjectAdapter();
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i) {
		switch (i){
		case 3: return sockAdapter.get3Volt();
		case 12: return sockAdapter.get12Volt();
		case 120: return sockAdapter.get120Volt();
		default: return sockAdapter.get120Volt();
		}
	}

	private static void testObjectAdapter() {
		SocketAdapter sockAdapter = new SocketAdapterImpl();
		Volt v3 = getVolt(sockAdapter,3);
		Volt v12 = getVolt(sockAdapter,12);
		Volt v120 = getVolt(sockAdapter,120);
		System.out.println("v3 volts using Object Adapter="+v3.getVolts());
		System.out.println("v12 volts using Object Adapter="+v12.getVolts());
		System.out.println("v120 volts using Object Adapter="+v120.getVolts());
	}
}

