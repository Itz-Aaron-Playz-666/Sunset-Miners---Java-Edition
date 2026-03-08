# Sunset Miners

This is the readme for Sunset Miners, try to keep it up to date with any information future-you will wish past-you
remembered to write down

## Project set up
This is a gradle project using JMonkey Engine and other java libraries

# Modules : 

Game module `:game` : holds `build.gradle` dependencies for the game code & should hold your code.

Desktop module `:desktop` : holds `build.gradle` for desktop dependencies & uses the `:game` module, this module can hold the desktop gui.

Android module `:app` : holds `build.gradle` for the android dependencies & uses the `:game` module, this module can hold android dependent gui.

 PC VR module `:pc-vr` : holds `build.gradle` for the PC VR dependencies & uses the `:game` module. This holds the launcher to launch the game in VR when tethered (either via a cable or wireless) to a PC

 Android VR module `:pc-vr` : holds `build.gradle` for the Android VR dependencies & uses the `:game` module. This holds the launcher to launch the game in VR when running locally on an android device (e.g. the Quest 3)

# Running Game : 

### Desktop : 

```gradle
./gradlew run
```


### Android : 

Install the app on a connected device via adb.

```bash
    $./gradlew :app:installDebug
```
If you are using Android Studio launch and debug options will be available directly within the IDE



# Building Game :

### Desktop :

```bash
    $./gradlew :desktop:copyJars
```


### Android : 
```gradle
    $./gradlew :app:assemble
```

Note that if you are releasing your app on the android play store it must be signed with an appropriate key, see
https://developer.android.com/studio/build/building-cmdline for more details on how to produce such apks



### Distribute with a JRE

Distributing with a JRE means you'll need to provide an operating specific bundle for each OS you are
targeting (which is a disadvantage) but your end use will not have to have a JRE locally installed
(which is an advantage).

Either:

In your IDE execute the gradle task distZip (which you'll find under gradle > distributions > buildAllDistributions)

Or:

In the command line open at the root of this project enter the following command: gradlew buildAllDistributions

Then you will find a series of zip in the build/distributions folder. These zip(s) will contain your game, all the libraries to run it and an
OS specific JRE. (The same files will also be available unzipped in a folder, which may be useful if distributing via steampipe or similar).


References :



=> gradlew for android:
https://developer.android.com/studio/build/building-cmdline

=> Gradle DSL : https://docs.gradle.org/current/dsl/index.html

=> Gradle for java : https://docs.gradle.org/current/userguide/multi_project_builds.html

=> Gradle/Groovy Udacity course by google : https://github.com/udacity/ud867/blob/master/1.11-Exercise-ConfigureFileSystemTasks/solution.gradle


=> See JMonkeyEngine Android Examples : https://github.com/Scrappers-glitch/jme3-Simple-Examples

https://github.com/Scrappers-glitch/DBTraining

https://github.com/Scrappers-glitch/Superior-Extended-Engine/tree/master/demoApp


=> See JMonkeyEngine Desktop Example : https://github.com/Scrappers-glitch/basic-gradle-template

=> See JMonkeyEngine RPI armhf Desktop Example : https://github.com/Scrappers-glitch/JmeCarPhysicsTestRPI



=> See Tamarin Wiki for VR guidance: https://github.com/oneMillionWorlds/Tamarin/wiki

