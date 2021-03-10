package intlist_alt;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntList {

	/**
	 * @creates | result
	 * @basic
	 */
	public int[] getElements() { throw new RuntimeException("Not yet implemented");}
	
	/**
	 * @post | result == getElements().length
	 */
	public int getLength() { throw new RuntimeException("Not yet implemented");}
	
	/**
	 * @pre | 0 <= index && index < getLength()
	 * @post | result == getElements()[index]
	 */
	public int getElementAt(int index) { throw new RuntimeException("Not yet implemented");}
	
	/**
	 * @post | getLength() == 0
	 */	
	public IntList() { throw new RuntimeException("Not yet implemented");}
	
	/**
	 * @post | getLength() == old(getLength()) + 1
	 * @post | getElementAt(old(getLength())) == value
	 * @post | IntStream.range(0, old(getLength())).allMatch(i ->
	 * 		 | 		getElementAt(i) == old(getElements())[i])
	 * @post | Arrays.equals(getElements(), 0, getLength() - 1, 
	 * 		 |				 old(getElements()), 0, old(getLength()))
	 * 
	 * // getElemntsAt(i) == old(getElementsAt(i)) deze is niet juist
	 * // want old wordt geevalueerd voor de uitvoering en i is beschikbaar pas na de evaluatie
	 * 
	 * // IntStream.range(a, b).allMatch(i -> uitspraak over i)
	 * // forall i. a <= i < b ==> uitspraak over i
	 */
	public void addElement(int value) { throw new RuntimeException("Not yet implemented");}
	
	/**
	 * @mutates | this
	 * 
	 * @pre | 0 <= index && index < getLength()
	 * @post | getLength() == old(getLength())
	 * @post | IntStream.range(0, getLength()).allMatch(i -> 
	 * 		 | 		i == index ? 
	 * 		 |			getElementAt(i) == value 
	 * 		 | 		: 
	 * 		 | 			getElementAt(i) == old(getElements())[i]) 
	 * 
	 * // voorwaarde ? waar-waarde : onwaar-waarde
	 */
	public void setElement(int index, int value) {
		
	}
}
