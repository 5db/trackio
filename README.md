# Trackio

Trackio is a time tracker application focused on vacation tracking within a company. It takes a very simple 3 Step
approach to deliver enhanced User Experience (UX).

# How it works?

** Step 1 **

User creates a Vacation Request and submits for Approval

** Step 2 **

Manager approves a Vacation Request he received

** Step 3 **

User receives an Approval Notification and is ready for Vacation

# Resource URIs and Operations (HTTP Methods)

## Resource URIs

** All Vacations **

`http://www.track.io/{username}/vacations`

** One Vacation **

`http://www.track.io/{username}/vacations/{Vacation ID}`

** Vacation Status **

`http://www.track.io/{username}/vacations/{Vacation ID}/status`

## Operations

/---------------------------------------------------------------------------------------------------------------------------\
| Resource URI                           		| HTTP Method | Description                                                 |
|-----------------------------------------------|-------------|-------------------------------------------------------------|
| `/{username}/vacations`                 		| GET         | Ask for all of the vacations for logged in user             |
| `/{username}/vacations`                 		| POST        | Attempt to create a new Vacation for logged in user,        |
|                                         		|             | returning the Vacation (in the Location HTTP Header) of the |
|                                         		|             | newly created resource.                                     |
| `/{username}/vacations/{Vacation ID}    		| GET         | Ask for representation of a specific Vacation for logged    |
|                                         		|             | in user                                                     |
| `/{username}/vacations/{Vacation ID}    		| DELETE      | Requests the deletion of a specified Vacation for logged    |
|                                         		|             | in user                                                     |
| `/{username}/vacations/{Vacation ID}/status   | GET         | Ask for representation of a specific Vacation's status for  |
|                                         		|             | logged in user                                              |
\---------------------------------------------------------------------------------------------------------------------------/