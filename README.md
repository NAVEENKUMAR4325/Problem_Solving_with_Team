# 📌 Collaborative Problem Solving Repository

Welcome to the **Collaborative Problem Solving Repository**! 🚀 This repository serves as a shared space for contributors to upload problem statements and their solution approaches. Each collaborator will document their contributions in this README under their respective names.

## 📋 How to Contribute
1. Clone the repository:
   ```sh
   https://github.com/NAVEENKUMAR4325/Problem_Solving_with_Team
   ```
2. Navigate to the repository:
   ```sh
   cd Problem_Solving_with_Team
   ```
3. Create a new branch for your contribution:
   ```sh
   git checkout -b NaveenKumarE.md
   ```
4. Add your problem statement and approach under your name in this README file.
5. Commit your changes:
   ```sh
   git add README.md
   git commit -m "Added problem and approach by Your Name"
   ```
6. Push your branch:
   ```sh
   git push origin NaveenKumarE.md
   ```
7. Create a **Pull Request** and request a review from other collaborators.

---

## 👥 Contributors & Problems

### 🔹 [Collaborator 1: Naveen Kumar E]
- **Problem Statement:**
    You are given a positive integer days representing the total number of days an employee is available for work (starting from day 1). You are also given a 2D array meetings of size n where meetings[i] = [start_i, end_i] represents the starting and ending days of meeting i (inclusive).

Return the count of days when the employee is available for work but no meetings are scheduled.

- **Approach:**
    The solution follows a structured approach to identify the days available for work without any scheduled meetings by leveraging sorting and iteration.

Sort Meetings: We begin by sorting the meetings array based on the start day of each meeting. This sorting allows us to process each meeting in the order they begin, which is critical for identifying gaps between meetings.

meetings.sort()
Initialize Variables: We define two variables: ans to count available workdays and last to track the furthest day any meeting has ended.

ans = last = 0
Iterate Through Meetings: We loop through each meeting represented as (st, ed), which stands for start and end days:

Check for Gaps: If the current last day is less than the start day of the current meeting (st), it indicates a gap period. The number of such available days is st - last - 1. We add this value to ans.

if last < st:
    ans += st - last - 1
Update Last Day: For each meeting, update the last day to the maximum of the current last and the end day of the meeting (ed). This ensures that last always holds the furthest day up to which meetings are scheduled.

last = max(last, ed)
Check the Remaining Available Days: After processing all meetings, if last is less than the total number of days (days), it means there are some remaining days after the last meeting that are available for work. Add these days to ans.

ans += days - last
Return the Result: Finally, the ans variable, which accumulates all the available workdays not covered by meetings, is returned.

return ans

---

### 🔹 [Collaborator 2: Your Name]
- **Problem Statement:**
  _[Describe the problem in a concise manner.]_
- **Approach:**
  _[Explain the solution approach with code snippets if necessary.]_

---

### 🔹 [Collaborator 3: Dhanush P]
- **Problem Statement:**
  Find the element that appears the most in an array.
- **Approach:**
  _[Explain the solution approach with code snippets if necessary.]_

---

### 🔹 [Collaborator 4: Your Name]
- **Problem Statement:**
  _[Describe the problem in a concise manner.]_
- **Approach:**
  _[Explain the solution approach with code snippets if necessary.]_

---

### 🔹 [Collaborator 5: Your Name]
- **Problem Statement:**
  _[Describe the problem in a concise manner.]_
- **Approach:**
  _[Explain the solution approach with code snippets if necessary.]_

---

## 🛠 Tools & Technologies Used
- Programming Languages: Python, Java.
- Version Control: Git, GitHub
- Collaboration: Pull Requests, Code Reviews

## 📢 Stay Connected
If you have any suggestions, feel free to open an issue or reach out to other contributors. Happy coding! 🎯

