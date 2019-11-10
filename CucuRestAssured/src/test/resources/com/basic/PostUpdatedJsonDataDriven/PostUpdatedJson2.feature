Feature: First Rest Assured test POST

  Scenario Outline: Test my POST request test
    Given user hit the post request with "<username>" username and "<job>" job
    Then user validate the id is not null

    Examples: 
      | username | job     |
      | Anil     | QA Lead |
      | Pratha   | QA      |
      | Pragya   | Tester  |
