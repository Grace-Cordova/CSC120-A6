Use this file to record your reflection on this assignment.

- What are your initial impressions of how `Inheritance` affects your programming?
Inheritance makes coding a lot easier. It decreases the repetition of having to make things repeatedly. I think I struggled with understanding how to initialize things that came from the parent class inside of the child class. I'm still not entrirely sure of the use of super(). I think once I get better at using it, inheritance will make programming much easier and more efficient. 
- What worked, what didn't, what advice would you give someone taking this course in the future?
I'm still struggling with a lot of syntax issues in my code. This week I spent getting ready for a couple of midterms I have this weekend and couldn't find an office hour time that worked for me. So, I wasn't able to get my code as close to done as I would've liked it to have been so I'm going to have to spend sometime in office hours narrowing down to where my issues are. 

UPDATED REFLECTION:
I had issues with the way that I initialized most of my variables so I went through and fixed them. I also made sure to add the javadoc comments. I'm still having some issues with trying to run it but on the whole I feel much better about this.

UPDATED UPDATED REFLECTION: I found that when restock is called I threw a runtime exception right before it. This means that restock is never called even when you sell out of something! In library I had a few other runtime exception errors where I entered them when the user asks if a title is available and if a title is in the system. Print lines were much more suited to handling this task because there was no error that occured with the users input. 

UPDATED UPDATED REFLECTINON:I went through and made sure to throw runtime exceptions if the user tried to add students to the house that already lived there and if the user tried to remove a student from the house that didn't live there. I also added runtime excpetions to the library class if the user tried to remove books from the collection that didn't exist in the collection. I also went into the sell method in the cafe class and made sure to include cups because when the person buys a coffee the number of cups will decrease. 