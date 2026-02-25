# 🐧 Veeva Integrated Program Assessment – 3

## 📚 Subject: Linux Operating System Concepts  
## 📝 Assessment Type: Practical Test  

---

# 🎯 Purpose of This Assessment

This practical assessment was conducted to evaluate my understanding of Linux Operating System concepts through hands-on shell scripting.

The main objectives of this assessment are:

- To implement file searching operations using Linux shell scripts  
- To perform text processing and pattern matching  
- To handle logging and error redirection  
- To demonstrate practical knowledge of Linux commands  
- To execute structured `.sh` programs using Git Bash  

All programs were written as **Shell Script (.sh) files** and executed in a **Git Bash environment**.

---

# 📌 Q1: Linux Scripts to Search Files

## (a) File Existence Check

### 1️⃣ Check if file exists in current directory
A shell script is implemented using conditional statements (`if`, `-f`) to verify whether a given file exists in the present working directory.

### 2️⃣ Check if file exists anywhere in the system
A shell script uses the `find` command to search the entire system and display the file path if the file is found.

---

## (b) Search for files modified within the last 3 days
A `.sh` script is created using file modification time conditions to list files modified in the last three days within the current directory.

---

## (c) Search for files larger than 1KB
A shell script is implemented to identify and display files larger than one kilobyte in the current directory.

---

## (d) Search for files with specific extension
A script is written to filter and display files that match a user-specified extension within the current directory.

---

# 📌 Q2: Text Processing and Pattern Searching

## (a) Search for a specific string in a given text file
A shell script is written to search for a specific pattern inside a text file and display all matching lines.

---

## (b) Extract text between specified HTML tags
A `.sh` script is implemented to extract content between particular HTML tags from an input HTML file using text processing techniques.

---

# 📌 Q3: Logging Scripts

## (a) Log a message to log.txt
A shell script appends user-defined messages into a file named `log.txt` for maintaining logs.

## (b) Log errors to errorlog.txt
A script is implemented to capture error messages and append them into `errorlog.txt` using error redirection mechanisms.

---

# 🛠 Technologies and Concepts Used

- Linux Shell Scripting (.sh)
- Git Bash
- File handling operations
- Conditional statements
- Pattern matching techniques
- Logging mechanisms
- Input and output redirection

---

# 🚀 How to Execute the Scripts

### Step 1: Clone the Repository
```
git clone https://github.com/chandanamadipalli/veeva-automation-engineer-roadmap.git
```

### Step 2: Navigate to Assessment Folder
```
cd "Assessment 3/Linux Assessment programs"
```

### Step 3: Provide Execute Permission
```
chmod +x *.sh
```

### Step 4: Run the Script
```
./script_name.sh
```

Example:
```
./file_check_current.sh
```

---

# 🎓 Learning Outcomes

By completing this assessment, I gained practical experience in:

- Writing structured shell scripts  
- Performing file search operations in Linux  
- Implementing filtering conditions  
- Processing text data and extracting patterns  
- Managing logs and error handling  
- Executing `.sh` programs in a Linux environment  

This assessment strengthened my practical understanding of Linux operating system concepts.

---

# 👩‍💻 Author

**Sri Mani Chandana Madipalli**  
CST Student  
Veeva Automation Engineer Roadmap  
Linux Operating System Practical Assessment
