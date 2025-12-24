package com.simple.object;

public class Tv {
	
	private boolean power;
	private int volume;
	private int channel;
	
	public Tv() {
		this.power = false;
		this.volume = 10;
		this.channel = 1;
	}
	
	public Tv(int volume, int channel) {
		this.power = false;
		this.volume = volume;
		this.channel = channel;
	}
	
	public void powerSwitch() {
		// if 대신 ! 사용
		power = ! power;
		System.out.println("전원 : "+(power ? "ON" : "OFF"));	
	}
	
	
	
	public void volumeUp() {
		if(volume < 10) 
			volume++; 
			System.out.println("현재 볼륨 : "+volume);
		
	}
	
	public void volumeDown() {
		if(!power) {
			System.out.println("TV가 꺼져있습니다.");
			return; 	
		}
		if(volume > 0) 
			volume--; 
			System.out.println("현재 볼륨 : "+volume);
		
	}
	
	public void channelUp() {
		if(channel <= 30) 
			channel++; 
			System.out.println("현재 채널 : "+channel);
		
	}
	
	public void channelDown() {
		if(channel >= 1) 
			channel--; 
			System.out.println("현재 채널 : "+channel);
		
	}

	public void setChannel(int channel) {
		if(channel >= 1 && channel <= 30) {
			this.channel = channel;			
		}  
		
		System.out.println("현재 채널 : " +channel);
	}
	
	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.powerSwitch();
		tv.setChannel(7);
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.volumeUp();
		tv.channelUp();
		tv.powerSwitch();
		
		
	}
	
	
	

}
