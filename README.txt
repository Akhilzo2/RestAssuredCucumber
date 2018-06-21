NOTE:
-----------------------------------------------------------------------------
This test pack is developed using the following environment.
	Operating System: Windows 10 
	Java Version    : 1.8.0_92
	Maven Version   : 3.3.9
	Framework       : RestAssured with Cucumber

The test scenarios and steps are present in the RestTest.feature file [resources/FeatureFiles/RestTest.feature]


HOW TO RUN:
-----------------------------------------------------------------------------

Note: I assume that the Java and Maven setup is already done in the machine where the tests are going to be executed.

1. Download the code
2. open command prompt and navigate to the root folder of the this project where pom.xml is present [RestAssuredCucumber]
3. Type mvn clean test [if Java and Maven Set up is correct then it will start test execution]
4. Once the test execution is completed (After around 3 mins), you will be able to see a similar message like the below one in your console

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 29.337 s
[INFO] Finished at: 2018-06-21T22:43:39+05:30
[INFO] Final Memory: 17M/133M
[INFO] ------------------------------------------------------------------------

The project can also be imported using an IDE like Eclipse and executed from it.

HOW TO VIEW THE REPORT:
-----------------------------------------------------------------------------

Navigate to the root folder [RestAssuredCucumber] after the test execution.
Then Navigate to target\HTML-Report folder and open the index.html file to view the report.

Each test scenario can be expanded if it is already not expanded (It changes depends on the browser you open the report) to view the detailed steps and the test data used, also to identify which is the exact step where the test got failed if there is any failure.

QUESTIONS & CLARIFICATION
-----------------------------------------------------------------------------

Write to akhilzo2.6@gmail.com or akhil.m52@wipro.com for any clarifiactions required.
Mob: 9902362045
