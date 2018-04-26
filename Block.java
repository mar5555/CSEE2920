import java.lang.reflect.Array;
import java.util.Arrays;

/** 
 *
 * 
 * We used code originally created by ivanliljeqvist on 2017-08-31.
 */
public class Block {

    private int previousHash;
    private String[] transactions;

    private int blockHash;

    //Constructor to create a new Block
    public Block(int previousHash, String[] transactions) {
    	//setting values to the parameters
        this.previousHash = previousHash;
        this.transactions = transactions;

        //array to include all data
        Object[] contens = {Arrays.hashCode(transactions), previousHash};
        this.blockHash = Arrays.hashCode(contens);

    }
//this method cannot be used on the genesis block
    public int getPreviousHash() {
        return previousHash;
    }

    public String[] getTransaction() {
        return transactions;
    }

    public int getBlockHash() {
        return blockHash;
    }
}
