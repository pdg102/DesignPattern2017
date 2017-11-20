package com.holub.life;

public class Rule2 extends Resident {

	@Override
	public Cell create() {
		return new Rule2();
	}

	@Override
	public boolean figureNextState(
			Cell north, 	Cell south,
			Cell east, 		Cell west,
			Cell northeast, Cell northwest,
			Cell southeast, Cell southwest )
	{
		verify(north, "north");
		verify(south, "south");
		verify(east, "east");
		verify(west, "west");
		verify(northeast, "northeast");
		verify(northwest, "northwest");
		verify(southeast, "southeast");
		verify(southwest, "southwest");

		int neighbors = 0;

		if( north.	  isAlive()) ++neighbors;
		if( south.	  isAlive()) ++neighbors;
		if( east. 	  isAlive()) ++neighbors;
		if( west. 	  isAlive()) ++neighbors;
		if( northeast.isAlive()) ++neighbors;
		if( northwest.isAlive()) ++neighbors;
		if( southeast.isAlive()) ++neighbors;
		if( southwest.isAlive()) ++neighbors;

		willBeAlive = (neighbors==3 || (amAlive && neighbors==2) || neighbors==4);
		return !isStable();
	}
}