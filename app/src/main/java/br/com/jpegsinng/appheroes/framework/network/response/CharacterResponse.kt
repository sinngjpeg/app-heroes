package br.com.jpegsinng.appheroes.framework.network.response

data class CharacterResponse(
    val id: String,
    val name: String,
    val thumbnailResponse: ThumbnailResponse
)