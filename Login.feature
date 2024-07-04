


Feature: Nimap Infotech 

  Scenario: Login with Valid data & with Sign in option
  Given Test Field Force Url is accessed
  When Enter Login valid data
  And click on sign in button
  Then User should be login 
  When click on punch in option
  
  Scenario: Add New Coustomer
  When user login with valid data
  And navigate to My Coustomer page
  And Fill all dateials of New Coustomer
  When click on save button
  Then new coustomer should be added
  
  Scenario: login with valid data & Sign in with OTP
  When Enter data of login
  And click Sign in with OTP button
  Then user should be dashboard page
  
  Scenario: Forgot Password 
  When chick on Forgot Password link
  Then Forgot Password page is open 
  When Enter Email Id or Mobile no
  And ckick submit button
  Then Reset Password page should open
  When Enter OTP and set new Password then click submit 
  Then user should be successfully login with new password
  
  
