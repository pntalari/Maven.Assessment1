package com.zipcodewilmington.assessment1.part2;

import javax.sound.midi.SysexMessage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by leon on 2/16/18.
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        Integer counter = 0;
        for (int i=0;i<objectArray.length;i++)
        {
            if(objectArray[i].equals(objectToCount))
            counter++;
        }
        return counter;
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects, name `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        StringBuilder str = new StringBuilder();
        ArrayList<Integer> arrList = new ArrayList<>();
        Object[] retArray = new Integer[str.length()];

        for (int i=0;i<objectArray.length;i++) {
            if (!objectArray[i].equals(objectToRemove))
                arrList.add((Integer)(objectArray[i]));
                //str.append(objectArray[i]);
        }
        while (arrList.remove(null))
        {}

        retArray = arrList.toArray();
        return retArray;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occuring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
      Integer maxCount =0, result = -1;
       Map<Integer,Integer> map = getFrequency(objectArray);

        //find frequency
        for(Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(maxCount < entry.getValue())
            {
                result = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return result;
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Integer leastCount = objectArray.length+1, result = -1;
        Map<Integer,Integer> map = getFrequency(objectArray);
        for (Map.Entry<Integer,Integer> entry: map.entrySet())
        {
            if(leastCount >= entry.getValue())
            {
                result = entry.getKey();
                leastCount = entry.getValue();
            }
        }

        return result;
    }

    //method to find the frequency of objectArray values and store into a HashMap
    public static Map<Integer,Integer> getFrequency(Object[] objectArray)
    {
        Integer maxCount =0, result = -1;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i =0;i<objectArray.length;i++)
        {
            int key = Integer.parseInt(objectArray[i].toString());
            if(map.containsKey(key))
            {
                int freq = map.get(key);
                freq++;
                map.put(key,freq);
            }
            else
            {
                map.put(key,1);
            }
        }
        return map;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Integer[] mergeArr = new Integer[objectArray.length+objectArrayToAdd.length];

        System.arraycopy(objectArray,0,mergeArr,0,objectArray.length);
        System.arraycopy(objectArrayToAdd,0,mergeArr,objectArray.length,objectArrayToAdd.length);

        return mergeArr;
    }
}
