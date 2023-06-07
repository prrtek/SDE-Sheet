HashSet<Integer> set = new HashSet<>();
for (int i = 0; i < n; i++) {
    int element = arr.get(i);
    if (!set.add(element)) {
        return element;
    }
}
return -1;  /