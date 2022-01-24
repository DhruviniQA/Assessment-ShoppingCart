
#To create new scenario
1. add feature file under "src/test/resource"
2. add stepDef file under "src/test/java/stepDefinitions"
3. add pageObj file under "src/main/java/pageObjects"
4. add pageObj obj inside "src/main/java/pageObjects/PageObjManager.java" to make obj instance as part of singelton check

#To run scenario
1. add expected tag in "runners/TestRunner" - "tags" node

#Driver instace created using BaseStep

#Util folder will have all utility class such as wait methods, scroll methods
-- This can be enhanced for screenshot capture, window handling etc additional methods