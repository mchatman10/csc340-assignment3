<!DOCTYPE html>
<html>

<head>
    <title>Create Character</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>

    <h1>Create Character</h1>

    <form action="/create" method="post">

        <input name="name" placeholder="Name"><br><br>

        <input name="role" placeholder="Role"><br><br>

        <input name="description" placeholder="Description"><br><br>
        
        <input name="universe" placeholder="Universe"><br><br>

        <input name="species" placeholder="Species"><br><br>

        <input name="image" placeholder="Image (mario.png)"><br><br>

        <button type="submit">Create</button>

    </form>

    <a href="/characters">Back</a>

</body>

</html>