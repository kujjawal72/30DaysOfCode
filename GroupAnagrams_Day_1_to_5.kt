// Problem Link: https://leetcode.com/problems/group-anagrams


class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val mainMap = HashMap<HashMap<Char,Int>,ArrayList<String>>();
        strs.forEach{it: String->
            //val temp = it.toCharArray().sorted().joinToString(separator = "")
            val map = HashMap<Char,Int>()
            it.toCharArray().forEach{c->
                val x = map.get(c)
                map.put(c,if(x == null) 1 else x+1)
            }
            val x = mainMap.get(map);
            //print(map +" " + x)
            if(x == null){
                mainMap.put(map,arrayListOf(it))
            }else{
                x!!.add(it)
                mainMap.put(map,x!!);
            }
        }
        return mainMap.values.toList();
    }
}
