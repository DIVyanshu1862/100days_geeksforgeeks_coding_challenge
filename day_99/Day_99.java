class Solution {
  String removeDuplicates(String str) {
    LinkedHashSet<Character> hs = new LinkedHashSet<>();

    for (int i = 0; i < str.length(); i++) {
      hs.add(str.charAt(i));
    }
    ArrayList<Character> arr = new ArrayList<>();
    arr.addAll(hs);
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < arr.size(); i++) {
      sb.append(arr.get(i));
    }
    return sb.toString();

  }
}
