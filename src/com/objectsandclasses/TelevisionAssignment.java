package com.objectsandclasses;
public class TelevisionAssignment {

	private boolean state=false;
	private int currentVolume=0;
	private int currentChannel=0;
	
	public static final int INCREASE=1;
	public static final int DECREASE=-1;
	
	public void changeVolume(int volumeAction) {
		if(volumeAction==INCREASE) {
			this.currentVolume++;
		}
		else if(volumeAction==DECREASE && currentVolume>=0) {
			this.currentVolume--;
		}
	}

	public void changeChannel(int channelAction) {
		if(channelAction==INCREASE) {
			this.currentChannel++;
		} 
		else if(channelAction==DECREASE && currentChannel>=0) {
			this.currentChannel--;
		}
	}

	public void changeState(){
		this.state=!state;
	}
}
