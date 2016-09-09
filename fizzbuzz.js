console.log("This a javascript automatically generate an array from number 10 to 250, then For each number in the sequence, output the number to the screen.However, if the number is divisible by 3, output the word Buzz instead of the number. If the number is divisble by 5, output Fizz to the screen instead of the number. If the number is divisible by both, output BuzzFizz to the screen instead of the number. ");;

for (i=10; i<=250; i++) {
	if (i % 3 == 0) {
		if (i % 5 ==0) {
			console.log('FizzBuzz');
		} else {
			console.log('Fizz');
		}
	} else if(i % 5 == 0) {
			console.log('Buzz');
	} else
			console.log(i);
}
