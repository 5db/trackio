# Trackio

Trackio is a time tracker application focused on vacation tracking within a company. It takes a very simple 3 Step
approach to deliver enhanced User Experience (UX) while getting the job done.

# How it works?

* Step 1

    User creates a Vacation Request and submits for Approval

* Step 2

    Manager approves a Vacation Request he received

* Step 3

    User receives an Approval Notification and is ready for Vacation

# Resource URIs & Operations

## Resource URIs

* All Vacations

    `http://www.track.io/{username}/vacations`

* One Vacation

    `http://www.track.io/{username}/vacations/{Vacation ID}`

* Vacation Status

    `http://www.track.io/{username}/vacations/{Vacation ID}/status`

## Operations

<table>
    <thead>
	<tr>
		<th>Resource URI</th>
		<th>Supported HTTP Methods</th>
		<th>Description</th>
	</tr>
	</thead>
	<tbody>
	<tr>
		<td>`/{username}/vacations`</td>
		<td>GET</td>
		<td>Ask for all of the vacations for logged in user</td>
	</tr>
	<tr>
		<td>`/{username}/vacations`</td>
		<td>POST</td>
		<td>Attempt to create a new Vacation for logged in user, returning the Vacation (in the Location HTTP Header) of the newly created resource.</td>
	</tr>
	<tr>
		<td>`/{username}/vacations/{Vacation ID}</td>
		<td>GET</td>
		<td>Ask for representation of a specific Vacation for logged in user</td>
	</tr>
	<tr>
		<td>`/{username}/vacations/{Vacation ID}</td>
		<td>DELETE</td>
		<td>Requests the deletion of a specified Vacation for logged in user</td>
	</tr>
	<tr>
		<td>`/{username}/vacations/{Vacation ID}/status</td>
		<td>GET</td>
		<td>Ask for representation of a specific Vacation's status for logged in user</td>
	</tr>
	</tbody>
</table>