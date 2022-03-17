# Section 5 **Testing Documentation (Test Scenario - Test Case - dll)**

## Resume

### Test Scenario <br>

> Dokumen langkah-langkah sistematis yang disusun software tester agar sistem dapat berfungsi dengan baik dan memenuhi standar user.

<br>

Tujuan:

- Memudahkan testing
- Dasar pengembangan projek
- Dasar klien menyesuaikan dengan requirement
  <br>

Tools:

- Google spreadsheed
- Testreal
- Test.io
- Dll
  <br>

Kriteria test scenario yang baik:

- Menyusun scenario test sesuai dengan flow requirement
- User bersikap seolah harus melakukan halt sb
- Memberikan rincian spesifik hal-hal yang perlu diketahui user
- Memberikan penjelasan yang jelas dan detail
- User dapat melakukan apapun sesuai requirement
- Scenario satu dengan yang lain harus berkesinambungan
- Memberikan hasil dari scenario, misal “Passed” atau “Failed”
- Penggunaan harus konsisten, misal diawal “Field Email” sampai akhir harus sama
- Jangan berasumsi sendiri, end user mind, harus memastikan kemauan klien
- Think outside the box, menulis semua kemungkinan yang ada
- Mencatat semua perubahan dan memperbaharui versi dokumen
  <br>

Contoh test scenario untuk Login:

- Memeriksa apakah fitur login bekerja dengan baik
- Memeriksa apakah fitur Forgot Email bekerja dengan baik
- Memeriksa apakah fitur Create New Account bekerja dengan baik

### Test Case

> Uji kasus, rangkaian yang dilakukan software tester

<br>

Tujuan:

- Memastikan sistem dapat bekerja dengan baik sesuai requirement serta mampu memberikan respon ketika ada invalid input
  <br>

Komponen:

- Test case id
- Pre-condition
- Steps
- Expected result
- Status
- Actual result
  <br>

Hal-hal yang perlu diperhatikan dalam pembuatan test case:

- Sederhana dan transparan, dengan penjelasan jelas, mudah dipahami dan ringkas
- End-user in mind, berfikir dari sudut pandang pengguna akhir
- Hindari pengulangan kasus uji
- Jangan berasumsi, pengujian harus sesuai dengan dokumen spesifikasi
- Pastikan software tester sudah memeriksa semua fitur sistem dan sudah memenuhi persyaratan dokumen spesifikasi
- Menggunakan tracibility matrix untuk memeriksa bahwa tidak ada fitur yang belum teruji
- Test case id harus bisa diidentifikasi
- Harus menghasilkan hasil yg sama tidak peduli siapa testernya
- Harus bisa ditinjau dengan orang lain
  <br>

Contoh test case untuk test scenario login:

1. Enter valid email and valid password
2. Enter valid email and invalid password
3. Enter invalid email and valid password
4. Enter invalid email and invalid password
   \*test case 2-4 = negative test case (kemungkinan kecil terjadi)

<<<<<<< HEAD
# Task Praktikum

https://docs.google.com/spreadsheets/d/1VmJ4cSQwF0avYyPmy1iihxu-gYkhGe_kC4y40WSOUXU/edit?usp=sharing
=======
# TASK
### LINK TASK
https://docs.google.com/spreadsheets/d/1VmJ4cSQwF0avYyPmy1iihxu-gYkhGe_kC4y40WSOUXU/edit?usp=sharing

>>>>>>> a674fdbf3752adade76b0c871d7429086c7d6f05
