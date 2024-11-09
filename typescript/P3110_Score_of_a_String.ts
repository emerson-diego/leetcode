function scoreOfString(s: string): number {

  if (!s || s.length < 2) return 0;
  
  let score = 0;
  for(let i=0; i < s.length - 1; i++){
      const currentCharCode  = s.charCodeAt(i);
      const nextCharCode = s.charCodeAt(i+1);

      score += Math.abs(currentCharCode - nextCharCode);
  }
  return score;
}

let test = scoreOfString("hello");
console.log(test);
