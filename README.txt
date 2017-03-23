****** P2-Repositories *******
- zipped p2-Repositories are in folder p2-repos
- You have to download additional eclipse-sdk and eclipse-testing-repositories. The corresponding URLs are in the p2-repos\p2-eclipse-url.txt

******** Projects ***********
jmockit-rebundled => Only to show how I rebundled JMockit
org.example.calculator.impl.bundle.test => should fail with corresponding launch-config "CalculatorServiceTest _JMockit_Bundle.launch"
org.example.calculator.impl.rebundled.test => should pass with corresponding launch-config "CalculatorServiceTest _JMockit_Rebundled.launch"
All other projects are well known interface/impl-bundles and the target-project

******* General information ************
If a bundle is called "jmockit", it is a "native" bundle which I want to make it work
If a bundle has "rebundled" in the name, it is my rebundled jmockit-version