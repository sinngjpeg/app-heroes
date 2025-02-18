package br.com.jpegsinng.core.data.network.response

data class CharacterResponse(
    val id: String,
    val name: String,
    val thumbnailResponse: ThumbnailResponse
)