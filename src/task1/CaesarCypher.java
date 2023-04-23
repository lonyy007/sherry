package task1;

public class CaesarCypher {

    //encode
    public char[] encode(char[] input, int offset) {

        //the offset bit is mod 26 to ensure that the offset bit is whithin the legal range
        offset = offset % 26;

        //loop through each character
        for (int i = 0; i < input.length; i++) {
            //If the character is offset within the range of a to z, it is offset normally. Otherwise, the offset character is rolled back to 26 bits
            if (input[i] >= 'a' && (input[i] + offset) <= 'z') {
                input[i] = (char) (input[i] + offset);
            } else {
                input[i] = (char) (input[i] + offset - 26);
            }
        }
        //return input
        return input;
    }

    //decode
    public char[] decode(char[] input, int offset) {
        //he offset bit is mod 26 to ensure that the offset bit is whithin the legal range
        offset = offset % 26;

        //loop through each character

        for (int i = 0; i < input.length; i++) {
            //If the character is offset within the range of a to z, it is offset normally. Otherwise, the character after the offset advances 26 bits
            if ((input[i] - offset) >= 'a' && input[i] <= 'z') {
                input[i] = (char) (input[i] - offset);
            } else {
                input[i] = (char) (input[i] - offset + 26);
            }
        }
        //return input
        return input;
    }
}