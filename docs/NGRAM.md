Usage
=====

### Note :
This module is still under development and this document presently shows only currently available utilities.

This module is dependent on Syllabifier module so please add project `https://github.com/Project-SILPA/sdk-syllabifier`
to the dependencies. 

#### Get syllable n-grams
```
        Ngram ngram = new Ngram();
        List<String> lst1 = ngram.syllableNgram("catterpillar");  // N - default -> 2
        List<String> lst2 = ngram.syllableNgram("catterpillar", 4);

```
The above function `ngram.syllableNgram` returns a list `List<String>` of syallble n-grams of given text.

#### Get letter n-grams
```
        Ngram ngram = new Ngram();
        List<String> lst1 = ngram.letterNgram("catterpillar");  // N - default -> 2
        List<String> lst2 = ngram.letterNgram("catterpillar", 3);

```
The above function `letterNgram` returns a list `List<String>` of letter n-grams of given word.

#### Get word n-grams
```
        Ngram ngram = new Ngram();
        List<String> lst1 = ngram.wordNgram("The quick brown fox jumped over the lazy dog"); // N - default -> 2
        List<String> lst2 = ngram.wordNgram("The quick brown fox jumped over the lazy dog", 4);

```
The above function `` returns a list `List<String>` of word n-grams of given text.

#### Constants
```
        public static final int NGRAM_TYPE_WORD = 0;          // for ngram type word
        public static final int NGRAM_TYPE_SYLLABLE = 1;      // for ngram type syllable
        public static final int NGRAM_TYPE_LETTER = 2;        // for ngram type letter

```

#### Ngram EditText
```
        <org.silpa.ngram.NgramEditText
            android:id="@+id/edtNgram"
            android:layout_width="fill_parent"
            android:layout_height="wrap_content"
            ngram:ngramType="syllable"
            ngram:ngramNValue="3" />

```

#### Ngram TextView
```
        <org.silpa.ngram.NgramTextView
            android:id="@+id/tvNgram"
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            ngram:ngramType="letter"
            ngram:ngramNValue="4" />

```

#### Common specification for NgramEditText and NgramTextView

##### Fields :

`ngramNValue` accepts integer and is used to specifiy N value for ngram with default value `2`.

`ngramType` specifies the type of ngram. Accepted values are :

```
        word
        letter
        syllable
```

if not explicitly specified default value : `word`


##### Functions :

`public List<String> getNgram();`  - This function returns list of ngrams defined by ngram type

`public void setNgramType(int ngramType);` - This function used to set ngram type

`public int getNgramType();` - This function used to get ngram type used

`public void setNgramNValue(int nValue);` - This function used to set n value for ngram

`public int getNgramNValue();` - This function used to get n value used for ngram
   
`public String getModuleName();` - This function gives name of the module
   
`public String getModuleInformation();` - This function gives a brief description of the module
            

#### Get module name and information
```
Ngram ngram = new Ngram();
String moduleName = obj.getModuleName();
String moduleInforamtion =  obj.getModuleInformation();
```

#### To run tests
Tests present at `/src/test/java/`

  - Select test to run
  - Right Click -> Run Test -> Run as Android Test

