package com.holub.life.event_listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.holub.life.Clock;

public class TickingEvent implements ActionListener{
	
	Clock mClock;
	int mInterver;
	
	public TickingEvent(Clock clock,int interver){
		mClock = clock;
		mInterver = interver;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		mClock.startTicking(mInterver);
	}
}
