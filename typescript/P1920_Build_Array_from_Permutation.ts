(() => {
  //IIFE
  function buildArray(nums: number[]): number[] {

    let finalArray = new Array(nums.length);

    for (let i = 0; i < nums.length; i++) {
      finalArray[i] = nums[nums[i]];
    }

    return finalArray;
  }

  const result = buildArray([0, 2, 1, 5, 3, 4]);
  console.log(result);
})();
