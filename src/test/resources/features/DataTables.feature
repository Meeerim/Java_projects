Feature:Data Table practice

  Scenario:User should sign in with different data
    Given User on the page sign in
    When User  enter his data

      | John | Doe        | 1990 | john@gmail.com | USA |
      | Elon | Musk       | 1980 | musk@tesla.com | USA |
      | Mark | Zuckerberg | 1978 | mark@fb.com    | USA |
    Then User should enter the button Sign In
    Then User should successfully sign in


  Scenario: User should sign in with different data from the table
    Given User on the page sign in
    When User  enter data from the table
      | firstName | lastName   | dateOfBirth | emailAddress   | country |
      | John      | Doe        | 1990        | john@gmail.com | USA     |
      | Elon      | Musk       | 1980        | musk@tesla.com | USA     |
      | Mark      | Zuckerberg | 1978        | mark@fb.com    | USA     |
    Then User should enter the button Sign In
    Then User should successfully sign in
