package org.silpa.ngram;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;

import org.silpa.render.IndicEditText;

import java.util.List;

/**
 * Created by sujith on 23/7/14.
 */
public class NgramEditText extends IndicEditText implements NgramInterface {

    /**
     * Ngram object
     */
    private Ngram ngram;

    /**
     * Ngram type ->
     * Ngram.NGRAM_TYPE_WORD - words
     * Ngram.NGRAM_TYPE_SYLLABLE - syllables
     * Ngram.NGRAM_TYPE_LETTER - letter
     */
    private int mNgramType;

    /**
     * Ngram n - value
     */
    private int mNgramNValue;

    /**
     * Default ngram type - word
     */
    private static final int DEFAULT_NGRAM_TYPE = Ngram.NGRAM_TYPE_WORD;

    // LOG TAG
    private static final String LOG_TAG = "Ngram edit text";

    public NgramEditText(Context context) {
        super(context);
        init(null, 0);
    }

    public NgramEditText(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(attrs, 0);
    }

    public NgramEditText(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(attrs, defStyle);
    }

    private void init(AttributeSet attrs, int defStyle) {
        this.ngram = new Ngram();
        initAttrs(attrs, defStyle);
    }

    private void initAttrs(AttributeSet attrs, int defStyle) {
        TypedArray a = getContext().getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.NgramEditText,
                defStyle, defStyle
        );

        try {

            this.mNgramNValue = a.getInteger(R.styleable.NgramEditText_ngramNValue, -1);
            this.mNgramType = a.getInteger(R.styleable.NgramEditText_ngramType,
                    NgramEditText.DEFAULT_NGRAM_TYPE);
        } catch (Exception e) {
            Log.e(LOG_TAG, "Error : " + e.getMessage());
        } finally {
            a.recycle();
        }
    }


    /**
     * This function returns list of ngrams defined by ngram type
     *
     * @return list of string
     */
    @Override
    public List<String> getNgram() {
        String str = getText().toString();
        if (this.mNgramNValue != -1) {
            switch (this.mNgramType) {
                case Ngram.NGRAM_TYPE_WORD:
                    return this.ngram.wordNgram(str, this.mNgramNValue);

                case Ngram.NGRAM_TYPE_SYLLABLE:
                    return this.ngram.syllableNgram(str, this.mNgramNValue);

                case Ngram.NGRAM_TYPE_LETTER:
                    return this.ngram.letterNgram(str, this.mNgramNValue);

                default:
                    return null;
            }
        } else {
            switch (this.mNgramType) {
                case Ngram.NGRAM_TYPE_WORD:
                    return this.ngram.wordNgram(str);

                case Ngram.NGRAM_TYPE_SYLLABLE:
                    return this.ngram.syllableNgram(str);

                case Ngram.NGRAM_TYPE_LETTER:
                    return this.ngram.letterNgram(str);

                default:
                    return null;
            }
        }
    }

    /**
     * This function is used to set ngram type
     *
     * @param ngramType Ngram.NGRAM_TYPE_WORD - words
     *                  Ngram.NGRAM_TYPE_SYLLABLE - syllables
     *                  Ngram.NGRAM_TYPE_LETTER - letter
     */
    @Override
    public void setNgramType(int ngramType) {
        this.mNgramType = ngramType;
    }

    /**
     * This function is used to get ngram type used
     *
     * @return Ngram.NGRAM_TYPE_WORD
     * Ngram.NGRAM_TYPE_SYLLABLE
     * Ngram.NGRAM_TYPE_LETTER
     */
    @Override
    public int getNgramType() {
        return this.mNgramType;
    }

    /**
     * This function is used to set n value for ngram
     *
     * @param nValue integer
     */
    @Override
    public void setNgramNValue(int nValue) {
        this.mNgramNValue = nValue;
    }

    /**
     * This function is used to get n value used for ngram
     *
     * @return integer
     */
    @Override
    public int getNgramNValue() {
        return this.mNgramNValue;
    }

    /**
     * This function gives name of the module
     *
     * @return name of module
     */
    @Override
    public String getModuleName() {
        return this.ngram.getModuleName();
    }

    /**
     * This function gives a brief description of the module
     *
     * @return brief information regarding the module
     */
    @Override
    public String getModuleInformation() {
        return this.ngram.getModuleInformation();
    }
}
