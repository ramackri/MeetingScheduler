Problem Statement
=================



Your employer has an existing system for employees to submit booking requests for meetings in



the boardroom. Your employer has now asked you to implement a system for processing batches of



booking requests.



Input Processing Guidelines
===========================


Your processing system must process input as text. The first line of the input text represents the



company office hours, in 24 hour clock format, and the remainder of the input represents individual



booking requests. Each booking request is in the following format.



[request submission time, in the format YYYY-MM-DD HH:MM:SS] [employee id]



[meeting start time, in the format YYYY-MM-DD HH:MM] [meeting duration in hours]



A sample text input follows, to be used in your solution.



Sample Input
============



0900 1730



2011-03-17 10:17:06 EMP001



2011-03-21 09:00 2



2011-03-16 12:34:56 EMP002



2011-03-21 09:00 2



2011-03-16 09:28:23 EMP003



2011-03-22 14:00 2



2011-03-17 10:17:06 EMP004



2011-03-22 16:00 1



2011-03-15 17:29:12 EMP005



2011-03-21 16:00 3

Output showing Gudelines to User
================================

Your system must provide a successful booking calendar as output, with bookings being grouped



chronologically by day. For the sample input displayed above, your system must provide the following



output.



Sample Output
============



2011-03-21



09:00 11:00 EMP002



2011-03-22



14:00 16:00 EMP003



16:00 17:00 EMP004



Constraints
===========



• No part of a meeting may fall outside office hours.



• Meetings may not overlap.



• The booking submission system only allows one submission at a time, so submission times



are guaranteed to be unique.



• Bookings must be processed in the chronological order in which they were submitted.



• The ordering of booking submissions in the supplied input is not guaranteed.



Notes
=====


• The current requirements make no provision for alerting users of failed bookings; it is up to



the user to confirm that their booking was successful.



• Although the system that you produce may open and parse a text file for input, this is not part



of the requirements. As long as the input text is in the correct format, the method of input is up



to the developer.
