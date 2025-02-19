package br.com.jpegsinng.appheroes.framework.remote

import androidx.paging.PagingSource
import br.com.jpegsinng.appheroes.framework.network.response.DataWrapperResponse
import br.com.jpegsinng.appheroes.framework.paging.CharactersPagingSource
import br.com.jpegsinng.core.data.repository.CharactersRemoteDataSource
import br.com.jpegsinng.core.data.repository.CharactersRepository
import br.com.jpegsinng.core.model.Character
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val remoteDataSource: CharactersRemoteDataSource<DataWrapperResponse>
) : CharactersRepository {
    override fun getCharacters(query: String): PagingSource<Int, Character> {
        return CharactersPagingSource(remoteDataSource, query)
    }
}
