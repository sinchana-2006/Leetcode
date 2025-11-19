// Leetcode prob - 1 - Two Sum
/**import java.util.HashMap;
import java.util.Map;
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int curr = nums[i];
             int x = target - curr;
             if(map.containsKey(x)){
                return new int[] { map.get(x),i};
             }
             map.put(curr,i);
        }
        return null;
    }
}**/

// Leetcode prob - 9: Palindrome Number
/**class Solution {
    public boolean isPalindrome(int x) {
        int y = 0;
        int z = x;
        while(x>0)
        {
            y = (y*10) + (x%10);
            x = x/10;
        }

        return z == y;
    }
}**/

// Leetcode prob - 21 : Merge two sorted Lists
/** 
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            curr = curr.next;
        }

        if (list1 == null) {
            curr.next = list2;
            return dummy.next;
        }

        if (list2 == null) {
            curr.next = list1;
            return dummy.next;
        }

        return dummy.next;
    }
} **/

// Leetcode prob - 14 : Longest Common Prefix
/** 
 class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String s = strs[0];
        for (String str : strs) {
            if (str.length() < s.length()) s = str;
        }
        StringBuilder l = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (String str : strs) {
                if (str.charAt(i) != c) return l.toString();
            }
            l.append(c);
        }
        return l.toString();
    }
} **/

// Leetcode prob - 53: Maximum Subarray
/** 
  class Solution {
    public int maxSubArray(int[] nums) {
        int currSum = 0, maxSum = Integer.MIN_VALUE;
        int i = 0;
        while(i<nums.length) {
            currSum += nums[i];
            maxSum = Math.max(currSum, maxSum);
            if(currSum<0)
                currSum=0;
            i++;
        }
        return maxSum;
    }
}**/

// Leetcode prob - 50 : Pow(x, n)
/** class Solution {
    public double myPow(double x, int n) {
        long p=n;
        if(n<0){
            p=-p;
            double result = Math.pow(x, p);
            result=1/result;
            return result;
        }
        else{
            double result = Math.pow(x, n);
            return result;
        }
    }
} **/

// Leetcode prob - 19 : Remove Nth Node From End of List
/** 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pos=head;
        ListNode temp=head;
        int length=0;
        while(pos!=null){
            length++;
            pos=pos.next;
        }
        int remove=length-n;
        if(remove!=0){
            for(int i=0;i<remove-1;i++){
temp=temp.next;
            }
            temp.next=temp.next.next;
        }else if(head.next!=null){
            temp=temp.next;
            head=temp;
        }else{
            head=null;
        }
        return head;
    }
} **/ 

