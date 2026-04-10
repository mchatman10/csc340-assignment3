<!DOCTYPE html>
<html>

<head>
    <title>Update Character</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>

    <h1>Update Character</h1>

    <div class="form-container">

        <form action="/update/${character.characterId?c}" method="post">

            <label>Name</label><br>
            <input type="text" name="name" value="${character.name}" required><br><br>

            <label>Role</label><br>
            <input type="text" name="role" value="${character.role}" required><br><br>

            <label>Description</label><br>
            <input type="text" name="description" value="${character.description}" required><br><br>

            <label>Universe</label><br>
            <input type="text" name="universe" value="${character.universe}" required><br><br>

            <label>Species</label><br>
            <input type="text" name="species" value="${character.species}" required><br><br>

            <label>Image Filename</label><br>
            <input type="text" name="image" value="${character.image}" required><br><br>

            <button type="submit">Update Character</button>

        </form>

        <br>
        <a href="/characters">⬅ Back to List</a>

    </div>

</body>

</html>