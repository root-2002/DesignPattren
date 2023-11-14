_____________________________________________________________________
The objective of this assignment is to practice the software design and apply the
design principles in your code.
The problem:
You are required to design and implement a small application for a company that
manages the following user structure:
● Director: Has a list of Managers and Staff.
● Manager: Has a list of Staff.
● Staff
All users in the system share common attributes, which include ID, name, age, hourly
rate, and the total number of completed hours for each month.
The application's primary tasks are to generate a set of reports, including:
● A list of staff for each Director or Manager.
● The required budget for each Manager or Director.
The system should be flexible to allow for the addition of new reports. To enhance report
generation, template stores for the reports should be created, and these template stores
should be used to create new reports.
Data should be stored in a database (fake DB) and retrieved from it. Your code should
ensure that only one connection is open for each user.
