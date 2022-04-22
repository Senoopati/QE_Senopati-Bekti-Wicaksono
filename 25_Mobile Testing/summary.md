# Section 25 Mobile Testing

<br>

Dalam materi ini mempelajari :

1. Appium
2. Appium Server
3. Connecting the devices

## Appium

- Appium is mobile automation frameworks to run mobile automation test. (Appium adalah kerangka kerja otomatisasi seluler untuk menjalankan uji otomatisasi seluler.)
- Appium supports many programming language such as java, python, javascript, ruby, etc.(Appium mendukung banyak bahasa pemrograman seperti java, python, javascript, ruby, dll)
- Appium library is created in top of selenium library.(Pustaka Appium dibuat di atas pustaka Selenium.)
- It supports Android, iOS, and Windows apps.(Ini mendukung aplikasi Android, iOS, dan Windows.)

## Appium Server terdiri dari :

1. XCUITest
2. UIAutomator / Expreso
3. WinAppDriver

## Appium Components

- In Appium, there two major components that we use:

1. Appium Server. Appium Server used as a bridge to control the testing devices. There are two version, we can use either appium desktop or install appium command using npm. (Server Appium. Appium Server digunakan sebagai jembatan untuk mengontrol perangkat pengujian. Ada dua versi, kita dapat menggunakan desktop appium atau menginstal perintah appium menggunakan npm.)
2. Appium Client. The library written in several languages to create test script command to the appium server.(Klien Appium. Pustaka ditulis dalam beberapa bahasa untuk membuat perintah skrip pengujian ke server appium.)

## Prerequisites

- To Set Up Appium on your local computer, you need to install several tools / library:

1. Java JDK 8/11. You require to set the JAVA HOME environment variables also
2. Install Android SDK Platform-Tools & Command-line tools, this can be easily done by installing Android Studio. You require to set the ANDROID_HOME environment variables also.
3. Appium Desktop Used for inspecting the element locator and running the automation test on local computer.
4. Node 15 (For installing appium command using npm).
5. appium doctor. This one is OPTIONAL, but this can help you to identify missing prerequisites

## Appium Doctor

- This tools are very helpful to check the installation of the appium, You can check the installation completeness of necessary and optional dependencies for appium. (Alat ini sangat membantu untuk memeriksa instalasi appium, Anda dapat memeriksa kelengkapan instalasi dari dependensi yang diperlukan dan opsional untuk appium.)

## Connecting the devices

- Before you start, you need either emulator or real devices connected to your local computer. (Sebelum memulai, Anda memerlukan emulator atau perangkat nyata yang terhubung ke komputer lokal Anda.)
- For real device, you might need to install the device drivers (vary depends on brands) and enable usb debugging. It can be done by enabling the developer mode see:(Untuk perangkat nyata, Anda mungkin perlu menginstal driver perangkat (bervariasi tergantung merek) dan mengaktifkan debugging usb. Itu dapat dilakukan dengan mengaktifkan mode pengembang lihat:)
  https://developer.android.com/studio/debug/dev-options
- For emulator, you can use android studio and create a new one.

## Checking the Connected Devices

- After you setup the devices, you can check the devices already connected or not by using command adb devices on your terminal/command prompt.(Setelah Anda mengatur perangkat, Anda dapat memeriksa perangkat yang sudah terhubung atau belum dengan menggunakan perintah adb devices di terminal/command prompt Anda)

1. emulator-5554 is UDID
2. device is device name.

## Running Appium Desktop

- Appium desktop need to run to enable the appium server.(Desktop Appium perlu dijalankan untuk mengaktifkan server appium.)
- After open the appium desktop, just click start server button to start the appium server.(Setelah membuka desktop appium, cukup klik tombol start server untuk memulai server appium.)

## Using Appium Inspector

- Appium desktop, has capability to inspect an element locator.(Desktop Appium, memiliki kemampuan untuk memeriksa pencari elemen.)
- Just click the button with icon magnify.(Cukup klik tombol dengan ikon perbesar.)

## Desired Capabilities

