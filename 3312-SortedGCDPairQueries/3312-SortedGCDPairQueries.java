// Last updated: 7/17/2026, 1:42:13 PM
1class Solution {
2    static final int MX = 50_000;
3    static final int[] PRIMES;
4    static {
5        boolean[] comp = new boolean[MX + 1];
6        for (int p = 2; p * p <= MX; ++p)
7            if (!comp[p])
8                for (int k = p * p; k <= MX; k += p)
9                    comp[k] = true;
10        PRIMES = IntStream.rangeClosed(2, MX).filter(p -> !comp[p]).toArray();
11    }
12    public int[] gcdValues(int[] nums, long[] queries) {
13        int mx = Arrays.stream(nums).max().getAsInt();
14        int[] freq = new int[mx + 1];
15        for (int v : nums)
16            ++freq[v];
17        for (int p : PRIMES) {
18            if (p > mx) break;
19            for (int i = mx / p; i > 0; --i)
20                freq[i] += freq[i * p];
21        }
22        long[] g = Arrays.stream(freq).asLongStream()   
23                         .map(c -> c * (c - 1) / 2).toArray();
24        for (int p : PRIMES) {
25            if (p > mx) break;
26            for (int i = 1; i <= mx / p; ++i)
27                g[i] -= g[i * p];
28        }
29        long[] s = g.clone();
30        Arrays.parallelPrefix(s, Long::sum);
31        return Arrays.stream(queries).mapToInt(q -> upperBound(s, q)).toArray();
32    }
33    private int upperBound(long[] s, long q) {
34        int lo = 0, hi = s.length;
35        while (lo < hi) {
36            int mid = (lo + hi) >>> 1;
37            if (s[mid] > q) hi = mid;
38            else lo = mid + 1;
39        }
40        return lo;
41    }
42}