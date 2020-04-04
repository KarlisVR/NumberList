/*
 * Sastādīt Groovy programmu, kas pārveido skaitļu sarakstu, 
 * izmetot dotu elementu tā pēdējā parādīšanās reizē.
 * */
class NumberList {
	static void main(String[] args) {
		
		def number = 5;
		def numberList = [5, 36, 6, 5, 8, 5, 31, 6, 23];
		def reverseList = numberList.reverse();
		println(numberList);
		
		for (def i = 0; i < reverseList.size(); i++) {
			if (reverseList[i] == number) {
				reverseList.remove(i);
				break;
			}
		}
		
		numberList = reverseList.reverse();
		println(numberList);
	}
}
