package br.com.jpegsinng.core.data.repository

interface CharactersRemoteDataSource<T> {
    suspend fun fetchCharacters(queries: Map<String, String>): T
}