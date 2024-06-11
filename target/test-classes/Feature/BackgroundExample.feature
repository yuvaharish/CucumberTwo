@background
Feature: Background feature

Background: student completed school education
	Given the student finished high school
	Given the student finished high secondary school
	
Scenario: to studies for medicine
	Given the student applied for the medicine course
	When the student cleared the enterance exame
	Then the student is eligible for joing medicine

Scenario: to studies for enginnering
	Given the student applied for the enginnering course
	When the student has a cutoff mark
	Then the student is eligible for joing enginnering
	
	
	