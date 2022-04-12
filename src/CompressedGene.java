import java.util.BitSet;
import java.util.Locale;

public class CompressedGene {
    private BitSet bitSet;
    private int length;

    public CompressedGene (String gene){
        compress(gene);
    }

    private void compress(String gene){
        length = gene.length();
        //reserve enough capacity for all of the bits
        bitSet = new BitSet(length *2);
        //convert to uppercase
        final String upperGene = gene.toUpperCase();
        //convert String to bit representation
        for (int i=0;i<length;i++){
            final int firstLocation = 2 * i;
            final int secondLocation = 2 * i + 1;
            switch (upperGene.charAt(i)){
                case 'A'://00 are next two bits
                    bitSet.set(firstLocation, false);
                    bitSet.set(secondLocation, false);
                    break;
                case 'C': //01 are next two bits
                    bitSet.set(firstLocation, false);
                    bitSet.set(secondLocation, true);
                    break;
                case 'G': //10 are next two bits
                    bitSet.set(firstLocation,true);
                    bitSet.set(secondLocation,false);
                    break;
                case 'T': //11 are next two bits
                    bitSet.set(firstLocation,true);
                    bitSet.set(secondLocation,true);
                    break;
                default:
                    throw new IllegalArgumentException("The provided gene String contains the characters other than ACGT");
            }
        }
    }

    public String decompress(){
        if(bitSet == null){
            return "";
        }
        //create a mutable place for characters with the right capacity
        StringBuilder builder = new StringBuilder(length);
        for(int i=0;i< (length *2); i+=2){
            final int firstBit = (bitSet.get(i) ? 1 : 0);
            final int secondBit = (bitSet.get(i+1) ? 1 : 0 );
        }

    }

}
