# BearCat_Learning
Application  Name : <b> Bearcat-Learning </b>  <br>

Information of Team Members(Team05): 
1. Joyce Meyer Lingam (s560726)  <br>
2. Manasa Akula (s560998) <br>
3. Anirudh Gunde (s560220)  <br>
4. Nishanth Raju Saraswathi (s559217) <br>
 
Application Information:   <br>
The Application has two kinds of logins. <br>
1. Student Login 2. Admin Login. <br>

Login Credentails for Student Access: <br>
 1. UserName: manasaakula970@gmail.com  <br>
     Password: manasa    <br>
 2. UserName:  nishanthraju2001@gmail.com<br>
     Password:  nishanth<br>
 3. UserName:  anirudh.gunde1@gmail.com<br>
     Password:  123456<br>
 4. UserName:   Joycemeyerlingam03@gmail.com<br>
     Password: Joyce@123456  <br>
     
Login Credentials for Admin Access: <br>

  UserName: Professor <br>
  Password: 123456  <br>

Firebase database link which is used as storage for our application: <br>
https://console.firebase.google.com/u/0/project/bearcatlearning/overview  <br>

APK file Link: <br> [apkdebug.apk]([BearCat_Learning\BearCatLearning\app\build\outputs\apk\debug](https://github.com/Anirudh-Gunde/BearCat_Learning/blob/main/app-debug.apk)

Supported devices: <br> All the android devices with latest versions

<b>Sequence Information:</b> <br>
This application has two types of logins( Admin, Student). <br>
<b>Admin Flow:</b> <br>
After logged in admin can able to see the list of courses, can choose the course for the content modification like uploading files/videos of partiular subject which are stored in the firebase database. <br>
<b>Student Flow:</b>  <br>
After logged in student can able to see the list of courses, can choose the course for the conent view contents like files/videos. <br>
This application wil helps the students to access the course materials whenever they wanted to even if they finished the course. <br>

<b>Contribution of individual team members:</b><br>

<b>Nishanth Raju :</b> <br>
Dashboard (Student View): <br>
<b>Purpose:</b> Display a personalized dashboard for students where they can see a list of their enrolled courses and access course materials. <br>
<b>Data: </b>Student profile, enrolled courses. <br>
<b>Dashboard.xml </b><br>
Student dashboard Layout: Created the student dashboard layout where after student has been logged in this layout will be appeared and it <br> has the one text view and six image buttons each image button represents one singe course. After user clicking on the course it will be directed to next layout. <br>
Course List Layout : Created course list layout for the specific course and added the text views and view file button and view video button.<br>
Created java files for the layouts and added the fuctionality for the files.<br>
Added the animation for the app when the app is opened.<br>

<b>Manasa Akula :</b> <br>

<b>Dashboard (Professor View/Admin): </b> <br>
<b>Purpose:</b> Display a personalized dashboard for admins where they can see a list of courses to make the content modification like uploading files/videos. <br>
<b>Data:</b> Admin profile, Courses List, Material uploads file/videos. <br>
<b>admin_dashboard.xml</b> <br>
Created a Admin Dashboard layout where after the admin has been logged into the application this layout will be appeared. In this layout user can see his/her username on the top, welcome message, hint a message(select the subject for content modification) and there are few image buttons which represents different subjects. <br>
User/Admin can choose any subject to do content modification(File/Video Upload). At the below there is logout button which will redirect to main login page. <br>
<b>content_modification.xml</b>  <br>
After user(admin) click on any subject this layout will appeared. It has two buttons which are UploadFile, UpoloadVideo. Admin can choose based on his choice. The files/Videos will be stored into firebase database of our project. <br>
Created the required java files(AdminDashboardActivity,ContentModificationActivity,UploadFileActivity,UploadVideoActivity) and layouts(admin_dashboard,content_modification). <br>
Added required  permissions to access the Internet and Storage, Firebase storage dependecies, google-services.json file to the app.

<b>Anirudh Gunde:</b><br>
<b>Login Page</b><br>
<b>Firebase Connection</b><br>
<b>Video Player Layout</b><br>
<b>PDFReader Layout </b> <br>

<b>Login Page Layout (activity_main.xml):</b><br>
Created login page with the logo of the app and a background image with input fields UserId and Password, along with a login button. Implemented logic for retrieving credentials from Firebase authentication for students and added admin logins exclusively for professors in the Java file.<br>

<b>Firebase Connection:</b><br>
Integrated the entire application with Firebase for using authentication with users having email and passwords as their credentials. Utilized Firebase storage for storing all the documents and videos, where admin can upload. Added all the team members into the Firebase project and granted them ownership of the app with all the necessary permissions.<br>

<b>Video Player Layout:</b><br>
Added a VideoView component for playing a video fetched from Firebase, uploaded by the admin.<br>
<b>PDFReader Layout:</b><br>
Added some logic for retrieving documents from Firebase.<br>

<b>Purpose:</b><br>
Having personalized logins for students and professors separately will make the app more flexible and user-friendly.<br>

<b>Data:</b><br>
Course documents and videos, User login details<br>

<b>Joyce MeyerLingam:</b><br>
<b>Colors:</b><br>
<b>Admin Layout:</b><br>
<b>Student Login:</b><br>

<b>Colors.xml:</b><br>
Added colors.xml for additional CSS colors for the application. Included custom colors to enhance the application's visual appeal and maintain a consistent theme. These colors can be referenced and applied throughout the app's layout and styling.<br>

<b>Admin Layouts:</b><br>
Added background images for each layout and applied styling for admin layouts. Enhanced the visual appeal of the admin interface, providing a more engaging and personalized experience. Ensured that styling choices are responsive across various screen sizes and orientations, optimizing the user experience on different devices.<br>

<b>Student Login:</b><br>
Added background images for each layout and applied styling for student login. Incorporated background images designed specifically for the student login screens, creating an immersive and welcoming atmosphere. This makes the login experience visually appealing.<br>
<b>Pdfreader Layout:</b><br>
Added a layout for reading any document.<br>

