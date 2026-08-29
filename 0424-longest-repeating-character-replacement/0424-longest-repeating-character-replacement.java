class Solution {
    public int characterReplacement(String s, int k) {
        int n = s.length();
        int[] freq = new int [26];
        int left=0;
        int max=0;
        int mostFreqLetter=0;

        for(int right=0;right< n;right++){
            freq[s.charAt(right)- 'A']++;
            mostFreqLetter = Math.max(mostFreqLetter,freq[s.charAt(right) - 'A']);

            int letterChange = (right - left + 1 ) - mostFreqLetter;
            while(letterChange > k){
                freq[s.charAt(left) - 'A']--;
                left++;
                letterChange = (right - left + 1 ) - mostFreqLetter;
            }
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}