- After you click the start inspector session, you need to input the desired capabilities.(Setelah Anda mengklik sesi inspektur mulai, Anda perlu memasukkan kemampuan yang diinginkan.)
- Desired Capabilities is used to tell the appium what kind of capability that you want to use (running Android, iOS, or Windows app).(Kemampuan yang Diinginkan digunakan untuk memberi tahu appium jenis kemampuan apa yang ingin Anda gunakan (menjalankan aplikasi Android, iOS, atau Windows))
- Documentation https://appium.io/docs/en/writing-running-appium/caps/

## Filing the Capabilities

- After you filing the capabilities, you can save the capabilities for later use.(Setelah Anda mengajukan kemampuan, Anda dapat menyimpan kemampuan untuk digunakan nanti)
- After save, you can start the inspector session by clicking the Start Session button.(Setelah menyimpan, Anda dapat memulai sesi inspektur dengan mengklik tombol Mulai Sesi)

## Appium Inspector

- Appium inspector used to find the element locator (eg input, label. buttons).(Appium inspector digunakan untuk menemukan elemen locator (mis. input, label. tombol).)
- This session will terminate if you running the automation test.(Sesi ini akan berakhir jika Anda menjalankan tes otomatisasi)

## Appium Locators

1. Appium Locators is used to locate the elements (button, text field, radio button, etc).(Appium Locators digunakan untuk menemukan elemen (tombol, bidang teks, tombol radio, dll).)
2. In appium we can used 7 locators:

- Class Name
- Xpath
- Accessibility ID
- Android Ul Automator
- Android View Tag (Espresso Only)
- iOS UI Automation

3. The most used locators are 10. Accessibility ID, and Xpoth.
4. See https://www.browserstockerauale/locutonin-appium

## Appium Locators Quiz

1. Try to login on simple app using username/password: admin/admin
2. Try to find locator for the Calculator Page

- Hamburger Button
- Page Title
- Input Angka 1
- Input Angka 2 Dropdown operator.
- Button Equal
- Label Hasil

## Using Maven Archetype

- Maven archetype used to generate basic project with all the dependencies and basic structure. (Pola dasar Maven digunakan untuk menghasilkan proyek dasar dengan semua dependensi dan struktur dasar.)
- Serenity has archetype library so you can generate the sample project either using command line or using IDE (Intellij IDEA).(Serenity memiliki pustaka pola dasar sehingga Anda dapat menghasilkan proyek sampel baik menggunakan baris perintah atau menggunakan IDE (Intellij IDEA).)
- https://mynrepository.com/artifact/net.serenity-bdd/serenity-cucumber-arch etype/2.3.2

## Cucumber Frameworks

- Cucumber BDD is a frameworks that supports for creating behavior - driven development (BDD) Automation Tests.(Mentimun BDD adalah kerangka kerja yang mendukung untuk membuat Tes Otomasi Pengembangan Berbasis Perilaku (BDD))
- Using Gherkin Syntax.(Menggunakan Sintaks Gherkin.)
- Supports for different programming language: Java, Ruby. Javascript. Python, etc(Mendukung untuk bahasa pemrograman yang berbeda: Java, Ruby. Javascript. Python, dll)
- Has great features and support with the Intellij IDEA IDE(Memiliki fitur dan dukungan hebat dengan Intellij IDEA IDE)
- You can visit https://cucumber.io/ for the documentation
- Cucumber Frameworks
- On serenity, the dependency is already added so you don't have to add the cucumber dependency

## Adding Feature Files

1. Features files is used for defining the test cases for a specific feature using gherkin syntax(File fitur digunakan untuk mendefinisikan kasus uji untuk fitur tertentu menggunakan sintaks gherkin)

- Create "features" folder under src/test/resources folder.
- Create new file inside features folder with name Login feature.
- Write the features file.

## Mapping Every Scenario Steps on Steps Class

1. We need to map every step on a single functions inside Steps Definition Class.(Kita perlu memetakan setiap langkah pada satu fungsi di dalam Kelas Definisi Langkah.)
2. You can make one steps definition class for one page object class.(Anda dapat membuat kelas definisi satu langkah untuk kelas objek satu halaman.)

