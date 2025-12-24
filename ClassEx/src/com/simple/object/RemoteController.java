package com.simple.object;

public class RemoteController {

	//TV의 위치 확인
	private Tv tv; 
	
	
	public RemoteController(Tv tv) {
		this.tv = tv;
	}
	
	public void powerOnOf() {
		tv.powerSwitch();
	}
	
	public void volumeUP() {
		tv.volumeUp();
	}
	
	public void volumeDown() {
		tv.volumeDown();
	}
	
	public void channelUp() {
		tv.channelUp();
	}
	
	public void channelDown() {
		tv.channelDown();
	}
	
    void setChannel(int channel) {
        tv.setChannel(channel);
    }

}
