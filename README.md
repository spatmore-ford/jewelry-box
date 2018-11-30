# jewelry-box
Quick exercise on inheritance &amp; generics in Android (Kotlin)

Overview
This is a very loose & widespead exercise.
The starting code base is small and easy to unserstand, the test is how you use it.
Some suggested changes are below, do not rush to complete them all.

Fork this repository, choose a small change to make and create a new branch for this task.
Once the task is completed raise a Pull Request on your own Repo and get another person to review it.
All changes should be small ~100 lines, once reviewed merge it and create another branch from master.
Once you are finished with the exercise you can raise a pull request against this repo.

Objectives
Take the simple jewelry box and expand upon it.

Refactor existing code
 - remove duplicates
 - extract common logic to abstract base classes
 - consider use of generics & lists

Suggested UI improvements
 - enforce spacing between boxes
 - vary coloring based on depth
   - e.g: base box: green, inner boxes: blue...
 - specialised containers for certain objects
   - e.g: ring holder that displays ring on its side

Suggested functionality
 - ability to move items (e.g. ring) from one box to another
 - ability to add items (perhaps from a tray/menu)
 
Advanced functionality
 - ability to drag and drop items items (item tracks under finger)
   - how would this listener work across nested views?
