package com.simple.object;

public class TvUser {
	
	public static void main(String[] args) {
		
		Tv tv = new Tv();
		RemoteController remote = new RemoteController(tv);
		
		remote.powerOnOf();
		remote.channelDown();
		remote.volumeUP();
		remote.volumeUP();
		remote.volumeUP();
		remote.setChannel(14);
		
		remote.powerOnOf();
		
		
		
		
		
	}

}
