/*
	Remove Duplicates from a List of Words 
	
	Given a List of Strings, write a method removeDuplicates that removes duplicate words from the List and returns an ArrayList of all the unique words. The returned ArrayList should be lexically alphabetically.

	Input: [Hi, Hello, Hey, Hi, Hello, Hey]

	Output: [Hello, Hey, Hi]

*/

//My solution
public static ArrayList<String> removeDuplicates(List<String> input) {
    
    return new ArrayList<>(new TreeSet<>(input));

}

//Kind of a fast, fancy implementation. It's all shorthand. To explain:
/*
	We use a set, because a set holds no duplicates. We use this type of setup new TreeSet<>(input); because it automatically does the addAll(); function.
	So now we have a set - all duplicates removed.
	There are 2 kinds of Sets. A HashSet - which orders all elements accoridng to a Hash function. and there is a TreeSet, which uses an underlying binary search tree to organize the elements, thus returning them in sorted order. That is the one we use.
	Then we return an ArrayList. we use this set up ArrayList<>(new TreeSet <>(input) ).
	this is shorthand for the addAll( ) method in the ArrayList. It adds all the elements in our treeset, which has all the elements of the input added. 
*/
