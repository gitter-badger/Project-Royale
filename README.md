# Project-Royale
  Project Royale is aimed to create tool's to help your Clash Royale Experience. It helps you get the best out of your time and money while playing the popular game created by SUPERCELL called Clash Royale!
##Features
+ Simple Chest Prediction
*(More info in the* **Wiki**)
+ Advanced Chest Prediction
*(More info in the* **Wiki**)
+ Need help from the **community** for more ideas!
  
##Contributors
ArminKaric - Lead-Programmer

##Manual Installation
  In order to run Project-Royal (P-R) the code must be exported as a runnable jar file (**Note** Main_output(1) for launch configuration!), then copy, paste, and fill in the path in a text editor (Notepad, etc.) 
    ```
    @ECHO OFF
     java -jar "Path/To/The/Jar/Whatever.jar"
    ```
, After this is done, save it as "RUN.bat" with "All Files" selected as the type. Your done, Congrats! 

##API Reference

+ ```
  main_output.main_menu(); 
  ``` - Returns selection menu.
+ ```
  main_output.main_direct();
  ``` - Directs user to previously specified tool (Attachment to main_menu();).
+ ```
  main_output.chstpre();
  ``` - Used to decide if user is to be redirected to basic, or advanced chest prediction.
+ ```
  main_calculations.ifchestskipped();
  ``` - Advanced chest prediction.
+ ```
  main_calculations.chestprediction();
  ``` - Basic chest prediction
+ ```
  global.clear();
  ``` - Clears 75 system.out lines.

##License
  Project Royale is protected under the GNU General Public License (GNU GPLv3). The GNU GPLv3 is a license that requires anyone who distributes my code to make the the source available under the same terms. More infomation in the LICENSE file.

