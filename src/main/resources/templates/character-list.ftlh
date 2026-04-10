<!DOCTYPE html>
<html>

<head>
    <title>Mario Character Gallery</title>
    <link rel="stylesheet" href="/styles.css">
</head>

<body>

    <h1 class="title">Mario Character Gallery</h1>

    <div class="nav-links">
        <a href="/characters">Home</a>
        <a href="/create">Add Character</a>
    </div>

    <form action="/search" method="get" class="search-bar">
        <input type="text" name="keyword" placeholder="Search by name">
        <button>Search</button>
    </form>

    <div class="filter-buttons">
        <a href="/characters">All</a>
        <a href="/category?category=hero">Hero</a>
        <a href="/category?category=sidekick">Sidekick</a>
        <a href="/category?category=companion">Companion</a>
    </div>

    <div class="card-container">

        <#list characterList as character>
            <div class="card">

                <img src="/images/${character.image}" alt="${character.name}">

                <h2>${character.name}</h2>

                <p><b>Universe:</b> ${character.universe}</p>
                <p><b>Role:</b> ${character.role}</p>
                <p><b>Species:</b> ${character.species}</p>

                <a href="/characters/${character.characterId?c}" class="details-link">
                    View Details
                </a>
            </div>
        </#list>

    </div>

</body>

</html>