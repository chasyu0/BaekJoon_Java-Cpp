class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        /* 두 배열을 하나로 합친다.
            정렬하고
            중간값 찾기 -> 중간값중에 두 수가 평균이면 (더해서 /2) 
            시간 복잡도 고려는 어떻게? 0(log (m+n)) */

        int[] merged = new int[nums1.length + nums2.length];

        for(int i=0; i<nums1.length; i++) {
            merged[i] = nums1[i];
        }

        for(int j=0; j<nums2.length; j++) {
            merged[nums1.length+j] = nums2[j];
        }

        Arrays.sort(merged);

        if(merged.length % 2 == 1) {
            return merged[merged.length/2];
        } else {
            return (merged[merged.length/2-1] + merged[merged.length/2])/2.0; 
        }
    }
}