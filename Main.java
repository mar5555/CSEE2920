import java.util.Arrays;

public class Main {

    /**
        Hash = digital signature
        Each block will have:
            List of transactions
            Previous Hash
            Hash
     */

    public static void main(String[] args) {

        //recording number of data sets saved into folder "TEST"
        
        
        
        String[] genesisTransactions = {"First Data Set is saved to specified folder TEST"};
        
        //this block starts at zero therefore there is no previous address
        Block genesisBlock = new Block(0, genesisTransactions); 

        String[] block2Transactions = {"Last Data Set saved into folder TEST"};
        //this block uses the previous hash
        Block block2 = new Block(genesisBlock.getBlockHash(), block2Transactions);

        String[] block3Transactions = {"New Data Set saved into folder TEST"};
        Block block3 = new Block(block2.getBlockHash(), block3Transactions);

        
        System.out.println("Hash of genesis block:");
        System.out.println(genesisBlock.getBlockHash());

        System.out.println("Hash of block 2:");
        System.out.println(block2.getBlockHash());

        System.out.println("Hash of block 3:");
        System.out.println(block3.getBlockHash());

    }


}
