DEMO
=====

Step 1 - automerge
------
Starte med Main.java og Person.java

endre Person (marius - master)

* legge til kanDrikkeAlkohol

endre Person(terje - master)

* legg til email

merge disse to sammen (vise commit, push, pull og automerge - ingen problemer)

Step 2 - Featurebranch, no-ff (marius)
----------

lage feature branch: [addTests] add tests 

* added test class
* added test
* added another test
* merge til master (ff)
* reset master (husk: ikke endre ting som andre har sett!)
* merge til master (no-ff)
* push

Step 3 - rebase onto master (terje)
---------------

fikse bug på master 

* fix age bug (terje should be less than 18)
* pull and merge
* show messy tree
* reset master
* pull --rebase
