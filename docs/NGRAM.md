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

