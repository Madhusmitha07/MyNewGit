Feature: Explaining tags concept


@Smoke
Scenario: FirstScenario
Given this is step1

@Sanity
Scenario: SecondScenario
Given this is step2

@Regression @Smoke
Scenario: ThirdScenario
Given this is step3

@Smoke @Sanity
Scenario: FourthScenario
Given this is step4

Scenario: FifthScenario
Given this is step5

@Regression
Scenario: SixthScenario
Given this is step6



