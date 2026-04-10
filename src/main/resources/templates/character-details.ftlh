<!DOCTYPE html>
<html>

<head>
    <title>Character Details</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>

    <div class="card details-card">

        <img src="/images/${character.image}">

        <h1>${character.name}</h1>

        <p><b>Universe:</b> ${character.universe}</p>
        <p><b>Role:</b> ${character.role}</p>
        <p><b>Species:</b> ${character.species}</p>
        <p>${character.description}</p>

        <a href="/updateForm/${character.characterId?c}">Edit</a>
        <a href="/delete/${character.characterId?c}">Delete</a>
        <a href="/characters">Back</a>

    </div>

</body>

</html>