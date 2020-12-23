class Solution {
    public boolean isHappy(int n) {
        ArrayList<Integer> arr =  new ArrayList<>();
        String s = Integer.toString(n);
        while (n!=1) {
            int sum = 0;
            s = Integer.toString(n);
            for (int i=0;i<s.length();i++) {
                sum += (s.charAt(i) - '0')*(s.charAt(i) - '0');
            }
            //System.out.println(sum);
            if (arr.contains(sum)) {return false;} 
            else { arr.add(sum);}
            n=sum;
        }
        return true;
    }
}
