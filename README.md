# CGPA-GPACalc
CGPA and GPA for university calculator, written in Java implementing GUI.

# What is this project?
This project was created for one of my `[redacted]` assignments, and since it is declassified, I will release the source code here. Hope it will help you for your Java Assignment.

# How this project was built?
This project was built using Netbeans, written with Java together with GUI from Java's Swing and AWT class.

# What are inside this project?
There are 2 parts :
- CLI_project : written without GUI (basically the framework before transitioning to GUI)
- GUI_project : the complete project with GUI.

# What this app looks like?
- Main menu
  - Users are asked to input their program name and total no. of semesters
  ![image](https://user-images.githubusercontent.com/91692409/204714791-60473f84-85df-4eac-b724-7ccb48f3171b.png)

- Subject menu
  - Users are asked to input their subjects' details per sem.
  - GPA and total credit hours for the sem is updated on each input of subjects.
  ![image](https://user-images.githubusercontent.com/91692409/204714982-8f0baa78-a384-4476-a8e4-2c36849da78a.png)

  - A confirmation message is displayed when users successfully add a new subject
  ![image](https://user-images.githubusercontent.com/91692409/204715625-b9443a37-3080-4267-94e9-ca34120f01ac.png)

  - A warning message is shown when removing subject and clearing subject table (remove subject works as stack; LIFO).
  ![image](https://user-images.githubusercontent.com/91692409/204715975-6c9421c1-f4a3-4e30-9569-7d5bdb77c966.png)
  ![image](https://user-images.githubusercontent.com/91692409/204716036-2399e994-7978-4a83-afbf-3345038c9b33.png)

  - A confirmation message is shown when user want to move to next sem's details.
  ![image](https://user-images.githubusercontent.com/91692409/204716133-02956ee8-8ed8-4af1-8f78-5d06611ca8c3.png)

  - Input validation and Exception Handling are implemented throughout all possible inputs.
  - (not all warning message are shown here, just examples of few)
  ![image](https://user-images.githubusercontent.com/91692409/204716780-e9cce1bb-f673-4ded-805e-a5337e91fe91.png)
  ![image](https://user-images.githubusercontent.com/91692409/204716809-19b2a24c-a0f3-4db2-86fd-3fdce9ec9158.png)
  ![image](https://user-images.githubusercontent.com/91692409/204715489-2bdb8463-2dcd-4c90-b5a0-703ef2c306e4.png)
  ![image](https://user-images.githubusercontent.com/91692409/204715526-9cea7c5e-044f-48b3-86fb-f916632b3ff2.png)
  ![image](https://user-images.githubusercontent.com/91692409/204715561-3fb8abfb-7a49-42fa-b206-3141d33bbbea.png)

- CGPA and GPA menu
  - GPA for all sems are displayed in a table.
  - CGPA and total credit hours for the program are displayed too.
  ![image](https://user-images.githubusercontent.com/91692409/204716634-7414e08a-a28b-4436-9937-9d2742f736cd.png)

# References
To help you more to understanding the basics of Java's GUI.
- https://www.youtube.com/watch?v=Kmgo00avvEw (Java GUI basics using Swing).
- (basically the entire "An Introduction to Object-Oriented Programming with Java" by C. Thomas Wu , 5th edition).

# LICENSE
License of this project are in LICENSE file, using GPL v3.0.
