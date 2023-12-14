

# 14. Longest Common Prefix
### <span style="color: green; margin-left:10px">**Easy**</span>


Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".

## Example 1:

**Input:** strs = ["flower","flow","flight"]
**Output:** Output: "fl"

## Example 2:

**Input:** strs = ["dog","racecar","car"]
**Output:** ""
**Explanation:** There is no common prefix among the input strings.

### Constraints:

* 1 <= strs.length <= 200

* 0 <= strs[i].length <= 200

* strs[i] consists of only lowercase English letters.

### <span style="color: Red; margin-left:10px; text-weight:400;">**Couldn't Solve**</span>

### Logic:
1. Sort the arrays using array.sort()
2. Compare the first and last string member because they are least similar.