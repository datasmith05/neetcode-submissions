class Solution {
    public boolean isPalindrome(String s) {
        //two pointer for compairing characters;
        int left = 0, right = s.length() - 1;

        //Loop will stoped when pointers crossed each other 
        while(left < right){
            //Skip the Non-AlphaNumeric characters
            while(left < right && nonAlphaNum(s.charAt(left))){
                left++;
            }

            while(right > left && nonAlphaNum(s.charAt(right))){
                right--;
            }

            //Check for non-match character 
            if(Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))){
                return false;
            }
            left++;
            right--;

        }

        //Return true if all are matched
        return true;
    }

    //Check Non-AlphaNumeric Character using ASCII value 
    public boolean nonAlphaNum(char c){
        return !((c >= 'A' && c <= 'Z') ||
         (c >= 'a' && c <= 'z') || 
         (c >= '0' && c <= '9'));
    }
}
