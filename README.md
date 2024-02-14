This is a Kotlin Multiplatform project targeting Android, iOS.



![Simulator Screenshot - iPhone 15 - 2024-02-14 at 20 41 41](https://github.com/omeryildirim01/CoinComposeum/assets/17796968/134e35ab-45e1-4de0-bb54-396622762312)
![Screenshot_20240214_203727](https://github.com/omeryildirim01/CoinComposeum/assets/17796968/e19553c9-6a27-4304-bc52-d93fbdcba296)


* `/composeApp` is for code that will be shared across your Compose Multiplatform applications.
  It contains several subfolders:
  - `commonMain` is for code that’s common for all targets.
  - Other folders are for Kotlin code that will be compiled for only the platform indicated in the folder name.
    For example, if you want to use Apple’s CoreCrypto for the iOS part of your Kotlin app,
    `iosMain` would be the right folder for such calls.

* `/iosApp` contains iOS applications. Even if you’re sharing your UI with Compose Multiplatform, 
  you need this entry point for your iOS app. This is also where you should add SwiftUI code for your project.


Learn more about [Kotlin Multiplatform](https://www.jetbrains.com/help/kotlin-multiplatform-dev/get-started.html)…
