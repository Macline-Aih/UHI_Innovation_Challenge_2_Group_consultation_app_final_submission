# UHI_Innovation_Challenge_2_Group_consultation_app_final_submission

1. EUA_Android_App Installation Instructions:

a) Start Android Studio and close any open Android Studio projects.

b) From the Android Studio menu click File > New > Import Project.
    => Alternatively, from the Welcome screen, click Import project (Eclipse ADT, Gradle, etc.).
    
c) Select the Eclipse ADT project folder with the AndroidManifest.xml file and click Ok

d) Select the destination folder and click Next.

e) Select the import options and click Finish.

f) The import process prompts you to migrate any library and project dependencies to Android Studio, and add the dependency declarations to the build.gradle file. 
   See Create an Android library for more information about this process.
   The import process also replaces any well-known source libraries, binary libraries, and JAR files that have known Maven coordinates with Maven dependencies,
   so you no longer need to maintain these dependencies manually.The import options also allow you to enter your workspace directory and any actual path maps to 
   handle any unresolved relative paths, path variables, and linked resource references.
   
g) Android Studio imports the app and displays the project import summary. Review the summary for details about the project restructuring and the import process.

After importing the project from Eclipse ADT into Android Studio, each app module folder in Android Studio contains the complete source set for that module, 
including the src/main/ and src/androidTest/ directories, resources, build file, and Android manifest. Before starting app development, you should resolve any
issues shown in the project import summary to make sure the project re-structuring and import process completed properly.
