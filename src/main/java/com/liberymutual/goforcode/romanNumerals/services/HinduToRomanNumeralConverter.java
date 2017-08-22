package com.liberymutual.goforcode.romanNumerals.services;


//import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class HinduToRomanNumeralConverter 
{
    
    // private final int num = 0;    
    
    
    public Map<Integer, String> loadMapOfHinduRomanNumerals() 
    	{
        LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
 
        map.put(1,"I");
        map.put(2,"II");
        map.put(3,"III");
        map.put(4,"IV");
        map.put(5,"V");
        map.put(6,"VI");
        map.put(7,"VII");
        map.put(8,"VIII");
        map.put(9,"IX");
        map.put(10,"X");
        map.put(20,"XX");
        map.put(30,"XXX");
        map.put(40,"XL");
        map.put(50,"L");
        map.put(60,"LX");
        map.put(70,"LXX");
        map.put(80,"LXXX");
        map.put(90,"XC");
        map.put(100,"C");
        map.put(200,"CC");
        map.put(300,"CCC");
        map.put(400,"CD");
        map.put(500,"D");
        map.put(600,"DC");
        map.put(700,"DCC");
        map.put(800,"DCCC");
        map.put(900,"CM");
        map.put(1000,"M");
        map.put(2000,"MM");
        map.put(3000,"MMM");
        map.put(4000,"MMMM");
        
    	return map;}

    
    // Convert an array of Hindu numbers (that the Hindu input is broken into) into Roman numbers that are concatenated into a number 
    // Use a map look up
    public String mapHinduIntoRomanNumerals(String[] arr, Map<Integer, String> map) {
    	String romanNum = ""; 
    	
    	for(int i = 0; i < arr.length; i++)
    	  for(Map.Entry<Integer, String> iter : map.entrySet())  
    		  if(iter.getKey() == Integer.parseInt(arr[i]))  
    		  {
	    	      romanNum += iter.getValue();
	    		  continue;
    	      };
    	if (romanNum.length() < 1) romanNum = "The Hindu input is out of bounds.";
    	System.out.println("Converted to: " + romanNum);	
    	
    	return romanNum;
    }

    // Break Hindu int in 'register classes': 3,874 --> 3,000  &&  800  &&  70  &&  4
    public String [] breakNumbIntoArray(int num) 
		{
			String temp = "";
			
			temp = String.valueOf(num);
		    String[] arr = new String [temp.length()];
		    													// Validate - return empty array - does not work --> need the input box min/max params?
		    if( num <= 0 )  return arr;
		    	
			for(int i = 0; i < temp.length(); i++)
			{ arr[i] = temp.substring(i, i+1);}	
			
			addZeroesToStringArr(arr);			
																//System.out.println("Final Arr: " + Arrays.toString(arr));
			System.out.println("Hindu:        " + num);
			  
			return arr;
		}



	
	public String[] addZeroesToStringArr (String[] arrZ) {
			
		for(int i = 0; i < arrZ.length+1;  i++)
			{   int j = arrZ.length - i - 1;
			    												//System.out.println("The i: " + i +  " j: " + j);
				addZeroToStringArr(arrZ, i, j);
																//System.out.println(i + ". ANSW : " + arrZ[i]);
				if (j == 1) continue;}
			
		return arrZ;
	}
	
	
	// Add t '0's to the kth element of the array 
	public String[] addZeroToStringArr(String[] arrZ, int k, int t) 
	{ 
		for (int i = 0; i < t; i++) {
		     arrZ[k] = arrZ[k].concat("0");
		     													// System.out.println("PITS: i = " + i + " k = " + k + " ArrElem: " + arrZ[i]);
		};
		
	    return arrZ;}

}
