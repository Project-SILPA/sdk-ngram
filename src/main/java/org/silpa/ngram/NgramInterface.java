package org.silpa.ngram;

import java.util.List;

/**
 * Created by sujith on 23/7/14.
 */
public interface NgramInterface {

    /**
     * This function returns list of ngrams defined by ngram type
     *
     * @return list of string
     */
    public List<String> getNgram();

    /**
     * This function is used to set ngram type
     *
     * @param ngramType Ngram.NGRAM_TYPE_WORD - words
     *                  Ngram.NGRAM_TYPE_SYLLABLE - syllables
     *                  Ngram.NGRAM_TYPE_LETTER - letter
     */
    public void setNgramType(int ngramType);

    /**
     * This function is used to get ngram type used
     *
     * @return Ngram.NGRAM_TYPE_WORD
     * Ngram.NGRAM_TYPE_SYLLABLE
     * Ngram.NGRAM_TYPE_LETTER
     */
    public int getNgramType();

    /**
     * This function is used to set n value for ngram
     *
     * @param nValue integer
     */
    public void setNgramNValue(int nValue);

    /**
     * This function is used to get n value used for ngram
     *
     * @return integer
     */
    public int getNgramNValue();

    /**
     * This function gives name of the module
     *
     * @return name of module
     */
    public String getModuleName();

    /**
     * This function gives a brief description of the module
     *
     * @return brief information regarding the module
     */
    public String getModuleInformation();
}
