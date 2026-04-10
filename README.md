# csc340-assignment3
MVC Demo Link: https://uncg-my.sharepoint.com/:v:/g/personal/mhchatman_uncg_edu/IQBxx98sGg_GT52mWgjYe-MnAZnNZX8HN_J_u_a5rRXOXCc

To install: Run in the main class, CrudApiApplication.java.
Demo link: https://uncg-my.sharepoint.com/:v:/g/personal/mhchatman_uncg_edu/IQA00aNqMUv1RY-nLrbsHgvJAZIiAtrdNaqkWwjIPmHWMuo?nav=eyJyZWZlcnJhbEluZm8iOnsicmVmZXJyYWxBcHAiOiJPbmVEcml2ZUZvckJ1c2luZXNzIiwicmVmZXJyYWxBcHBQbGF0Zm9ybSI6IldlYiIsInJlZmVycmFsTW9kZSI6InZpZXciLCJyZWZlcnJhbFZpZXciOiJNeUZpbGVzTGlua0NvcHkifX0&e=1Vx0BW

All endpoints use the base URL:
http://localhost:8080/characters

Description: Retrieve a list of all characters in the database
Parameters: None
Response: 200 OK
Body: Array of Character objects

Example Response (Status: 200 OK)
[
  {
    "name": "Yoshi",
    "description": "Mario's Companion",
    "role": "Hero",
    "universe": "Mario",
    "characterId": 4
  },
  {
    "name": "Luigi",
    "description": "Mario's Sidekick",
    "role": "Hero",
    "universe": "Mario",
    "characterId": 1
  }
]

Get Character by ID
GET /character/{id}
Example Request: http://localhost:8080/characters/1
Example Response (Status: 200 OK) 
{
  "name": "Luigi",
  "description": "Mario's Sidekick",
  "role": "Hero",
  "universe": "Mario",
  "characterId": 1
}

Create a New Character
POST /character
Description: Create a new character record in the database.
Request Body: Character object with the following fields:
name (String, required): Character's name
description (String, required, unique): Description of the character
role (String, required): Character's role
universe (String, required): Character's universe of origin

Response: Status Code: 200 OK
Body: Created Character object with assigned characterId

Example Request: 
POST http://localhost:8080/characters
JSON
  {
    "name": "Bowser",
    "description": "Mario's Archnemesis",
    "role": "Villain",
    "universe": "Mario"
  }
Example Response (Status: 200 OK)
  {
    "name": "Bowser",
    "description": "Mario's Archnemesis",
    "role": "Villain",
    "universe": "Mario"
  }

  Get Characters by Name
  GET /characters/{universe}
  Description: Retrieve all characters with a specific Name.
  Path parameters: 
  universe (String, required): The name to filter by (e.g., "Mario")
  Response: Status Code: 200 OK
  Body: Array of Character objects

  Get Characters by Universe
  GET /characters/{universe}
  Description: Retrieve all characters with a specific universe.
  Path parameters: 
  universe (String, required): The universe to filter by (e.g., "Mario")
  Response: Status Code: 200 OK
  Body: Array of Character objects

  Get Characters by Role
  GET /characters/{role}
  Description: Retrieve all characters with a specific role.
  Path parameters: 
  universe (String, required): The universe to filter by (e.g., "Hero")
  Response: Status Code: 200 OK
  Body: Array of Character objects

  Search Characters by Name
  Description: Search for characters by name or retrieve all characters if no name is provided.

Query Parameters:

name (String, required): The name to search for
Response:

Status Code: 200 OK
Body: Array of matched Character objects
Example Request
curl "http://localhost:8080/characters/search?name=Mario"
Example Response (Status: 200 OK)
[]

Update a Character
PUT /character/{id}
Description: Update an existing character's information.

Path Parameters:

id (Long, required): The ID of the character to update
Request Body: Character object with fields to update:

name (String): Updated name
description (String): Updated role
role (String): Updated universe
universe (String): Updated GPA
Response:

Status Code: 200 OK (if updated successfully) or 404 Not Found (if not found)
Body: Updated Character object
Example Request
curl -X PUT http://localhost:8080/characters/1 \
  -H "Content-Type: application/json" \
  -d '{
  "name": "Mario",
  "description": "The Main Character Himself",
  "role": "Hero",
  "universe": "Mario",
  "characterId": 1
}
Example Response (Status: 200 OK)
{
  "name": "Mario",
  "description": "The Main Character Himself",
  "role": "Hero",
  "universe": "Mario",
  "characterId": 1
}

Delete a Character
DELETE /character/{id}
Description: Delete an existing character record from the database.

Path Parameters:

id (Int, required): The ID of the character to delete
Response:

Status Code: 204 No Content (successful deletion)
Body: Empty
Example Request
curl -X DELETE http://localhost:8080/characters/1
Example Response (Status: 204 No Content)
(Empty body)