- Create new package with name "steps" inside src/test package.
- Use Intellij IDEA to generate new step class. Intellij IDEA Has Plugin to support cucumber library to automatically generates the class.(Gunakan Intellij IDEA untuk menghasilkan kelas langkah baru. Intellij IDEA Memiliki Plugin untuk mendukung perpustakaan mentimun untuk secara otomatis menghasilkan kelas.)

## Initializing the Appium

- We need a class to start and stop the appium session and save the driver session.(Kami membutuhkan kelas untuk memulai dan menghentikan sesi appium dan menyimpan sesi driver.)
- We need to integrate it with the cucumber hooks to make sure before each scenario starts, it will create the appium session first and destroy it if the scenario already completed.(Kita perlu mengintegrasikannya dengan kait mentimun untuk memastikan sebelum setiap skenario dimulai, itu akan membuat sesi appium terlebih dahulu dan menghancurkannya jika skenario sudah selesai)
- Let's call the class with AndroidDriverinit(Mari kita panggil kelas dengan AndroidDriverinit)

## Adding Desired Capabilities

1. You need to set the Desired Capabilities to tell the appium which feature that you want to used (eg, running android app or ios app, which apk file we should install)(Anda perlu mengatur Kemampuan yang Diinginkan untuk memberi tahu appium fitur mana yang ingin Anda gunakan (misalnya, menjalankan aplikasi android atau aplikasi ios, file apk mana yang harus kita instal))
2. You can find the full list here.
3. The steps:

- Initialize the Desired Capabilities object and set the desired capabilities(Inisialisasi objek Kemampuan yang Diinginkan dan atur kemampuan yang diinginkan)

## Cucumber Hooks

- Hooks are blocks of code that can run at various points in the Cucumber execution cycle.(Kait adalah blok kode yang dapat dijalankan di berbagai titik dalam siklus eksekusi Mentimun)
- They are typically used for setup and teardown of the environment before and after each scenario.(Mereka biasanya digunakan untuk pengaturan dan penghancuran lingkungan sebelum dan sesudah setiap skenario)
- We can use @Before hooks to run the code before the scenario run or @After hooks to run the code after the scenario run.(Kita dapat menggunakan kait @Before untuk menjalankan kode sebelum skenario dijalankan atau kait @After untuk menjalankan kode setelah skenario dijalankan)

1. Create new package with name "hooks" inside src/test package.
2. Create Class AndroidDriverHook.java.
3. Add two method/function for before and after hooks.
4. Add @Before and @After annotation above method declaration

## Page Object Design Pattern

- Represents a web page as a single Java class file.(Mewakili halaman web sebagai file kelas Java tunggal.)
- It will consist of all of the actions that can be done on a single web page.(Ini akan terdiri dari semua tindakan yang dapat dilakukan pada satu halaman web.)
- It used to reduce the code duplication.(Digunakan untuk mengurangi duplikasi kode.)
- It helps the test code is more readable and easy to understand(Ini membantu kode pengujian lebih mudah dibaca dan dipahami)

## The By Object and findElement() function

- MobileBy is an object to store locators. Use the static method to store the data based on the locator type.(MobileBy adalah objek untuk menyimpan pencari. Gunakan metode statis untuk menyimpan data berdasarkan jenis locator.)

Example :

By locator MobileBy.id("email");

- findElement() function is used for finding an element. It accept one parameter with MobileBy data type.
- It returns Android Element data type.
- Note find Element is mandatory to use before performing an action (click type. select, etc).

Example :

By locator - By.id("email");

AndroidElement label PositionName driver.find ement (locator);

## The sendKeys () and clear () function

