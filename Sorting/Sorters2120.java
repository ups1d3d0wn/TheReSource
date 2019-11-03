/**
* @author Kevin Murphy
* @version 10/28/19
*
* This Sorters class implements multiple sorting methods that order items in
* a list. The sorting methods order the items so that the list can be searched
* using the binary search algorithm to to find a particular element. In the case
* that the element being searched for is not found, the recursiveBinarySearcher()
* method returns -1.
*/

import java.util.List;
import java.lang.Comparable;
import java.util.ArrayList;

public class Sorters2120 {

    /**
    * The bubbleSort() method
    *
    * @param theList  The list of items to be sorted
    */

    public static <T extends Comparable<T> > void bubbleSort(List<T> theList) {
        int lastToConsider = theList.size();
        while (lastToConsider > 1) {
            for (int j=0; j<lastToConsider-1; j++) {
                if (theList.get(j).compareTo(theList.get(j+1))  >  0 ) {
                    swap(theList,j,j+1);
                }
            }
            lastToConsider--;
        }
    }

    /**
    * The swap() method is a helper method to swap two items in a list.
    *
    * @param theList  The list we want to manipulate
    * @param i1  The first item. Must be a valid item of theList.
    * @param i2  The second item. Must be a valid item of theList.
    */

    private static <T extends Comparable<T> > void swap(List<T> theList, int i1, int i2) {

        T temp = theList.get(i1);
        theList.set(i1,theList.get(i2));
        theList.set(i2,temp);
    }

    /**
    * The selectionSort()
    *
    * @param theList  The list of tems we want to sort.
    */
    public static <T extends Comparable<T> > void selectionSort(List<T> theList) {
        // for each item in the list
        for(int i = 0; i < theList.size()-1; i++) {
          // find smallest element past i
          int indexOfSmallest = i;
          for(int j = i + 1; j < theList.size(); j++) {
              if(theList.get(indexOfSmallest).compareTo(theList.get(j)) > 0) {
                // swaps elements if they are not in proper order
                swap(theList, indexOfSmallest, j);
              } // end if statement
          } // end for loop [j]
        } // end for loop [i]
    } // end of selectionSort() method

    /**
    * The mergeSort() method calls the recursiveMergeSortHelper() method to
    * sort the List to be sorted using the following alogorithm:
    *
    * Divide the list into two halves. Sort each half recursively, then combine
    * the sorted halves. This runs in 0(n*lg(n)) time, roughly because we have
    * to divide the ArrayList until we encounter the base case, an 0(lg(n))
    * operation, each time performing the merge operation, an 0(n) operation.
    *
    * @param theList The entire List to sort
    *
    */

    public static <T extends Comparable<T> > void mergeSort(List<T> theList) {
  		// create an ArrayList<T> to hold a temp value while merging elements to form a list
  		ArrayList<T> temp = new ArrayList<T>();

  		for (int i = 0; i < theList.size(); i++) {
        temp.add(i, theList.get(i));
      }
  		// calls recursiveMergeSortHelper() method
  		recursiveMergeSortHelper(theList, temp, 0, theList.size()-1);
    } // end of mergeSort() method


    /**
    * The recursiveMergeSortHelper() method
    *
    * @param theList The entire List of dogs to sort
    * @param first The first item of the List
    * @param last The last item of the List
    */

    private static <T extends Comparable<T> > void recursiveMergeSortHelper(List<T> theList, List<T> combined, int first, int last) {

  		//
  		if ((last - first) >= 1) {
  			int m1 = (first + last) / 2;
  			int m2 = m1 + 1;

  			// recursively sort the 1st half
  			recursiveMergeSortHelper(theList, combined, first, m1);

  			// recursively sort the 2nd half
  			recursiveMergeSortHelper(theList, combined, m2, last);

  			// call the helper method to rebuild the List
  			merge(theList, combined, first, m1, m2, last);
  		} // end if there
    } // end of recursiveMergeSortHelper() method


    private static <T extends Comparable<T> > void merge(List<T> theList, List<T> combined, int left, int middle1, int middle2, int right) {

  		int leftIndex = left;
  		int rightIndex = middle2;
  		int combinedIndex = left;

  		while(leftIndex <= middle1 && rightIndex <= right) {
  			if(theList.get(leftIndex).compareTo(theList.get(rightIndex)) < 0) {
  				combined.set(combinedIndex++, theList.get(leftIndex++));
        } else {
          combined.set(combinedIndex++, theList.get(rightIndex++));
        }
  		} // end while

  		// add remaining elements to the List
  		if(leftIndex == middle2) {
  			while(rightIndex <= right) {
  				combined.set(combinedIndex++, theList.get(rightIndex++));
        }
      } else {
  			while(leftIndex <= middle1) {
  				combined.set(combinedIndex++, theList.get(leftIndex++));
        }
      } // end if/else

  		/**
  		 * Takes the elements in the newly sorted, combined List
  		 * and places those values into the original List
  		 * in order to send the sorted list back to the original
  		 * calling method.
  		 *
  		 */
  		for (int i = left; i <= right; i++) {
        theList.set(i, combined.get(i));
      }
  	} // end of merge() method




    // private static <T extends Comparable<T> > void recursiveMergeSortHelper(List<T> theList, int first, int last) {
    //   if(first >= last) {
    //     // Base case
    //     return;
    //   }
    //   else {
    //     final int split = (first + last) / 2;
    //     recursiveMergeSortHelper(theList, first, split);
    //     recursiveMergeSortHelper(theList, split + 1, last);
    //     merge(theList, first, split + 1, last);
    //   }
    //
    // } // end recursiveMergeSortHelper() method
    //
    // private static void merge(int[] data, int leftFirst, int rightFirst, int rightLast) {
    //   int copy[] = new int[rightLast - leftFirst + 1];
    //   int k = 0;
    //
    //   int i = leftFirst; // top of left
    //   int j = rightFirst; // top of right
    //
    //   while(i < rightFirst && j <= rightLast) {
    //     copy[k++] = (data[i] < data[j]) ? data[i++] : data[j++];
    //   } // end while 1
    //
    //   while(i >= rightFirst && j <= rightLast) {
    //     copy[k++] = data[j++];
    //   } // end while 2
    //
    //   while(j > rightLast && i < rightFirst) {
    //     copy[k++] = data[i++];
    //   } // end while 3
    //
    //   System.arraycopy(copy, 0, data, leftFirst, copy.length);
    //
    // } // end merge() method

    public static <T extends Comparable<T> > int indexOf(T searchItem, List<T> theList) {
    		mergeSort(theList);

        return recursiveBinarySearcher(searchItem, theList, 0, theList.size()-1);
    } // end indexOf() method

    private static <T extends Comparable<T> > int recursiveBinarySearcher(T searchItem, List<T> theList, int first, int last) {
      // gets middle of list to start splitting and searching
      int middle = (first + last) / 2;

      // base case
      if(last < first) {
        return -1;
      }

      // returns the index if the searchItem is the midpoint
      if(theList.get(middle).compareTo(searchItem) == 0) {
        return middle;
      }

      // returns a recursive call if the searchItem is left of the midpoint
      if(theList.get(middle).compareTo(searchItem) > 0) {
        return recursiveBinarySearcher(searchItem, theList, first, middle-1);
      }

      // returns a recusive call if the searchItem is right of the midpoint
      if(theList.get(middle).compareTo(searchItem) < 0) {
        return recursiveBinarySearcher(searchItem, theList, middle+1, last);
      }

      return 0;

    } // end of recursiveBinarySearcher() method

} // end of Sorters2120 class
