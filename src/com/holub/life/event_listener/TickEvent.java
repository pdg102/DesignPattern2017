package com.holub.life.event_listener;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.holub.life.Clock;

public class TickEvent implements ActionListener{
	
	Clock mClock;
	
	public TickEvent(Clock clock){
		mClock = clock;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		mClock.tick();
	}
}
