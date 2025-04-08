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


## ⬜️ 4. `mkdir` - Make directory
The `mkdir` create a new directory.
### Command:
```bash 
    najmakhatun@Macbook-Air Code % mkdir new_folder
```


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


## ⬜️ 6. `cat` - print content of the Files
We can do few interesting things with cat
### ▫️ rewrite the entire content of the file
---
### Command:
```bash 
    najmakhatun@Macbook-Air new_folder % cat > file.txt
    hello everyone, I am Najma! Trying to learn bash🫰🏻
```
followed by
```bash
    najmakhatun@Macbook-Air new_folder % cat file.txt
```
### Output:
```bash
    hello everyone, I am Najma! Trying to learn bash🫰🏻
```

### ⬜️ 7. `vi` - To edit files
if exit without saving :q! and to save content :wq!
### ⬜️ 8. `mv` - to move files/directory and to rename
### ⬜️ 9. `cp` - copy files/folder
if folder we need to use flag -r (recursive)
### ⬜️ 10. `node` - To edit files
### ⬜️ 11. `npm` - To edit files