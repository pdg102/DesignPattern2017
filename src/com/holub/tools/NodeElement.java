package com.holub.tools;

//Visitor pattern을 위한 Element interface 추가
	public interface NodeElement
	{
		void accept( Distributor deliveryAgent);
	}