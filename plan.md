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

Step 2 - Featurebranch, no-ff
----------

lage feature branch: add tests (marius)

* added test class
* added test
* added another test
* merge til master (ff)
* reset master (husk: ikke endre ting som andre har sett!)
* merge til master (no-ff)

Step 3 - rebase onto master (terje)
---------------

* added another feature
* pull and merge
* show messy tree
* reset master
* pull --rebase
