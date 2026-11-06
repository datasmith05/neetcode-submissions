class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()) {
            return "";
        }
        //Use the StringBuilder for mutablity
        StringBuilder result = new StringBuilder();
        //Store the size of each string in list
        List<Integer> sizes = new ArrayList<>();

        for(String s : strs){
            sizes.add(s.length());
        }
        for(int size : sizes){
            result.append(size).append(',');
        }
        //Separate the string sizes and content with '#'
        result.append('#');
        for(String s : strs){
            result.append(s);
        }

        return result.toString();
    }

    public List<String> decode(String str) {
        if(str.length() == 0) {
            return new ArrayList<>();
        }
        List<String> result = new ArrayList<>();
        List<Integer> sizes = new ArrayList<>();

        int i = 0;
        //Extract the sizes of the each string from the encoded Sting
        while(str.charAt(i) != '#'){
            StringBuilder current = new StringBuilder();
            while(str.charAt(i) != ','){
                current.append(str.charAt(i));
                i++;
            }
            sizes.add(Integer.parseInt(current.toString()));
            i++;
        }
        i++;
        //Store the string from the encoded string as per length 
        for(int size : sizes){
            result.add(str.substring(i,i+size));
            i += size;
        }

        return result;
    }
}