- sendKeys() is a function inside AndroidElement object to simulate typing actions.(sendKeys() adalah fungsi di dalam objek AndroidElement untuk mensimulasikan tindakan pengetikan.)
- It accept one parameter with Charsequence data type (you can also input a String on it)
- You can combine with clear() function to clear the data first on text field before you input it if the element input data already prefilled.(Anda dapat menggabungkan dengan fungsi clear() untuk menghapus data terlebih dahulu pada bidang teks sebelum Anda memasukkannya jika data input elemen sudah diisi sebelumnya
  )

## The click () function

- click() is a function inside Android Element object to simulate click actions.

Example :

AndroidElement btnLogin - driver.findElement (MobileBy.id("login"));

inputEmail.click();

## Cucumber Tags

1. Tags are a great way to organise your features and scenarios.
2. They can be used for two purposes:

- Running a subset of scenarios
- Restricting hooks to a subset of scenarios.

3. You can put togs on above Feature or Scenario keyword on feature file
4. Tags on Feature keyword will inherit to all the scenario inside the feature file • Tags on Scenario keyword only applies on single scenario.
5. You can use and, or, not to combine the tags

- @login and @smoke
- @login or registration
- @login and not @wip
- (@login and not @wip) or registration

## The WebdriverWait Object

- WebdriverWait object used for set the wait until the element meets the condition, Ex wait until the element visible, wait until the element disappear, etc.(Objek WebdriverWait digunakan untuk mengatur waktu tunggu hingga elemen memenuhi kondisi, Contoh menunggu hingga elemen terlihat, menunggu hingga elemen menghilang, dll)
- It is part of Explicit wait it will applies for the specific AndroidElement only) The constructor itself has 3 parameter

1. Ist parameter for the AndroidDriver Object
2. 2nd parameter for the timeout (maximum time we wait for the element meets the condition)
3. 3rd parameter for the polling time icheck every x millis)

- Expected Conditions objects stores list of the condition that supported by appium

## The BasePageObject class

- BasePageObject class is to aim for wraps all the appium function to help us writing less code in page class.
- We can use inheritance. So every page class must extends the BasePageObject class
- This is just an approach, so if you found any better approach it is ok to use it.

## The TouchAction class

- The TouchAction object is used for performing complex actions (scroll, tap and hold. etc).
- It is using builder design pattern so it is use method chaining and you can combine it to perform specific action.

## The TakesScreenshot Interface

- AndroidDriver closs are implementing the TakesScreenshot interface(Penutupan AndroidDriver mengimplementasikan antarmuka TakesScreenshot)
- TakesScreenshot interface is used to performing screenshot to the screen(Antarmuka TakesScreenshot digunakan untuk melakukan tangkapan layar ke layar)
- This applicable with Web automation also
- You can use the interface reference to access the methods for taking screenshot(Anda dapat menggunakan referensi antarmuka untuk mengakses metode pengambilan tangkapan layar)
- You can put it on hooks close so whenever the scenario is failing, opplum will take screenshot

## Configuration File

- It is a bad practice storing the configuration inside the code implementation.(Menyimpan konfigurasi di dalam implementasi kode adalah praktik yang buruk.)
- Currently, our code put the configuration (e.g. Appium url, capabilities,etc) inside(Saat ini, kode kami menempatkan konfigurasi (misalnya url Appium, kemampuan, dll) di dalam)
- So we need to put the configuration outside (on properties file)(Jadi kita perlu meletakkan konfigurasi di luar (pada file properti))
- Whenever you had a configuration change, you don't have to refactor your automation code, we just need to update the value on configuration file.(Setiap kali Anda memiliki perubahan konfigurasi, Anda tidak perlu memfaktorkan ulang kode otomatisasi Anda, kami hanya perlu memperbarui nilai pada file konfigurasi.)

## SnakeYAML Library

- SnakeYAML is library to serialize JavaObject to YAML file or vice versa.(SnakeYAML adalah library untuk membuat serialisasi JavaObject ke file YAML atau sebaliknya)
- We can use this library to read the configuration from YAML file.(Kita bisa menggunakan library ini untuk membaca konfigurasi dari file YAML.)
- You just need to add the dependencies to the pom.xml file.
- https://mvnrepository.com/artifact/org.yaml/snakeyaml/1.29

## Task
