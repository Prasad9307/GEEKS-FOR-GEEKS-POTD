Given an array of strings, return all groups of strings that are anagrams. The groups must be created in order of their appearance in the original array. Look at the sample case for clarification.

Note: The final output will be in lexicographic order.

Examples:

Input: arr[] = ["act", "god", "cat", "dog", "tac"]
Output: [["act", "cat", "tac"], ["god", "dog"]]
Explanation: There are 2 groups of anagrams "god", "dog" make group 1. "act", "cat", "tac" make group 2.
Input: arr[] = ["no", "on", "is"]
Output: [["is"], ["no", "on"]]
Explanation: There are 2 groups of anagrams "is" makes group 1. "no", "on" make group 2.
Input: arr[] = ["listen", "silent", "enlist", "abc", "cab", "bac", "rat", "tar", "art"]
Output: [["abc", "cab", "bac"], ["listen", "silent", "enlist"], ["rat", "tar", "art"]]
Explanation: 
Group 1: "abc", "bac", and "cab" are anagrams.
Group 2: "listen", "silent", and "enlist" are anagrams.
Group 3: "rat", "tar", and "art" are anagrams.
Constraints:
1<= arr.size() <=100
1<= arr[i].size() <=10




public ArrayList<ArrayList<String>> anagrams(String[] strs) {
        HashMap<String,ArrayList<String>>map=new HashMap<>();
        for(String i:strs){
            char [] arr=i.toCharArray();
            Arrays.sort(arr);
            String news=new String(arr);
            map.put(news,new ArrayList<String>());
        }
        for(String str:strs){
            char [] arr=str.toCharArray();
            Arrays.sort(arr);
            String news=new String(arr);
            if(map.containsKey(news)){
                map.get(news).add(str);
            }
        }
        ArrayList<ArrayList<String>> list=new ArrayList<>();
        for(String key:map.keySet()){
            list.add(map.get(key));
        }
        return list;
