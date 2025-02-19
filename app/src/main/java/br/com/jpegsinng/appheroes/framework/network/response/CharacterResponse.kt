package br.com.jpegsinng.appheroes.framework.network.response

import br.com.jpegsinng.core.model.Character

data class CharacterResponse(
    val id: String,
    val name: String,
    val thumbnailResponse: ThumbnailResponse
)

fun CharacterResponse.toCharacterModel(): Character {
    return Character(
        name = this.name,
        imageUrl = "${this.thumbnailResponse.path}.${this.thumbnailResponse.extension}"
            .replace("http", "https")
    )
}