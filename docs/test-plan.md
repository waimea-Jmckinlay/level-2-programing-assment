# Plan for Testing the Program

The test plan lays out the actions and data I will use to test the functionality of my program.

Terminology:

- **VALID** data values are those that the program expects
- **BOUNDARY** data values are at the limits of the valid range
- **INVALID** data values are those that the program should reject

---

## Names

seeing if player Names are working

### Test Data To Use

running the program and putting in player names

### Expected Test Result

what should happen is the players should be
able to input their names weather or not it has 
numbers in it or just numbers or letters 

![img.png](img.png)
 It does what I want it to do right now 


## The game

Im testing to see if the game bord has been printed 
with the coins in 5 slots, gold is put in the 9/last place

### Test Data To Use
i will run the progarm to see if it does what i want it to do

### Expected Test Result

what should happen is the Game should randomes the sliver slots add a gold coin on the 9 slot and not
add any more slots
### Fixed resalt
I have fixed it I did change it so it would delated a space that wasn't a coin once one was added
and then added the gold coin on the end after delating that space/slot.
![img_4.png](img_4.png)


## Name 
working on moveing and removeing a coin

## test data To Use
I will run the progarm and enter an input as a player and see what happens


## what happened
the code didn't take the input but somereson it also added 
anough slot t othe game board
![img_7.png](img_7.png)

I got it to do one of the inputs right (r)
but still working on moving coins 
![img_8.png](img_8.png)

it's moveing the coin but it printed a line that it shoudn't of
and if i input r it now removers a coin but then tryes to move a coin
![img_9.png](img_9.png)

### Fixed resalt 
the game can now remave and move coins around with the player's input



## player's taking turns
 here I will be making sure players can take turns and win the game
 
## test data To Use
players can win and lose the game can be played 

## what happend 
it went as planed as the players can input moves to move coins and win
as long as it's a vailed  input or as long as it's not left blank 
![img_10.png](img_10.png)
and once the game ends it prints you win (the Player name that won)
![img_11.png](img_11.png)

it breaks if you don't input anything and just hit enter
![img_12.png](img_12.png)



## Error checking
testing all the in valided moves and fixing misstakes

## tests data 

## what happen
I've ensured that coins can't be moved onto one another 
![img_13.png](img_13.png)
or you can't select a Empty space and must selet a coin
![img_14.png](img_14.png)