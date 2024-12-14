(() => { //IIFE
    function getConcatenation(nums: number[]): number[] {
      let n = nums.length;
      let ans: number[] = new Array(2 * n);
  
      for (let i = 0; i < n; i++) {
        ans[i] = nums[i];
        ans[i + n] = nums[i];
      }
  
      return ans;
    }
  
    const result = getConcatenation([1, 2, 1]);
    console.log(result);
  })();