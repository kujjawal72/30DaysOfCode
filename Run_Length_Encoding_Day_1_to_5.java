//problem link: https://practice.geeksforgeeks.org/problems/run-length-encoding/1/

class GfG
 {
	String encode(String str)
	{
          String res = "";
          int start = 0;
          int end = 0;
          while(end<str.length()){
              char c = str.charAt(start);
              int count = 0;
              while(end < str.length() && c == str.charAt(end)){
                  count++;
                  end++;
              }
              start = end;
              res += ""+c+count;
          }
          return res;
	}
	
 }
