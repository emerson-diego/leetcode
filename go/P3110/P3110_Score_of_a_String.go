package main

import (
	"fmt"
	"math"
)

func scoreOfString(s string) int {
	// Initialize the score variable
	score := 0

	// Loop through the string and calculate the sum of absolute differences
	for i := 0; i < len(s)-1; i++ {
		currentChar := int(s[i])
		nextChar := int(s[i+1])
		score += int(math.Abs(float64(currentChar - nextChar)))
	}

	return score
}

func main() {
	// Example usage
	fmt.Println(scoreOfString("hello")) // Output: 13
	fmt.Println(scoreOfString("zaz"))   // Output: 50
}