package br.com.jpegsinng.core.data.repository

import androidx.paging.PagingSource
import br.com.jpegsinng.core.model.Character

interface CharactersRepository {
    fun getCharacters(query: String): PagingSource<Int, Character>
}