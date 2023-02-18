@todotask
Feature: Write a basic browser automation framework to validate a Polymer website. The focus should
be on The Web Application under test http://todomvc.com/

Scenario: user should click JavaScript and select Polymer. Then user should add two items on todo list.
  user should edit the second item on todo list.

  Given user load the website
  When click within the JavaScript tab
  And select Polymer link
  And add two Todo items
  And edit the content of the second Todo item
  Then user should see the edited second item on Todo list