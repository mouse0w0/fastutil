/*		 
 * fastutil: Fast & compact type-specific collections for Java
 *
 * Copyright (C) 2002, 2003 Sebastiano Vigna 
 *
 *  This library is free software; you can redistribute it and/or
 *  modify it under the terms of the GNU Lesser General Public
 *  License as published by the Free Software Foundation; either
 *  version 2.1 of the License, or (at your option) any later version.
 *
 *  This library is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 *  Lesser General Public License for more details.
 *
 *  You should have received a copy of the GNU Lesser General Public
 *  License along with this library; if not, write to the Free Software
 *  Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 *
 */

package it.unimi.dsi.fastutil;

import it.unimi.dsi.fastutil.booleans.*;
import it.unimi.dsi.fastutil.bytes.*;
import it.unimi.dsi.fastutil.shorts.*;
import it.unimi.dsi.fastutil.chars.*;
import it.unimi.dsi.fastutil.ints.*;
import it.unimi.dsi.fastutil.longs.*;
import it.unimi.dsi.fastutil.floats.*;
import it.unimi.dsi.fastutil.doubles.*;
import it.unimi.dsi.fastutil.objects.*;

import it.unimi.dsi.fastutil.Iterators;
import it.unimi.dsi.fastutil.Arrays;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.NoSuchElementException;

/** A class providing static methods that do useful things with sets.
 *
 * @see Collections
 */

public class Sets {

	private Sets() {}

	protected static class EmptySet extends Collections.EmptyCollection implements 
	   BooleanSet, ByteSortedSet, ShortSortedSet, IntSortedSet, LongSortedSet, CharSortedSet,
	   FloatSortedSet, DoubleSortedSet, ObjectSortedSet, ReferenceSortedSet, java.io.Serializable, Cloneable {
		
		public static final long serialVersionUID = -7046029254386353129L;

		private EmptySet() {}

		public boolean remove( int k ) { return false; }

		public ByteBidirectionalIterator iterator( byte from ) { return Iterators.EMPTY_ITERATOR; }
		public CharBidirectionalIterator iterator( char from ) { return Iterators.EMPTY_ITERATOR; }
		public ShortBidirectionalIterator iterator( short from ) { return Iterators.EMPTY_ITERATOR; }
		public IntBidirectionalIterator iterator( int from ) { return Iterators.EMPTY_ITERATOR; }
		public LongBidirectionalIterator iterator( long from ) { return Iterators.EMPTY_ITERATOR; }
		public FloatBidirectionalIterator iterator( float from ) { return Iterators.EMPTY_ITERATOR; }
		public DoubleBidirectionalIterator iterator( double from ) { return Iterators.EMPTY_ITERATOR; }
		public ObjectBidirectionalIterator iterator( Object from ) { return Iterators.EMPTY_ITERATOR; }

		public ByteSortedSet subSet( byte from, byte to ) { return EMPTY_SET; }
		public CharSortedSet subSet( char from, char to ) { return EMPTY_SET; }
		public ShortSortedSet subSet( short from, short to ) { return EMPTY_SET; }
		public IntSortedSet subSet( int from, int to ) { return EMPTY_SET; }
		public LongSortedSet subSet( long from, long to ) { return EMPTY_SET; }
		public FloatSortedSet subSet( float from, float to ) { return EMPTY_SET; }
		public DoubleSortedSet subSet( double from, double to ) { return EMPTY_SET; }
		public SortedSet subSet( Object from, Object to ) { return EMPTY_SET; }

		public ByteSortedSet headSet( byte from ) { return EMPTY_SET; }
		public CharSortedSet headSet( char from ) { return EMPTY_SET; }
		public ShortSortedSet headSet( short from ) { return EMPTY_SET; }
		public IntSortedSet headSet( int from ) { return EMPTY_SET; }
		public LongSortedSet headSet( long from ) { return EMPTY_SET; }
		public FloatSortedSet headSet( float from ) { return EMPTY_SET; }
		public DoubleSortedSet headSet( double from ) { return EMPTY_SET; }
		public SortedSet headSet( Object from ) { return EMPTY_SET; }

		public ByteSortedSet tailSet( byte to ) { return EMPTY_SET; }
		public CharSortedSet tailSet( char to ) { return EMPTY_SET; }
		public ShortSortedSet tailSet( short to ) { return EMPTY_SET; }
		public IntSortedSet tailSet( int to ) { return EMPTY_SET; }
		public LongSortedSet tailSet( long to ) { return EMPTY_SET; }
		public FloatSortedSet tailSet( float to ) { return EMPTY_SET; }
		public DoubleSortedSet tailSet( double to ) { return EMPTY_SET; }
		public SortedSet tailSet( Object to ) { return EMPTY_SET; }

		public Object first() { throw new NoSuchElementException(); }

		public boolean firstBoolean() { throw new NoSuchElementException(); }
		public byte firstByte() { throw new NoSuchElementException(); }
		public char firstChar() { throw new NoSuchElementException(); }
		public short firstShort() { throw new NoSuchElementException(); }
		public int firstInt() { throw new NoSuchElementException(); }
		public long firstLong() { throw new NoSuchElementException(); }
		public float firstFloat() { throw new NoSuchElementException(); }
		public double firstDouble() { throw new NoSuchElementException(); }

		public Object last() { throw new NoSuchElementException(); }

		public boolean lastBoolean() { throw new NoSuchElementException(); }
		public byte lastByte() { throw new NoSuchElementException(); }
		public char lastChar() { throw new NoSuchElementException(); }
		public short lastShort() { throw new NoSuchElementException(); }
		public int lastInt() { throw new NoSuchElementException(); }
		public long lastLong() { throw new NoSuchElementException(); }
		public float lastFloat() { throw new NoSuchElementException(); }
		public double lastDouble() { throw new NoSuchElementException(); }

		public Comparator comparator() { return null; }

		public ByteComparator byteComparator() { return null; }
		public CharComparator charComparator() { return null; }
		public ShortComparator shortComparator() { return null; }
		public IntComparator intComparator() { return null; }
		public LongComparator longComparator() { return null; }
		public FloatComparator floatComparator() { return null; }
		public DoubleComparator doubleComparator() { return null; }

		public Object clone() { return EMPTY_SET; }

        private Object readResolve() { return EMPTY_SET; }
	}


	/** An empty set (immutable). It is serialisable and cloneable.
	 *
	 * <P>The class of this objects represent an abstract empty set
	 * that is a subset of any type of set. Thus, {@link #EMPTY_SET}
	 * may be assigned a variable of any (sorted) type-specific set.
	 */

	public static final EmptySet EMPTY_SET = new EmptySet();
}

// Local Variables:
// mode: jde
// tab-width: 4
// End:
