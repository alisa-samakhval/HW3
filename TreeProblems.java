/*
 * *** Alisa Samakhval COMP 272 - 01 ***
 *
 * This java file contains several simple tree problems that need to be
 * codified. These routines  must use the TreeMap and TreeSet library
 * classes from the Java Collection Framework.
 *
 */

import java.util.*;

public class TreeProblems {

  /**
   * Method different()
   *
   * Given two TreeSets of integers, return a TreeSet containing all elements 
   * that are NOT in both sets. In other words, return a TreeSet of all the
   * elements that are in one set but not the other.
   */
  
  public static Set<Integer> different(Set<Integer> setA, Set<Integer> setB) {
    //to store the common elements
    Set<Integer> same = new HashSet<Integer>(setA);
    same.retainAll(setB);

    Set<Integer> all = new HashSet<Integer>(setA);
    all.addAll(setB);
    all.removeAll(same);

    return all;
  }


  /**
   * Method removeEven()
   * Given a treeMap with the key as an integer, and the value as a String,
   * remove all <key, value> pairs where the key is even. 
   */

  public static void removeEven(Map<Integer, String> treeMap) {
    Iterator <Integer> iterator = treeMap.keySet().iterator();
    //iterate through all the keys
    while(iterator.hasNext()){
      Integer aKey = iterator.next();
      if (aKey % 2 ==0){
        iterator.remove();
      }
    }
    return;
  }


  /**
   * Method treesEqual()
   *
   * Given two treeMaps, each with the key as an integer, and the value as a String,
   * return a boolean value indicating if the two trees are equal or not.
   */

  public boolean treesEqual(Map<Integer, String> tree1,Map<Integer, String> tree2 ) {

    if (tree1.equals(tree2)){
      return true;
    }

    return false;

  }

} // end treeProblems class
