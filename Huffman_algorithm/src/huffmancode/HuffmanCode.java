
package huffmancode;

import static huffmancode.Huffman.buildTree;
import static huffmancode.Huffman.printCodes;

public class HuffmanCode {

    public static void main(String[] args) {
        String str = "12345678"; 
        char[] test2 = str.toCharArray();
      
        int[] charFreqs = {36,18,12,9,7,6,5,4};


        
        HuffmanTree tree = buildTree(charFreqs,test2);

      
        System.out.println("SYMBOL\tFREQ\tHUFFMAN CODE");
        printCodes(tree, new StringBuffer());
    }
}

