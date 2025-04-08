# BASH COMMAND PROMPT


## ◻️ 1. `pwd` - Print Working Directory
The `pwd` command displays the current working directory in the terminal.
### Command:
```bash
    najmakhatun@MacBook-Air ~ % pwd
```
#### Output:
```bash
    /Users/najmakhatun
```
<br>
<br>


## ⬜️ 2. `cd` - Current Directory
The `cd` command helps us to navigate different directory present in our file system.
### Command:
```bash
    najmakhatun@Macbook-Air ~ % cd Code
```
In order to go back to the previous directory we use
### command:
```bash
    najmakhatun@Macbook-Air Code % cd ..
```
<br>
<br>

## ⬜️ 3. `ls` - List
The `ls` command display all the files and directory present in that directory.
### Command:
```bash
    najmakhatun@Macbook-Air Code % ls
```
#### Output:
```bash
    BSTVisualizer		DSA-Hub			Django			FlipLearn		HackathonProject	Portfolio		Programming		assignment
    CompetitiveProgramming	DataScience		Exam			HTML			MySql			Practise_Hackathon	Suggestrix		frontend
```
<br>
<br>


## ⬜️ 4. `mkdir` - Make directory
The `mkdir` create a new directory.
### Command:
```bash 
    najmakhatun@Macbook-Air Code % mkdir new_folder
```
#### Output:
```bash
    BSTVisualizer		DataScience		FlipLearn		MySql			Programming		frontend
    CompetitiveProgramming	Django			HTML			Portfolio		Suggestrix		new_folder
    DSA-Hub			Exam			HackathonProject	Practise_Hackathon	assignment
```
You can spote new_folder...
<br>
<br>

## ⬜️ 5. `touch` - Make File
The `touch` create a new File in the given directory
### Command:
```bash
    najmakhatun@Macbook-Air new_folder % touch file.txt file2.txt file3.js
```
#### Output:
```bash
    file.txt	file1.txt	file2.txt	file3.js
```
<br>
<br>


## ⬜️ 6. `cat` - print content of the Files
We can do few interesting things with cat
### ▫️ rewrite the entire content of the file
---
### Command:
```bash 
    najmakhatun@Macbook-Air new_folder % cat > file.txt
    hello everyone, I am Najma! Trying to learn bash🫰🏻
```
In order to exit use Control + D.
followed by
```bash
    najmakhatun@Macbook-Air new_folder % cat file.txt
```
### Output:
```bash
    hello everyone, I am Najma! Trying to learn bash🫰🏻
```

### ▫️ Append new content in the existing File
---
### Command:
```bash
    najmakhatun@Macbook-Air new_folder % cat >> file.txt
    🌸 Happy Coding!
```
Followed by
```bash
    najmakhatun@Macbook-Air new_folder % cat file.txt
```
#### Output:
```bash
    hello everyone, I am Najma! Trying to learn bash🫰🏻
    🌸 Happy Coding!

```
<br>
<br>


## ⬜️ 7. `vi` - To edit files
The command `vi` helps us to edit the content of the file
### Command:
```bash
    najmakhatun@Macbook-Air new_folder % vi file.txt
```
This will open the vim terminal. Press Esc followed by - 
### ▫️ To append text:
---
```bash
    a → Append after the current cursor position.
    A → Append at the end of the current line.`
```
### ▫️ To rewrite:
---
```bash

    r → Replace a single character under the cursor (e.g., r replaces it with a).
    R → Enter replace mode: you can overwrite text continuously until you press Esc.
    cw → Change word: deletes the current word and puts you in insert mode.
    cc → Change entire line: deletes the line and puts you in insert mode.
```
### ▫️ To Insert:
---
```bash
    i → Insert before the cursor.
    I → Insert at the beginning of the line.
```

Once you are done, press esc - followed by 
Inorder to save
```bash
    :wq!
```
or simple exit without saving
```bash
    :q!
```
<br>
<br>



## ⬜️ 8. `mv` 
The `mv` command can act as both to move a file/ director or to rename it.
### ▫️ To move a file/directory:
Lets first create nested folder where we want to move file1.txt
```bash
    najmakhatun@Macbook-Air folder1 % mkdir -p parent/child/grandchild
```
```bash
    najmakhatun@Macbook-Air new_folder % mv file2.txt folder1/parent/child/grandchild
```
Now lets check if it actually got moved or not
```bash
    najmakhatun@Macbook-Air new_folder % cd folder1/parent/child/grandchild
    najmakhatun@Macbook-Air grandchild % ls
```
#### Output:
```bash
    file2.txt
```
### ▫️ To rename file/directory
```bash
    najmakhatun@Macbook-Air grandchild % mv  file2.txt file_rename.txt
```
```bash
    najmakhatun@Macbook-Air grandchild % ls
```
#### Output:
```bash
    file_rename.txt
```
<br>
<br>


### ⬜️ 9. `cp` - copy files/folder
The comman `cp` is used to copy a file/director from one source to other destination.
### ▫️ Command for File:
---
```bash
    najmakhatun@Macbook-Air new_folder % cp file.txt folder1/parent/child/grandchild
    najmakhatun@Macbook-Air new_folder %  cd folder1/parent/child/grandchild
    najmakhatun@Macbook-Air grandchild % ls
```
#### Output:
```bash
    file.txt	file_rename.txt
```
### ▫️ Command for Recursive copy of directory:
---
We need to give a flag - r indicating recursive copy of the directory

```bash
    cp -r folder1 folder2
```
<br>
<br>


## ⬜️ 10. `rm` - Delete File/Directory
For deleting files rm file_name but for directory we need to specify -r
### command:
```bash
    najmakhatun@Macbook-Air Code % rm -r new_folder
    najmakhatun@Macbook-Air Code % ls
```
#### Output:
```bash
    BSTVisualizer		DSA-Hub			Django			FlipLearn		HackathonProject	Portfolio		Programming		assignment
    CompetitiveProgramming	DataScience		Exam			HTML			MySql			Practise_Hackathon	Suggestrix		frontend
```
We have successfully deleted our new_folder
<br>
<br>


## ⬜️ 11. `node` -  Run JavaScript Files
Executes JavaScript files using Node.js.
### Command:
```bash
    node script.js
```
<br>
<br>


## ⬜️ 12. `npm` - Node Package Manager
Used to install and manage packages in Node.js projects.

### Command:
```bash
    npm install express
```
<br>
<br>