package com.holub.tools;


//Concrete Element class
public class Node implements NodeElement
{	public final Object subscriber;
	public final Node	next;

	public Node( Object subscriber, Node next )
	{	this.subscriber	= subscriber;
		this.next		= next;
	}

	public Node remove( Object target )
	{	if( target == subscriber )
			return next;

		if( next == null ) 						// target is not in list
			throw new java.util.NoSuchElementException
											(target.toString());

		return new Node(subscriber, next.remove(target));
	}

	public  void accept( Distributor deliveryAgent ) // deliveryAgent is
	{	deliveryAgent.deliverTo( subscriber );		 // a "visitor"
	}
}

