import helpers.TreeNode;

public class Main {

    public static void main(String[] args) {
//        System.out.println(E125.isPalindrome("A man, a plan, a canal: Panama"));
//        System.out.println(E392.isSubsequence("axc", "ahbgdc"));
//        System.out.println(Arrays.toString(M167.twoSum(new int[]{1, 2, 3}, 4)));
//        System.out.println(Arrays.toString(E1.twoSum(new int[]{0, 0, 3, 4}, 0)));
//        System.out.println(M209.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
//        System.out.println(M3.lengthOfLongestSubstring("abcabcbb"));
//        System.out.println(M122.maxProfit(new int[]{7,1,5,3,6,4}));
//        System.out.println(M55.canJump(new int[]{2,5,0,0}));
//        System.out.println(M45.jump(new int[]{3,4,3,2,5,4,3}));
//        System.out.println(E13.romanToInt("LVIII"));
//        System.out.println(E58.lengthOfLastWord("   fly me   to   the moon  "));
//        System.out.println(E14.longestCommonPrefix(new String[]{"flower","flow","flight"}));
//        System.out.println(E28.strStr("abc", "c"));
//        System.out.println(Task.isPalidrome("Race fast, safe car"));
//        System.out.println(M274.hIndex(new int[]{1,3,1,2}));
//        System.out.println(Arrays.toString(M238.productExceptSelf(new int[]{1, 2, 3, 4})));
//        System.out.println(M451.frequencySort("tree"));
//        System.out.println(E724.pivotIndex(new int[]{1,7,3,6,5,6}));
//        System.out.println(E724.pivotIndex(new int[]{1,2,3}));
//        System.out.println(E724.pivotIndex(new int[]{4,3,-3}));
//        System.out.println(M1717.maximumGain("aabbaaxybbaabb", 5, 4));
//        System.out.println(M1717.maximumGain("cdbcbbaaabab", 4, 4));
//        System.out.println(M134.canCompleteCircuit(new int[]{1,2,3,4,5}, new int[]{3,4,5,1,2}));
//        System.out.println(M134.canCompleteCircuit(new int[]{5,1,2,3,4}, new int[]{4,4,1,5,1}));
//        System.out.println(M151.reverseWords("a good   example"));
//        System.out.println(M11.maxArea(new int[]{1,8,6,2,5,4,8,3,7}));
//        System.out.println(M11.maxArea(new int[]{1,1}));
//        System.out.println(E3487.maxSum(new int[]{1,2,3,4,5}));
//        System.out.println(E3487.maxSum(new int[]{1,2,-1,-2,1,0,-1}));
//        System.out.println(M15.threeSum(new int[]{-1,0,1,2,-1,-4}));
//        System.out.println(M15.threeSum(new int[]{0,0,0,0}));
//        System.out.println(M18.fourSum(new int[]{1,0,-1,0,-2,2}, 0));
//        System.out.println(M18.fourSum(new int[]{2,2,2,2}, 8));
//        System.out.println(E383.canConstruct("aa", "aab"));
//        System.out.println(E205.isIsomorphic("foo", "bar"));
//        System.out.println(E290.wordPattern("abba", "dogq cat cat dog"));
//        System.out.println(M49.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"}));
//        System.out.println(Arrays.toString(E1.twoSum(new int[]{3,3}, 6)));
//        System.out.println(E202.isHappy(19));
//        System.out.println(E202.isHappy(2));
//        System.out.println(E20.isValid("([]{()(){()()()}})"));
//        System.out.println(M71.simplifyPath("/../"));
//        System.out.println(E35.searchInsert(new int[]{1,3,5,6}, 5));
//        System.out.println(M33.search(new int[]{5,1,3}, 5));
//        System.out.println(Arrays.toString(M34.searchRange(new int[]{5,7,7,8,8,10}, 8)));
//        System.out.println(Arrays.toString(M34.searchRange(new int[]{5,7,7,8,8,10}, 6)));
//        System.out.println(Arrays.toString(M34.searchRange(new int[]{1,2,3}, 2)));
//        System.out.println(Arrays.toString(M34.searchRange(new int[]{1,2,3,3,3,3,4,5,9}, 3)));
//        System.out.println(M198.rob(new int[]{4, 1, 2, 9, 3, 1, 5, 10, 2, 7}));
//        System.out.println(M322.coinChange(new int[]{1,2,5}, 11));
//        System.out.println(M300.lengthOfLIS(new int[]{3, 1, 2, 3, 4, 5, 0, 1, 2}));
//        System.out.println(E1768.mergeAlternately("asdfasdf", "asdfasd"));
//        System.out.println(E605.canPlaceFlowers(new int[]{1,0,0,0,0,1}, 2));
//        System.out.println(E605.canPlaceFlowers(new int[]{0,0,1,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,1,0,0,0,0,0,1,0,1,0,0,0,1,0,0,1,0,0,0,1,0,0,1,0,0,1,0,0,0,1,0,0,0,0,1,0,0,1,0,0,0,0,1,0,0,0,1,0,1,0,0,0,0,0,0}, 17));
//        System.out.println(M334.increasingTriplet(new int[]{2,4,-2,-3}));
//        System.out.println(M334.increasingTriplet(new int[]{1,2,3,4,5}));
//        System.out.println(M443.compress(new char[]{'a','a','b','b','c','c','c'}));
//        System.out.println(M1456.maxVowels("abciiidef", 3));
//        System.out.println(M2390.removeStars("leet**cod*e"));
//        System.out.println(M2390.removeStars("erase*****"));
//        System.out.println(Arrays.toString(M735.asteroidCollision(new int[]{3, 5, -6, 2, -1, 4})));
//        System.out.println(Arrays.toString(M735.asteroidCollision(new int[]{-2, -2, 1, -2})));
//        System.out.println(Arrays.toString(M735.asteroidCollision(new int[]{-2, -1, 1, -2})));
//        System.out.println(Arrays.toString(M735.asteroidCollision(new int[]{1, -1, -2, -2})));
//        System.out.println(Arrays.toString(M735.asteroidCollision(new int[]{-9,5,-7,5,2,-5,-5,8,3,10})));
//        System.out.println(Arrays.toString(M735.asteroidCollision(new int[]{10, 2, -5})));
//        System.out.println(M394.decodeString("3[a2[c]]"));

        TreeNode root1 = new TreeNode(1,
                new TreeNode(-1,
                        new TreeNode(0),
                        new TreeNode(0)
                ),
                new TreeNode(3,
                        new TreeNode(1),
                        new TreeNode(1)
                )
        );

        TreeNode root2 = new TreeNode(1,
                new TreeNode(3,
                        new TreeNode(0),
                        new TreeNode(1)
                ),
                new TreeNode(2,
                        null,
                        new TreeNode(1)
                )
        );

//        System.out.println(E872.leafSimilar(root1, root2));
        System.out.println(M1448.goodNodes(root1));
    }


}
