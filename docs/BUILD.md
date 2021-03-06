Build
=====

## Dependencies

This modules is dependent on 
 
 `
    sdk-syllabifier    ->    (Syllabifier module)
 `
 
 Please make sure all the dependencies are built first.

## Including in your project with Gradle

`sdk-ngram` module of `silpa-android-sdk` is pushed to Maven Central as a AAR, so you just need to add the following dependency to your `build.gradle`.

    dependencies {        
        compile 'org.silpa:sdk-ngram:1.0.0@aar'       
    }

## Including in your project with Maven

If you use maven to build your Android project you can simply add a dependency for this library.

    <dependency>
      <groupId>org.silpa</groupId>
      <artifactId>sdk-ngram</artifactId>
      <version>1.0.0</version>
      <type>aar</type>
    </dependency>


## Referencing this module in Android Studio

- clone a copy of this repository, or download it  
    `https://github.com/Project-SILPA/sdk-ngram`
    
- Select File -> New Module -> Import existing project -> set path to the cloned/downloaded repository

- Add the following to `settings.gradle` if not automatically included. Example :  
    `include ':MyApp', ':sdk-ngram'`
    
- Add the following to dependencies in `build.gradle` of the project to which you want to reference this module
   
```   
    dependencies {
        compile project(':sdk-ngram')
    }
```


## Referencing this module in Eclipse

- Clone a copy of this repository, or download it (outside eclipse workspace)

- Import the code in your workspace.
    - Click New
    - Android
    - Android Project from existing code
    - Browse to be location of downloaded/cloned project.
    - Under `New Project Name` , rename to `sdk-ngram` or `silpa-ngram` or as you wish instead of "main".
    - Finish
 
- Build project 
    - Mark java(*) folder as source (click on folder -> Build-Path -> use as source folder). You can also remove the src folder, from the project.
    - Mark project as Android Library (Properties -> Android -> Is library -> Apply). The library targets SDK 19 and works with minSdk 9.
    - Clean and build		

- Now add library to any project
    - Project -> Properties -> Android -> Add
    - Select the project
    - Apply
    - Clean
