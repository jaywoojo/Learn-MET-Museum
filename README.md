# Learn (about) MET Museum

Creater: Jaywoo Jo

---

## Project Summary ##

Based on the concept of "read a book a week", this app is useful for those who wish to log-in once a day and learn about a new art piece. 

The app utilizes the Metrapolitan Museum of Art's public API (https://metmuseum.github.io/), consisting of thousands of art pieces, to gather information. Uses Kotlin Volley library to pull requests.

The app has two modes: the "learn mode" and the "quiz mode". where the learn mode allows you to pick a certain art department, for example, "Asian Art" or "European Paintings". Each department has tens of thousands of art pieces, each referenced by a specific objectID, and the app will randomly generate data about an art piece. It will generate a photo of the piece, title, artist, medium, object date, and culture.


## In development... ##

Current development undergoing for the quiz mode, where after learning about a piece the app will store the data using SQLite and be able to create a multiple choice quiz. Also, currently only two departments generate art pieces (easy copy and paste fix). Some formatting issues I'm having trouble fixing, namely the "BACK" bar that is below the bottom of screen.

## Images... ##

![](https://github.com/jaywoojo/Learn-MET-Museum/blob/master/README%20images/1.png)
![](https://github.com/jaywoojo/Learn-MET-Museum/blob/master/README%20images/2.png)
![](https://github.com/jaywoojo/Learn-MET-Museum/blob/master/README%20images/3.png)
![](https://github.com/jaywoojo/Learn-MET-Museum/blob/master/README%20images/4.jpg)

