package br.com.jpegsinng.appheroes.framework.remote

import br.com.jpegsinng.appheroes.framework.network.MarvelApi
import br.com.jpegsinng.appheroes.framework.network.response.DataWrapperResponse
import br.com.jpegsinng.core.data.repository.CharactersRemoteDataSource
import javax.inject.Inject

class RetrofitCharactersDataSource @Inject constructor(
    private val marvelApi: MarvelApi
) : CharactersRemoteDataSource<DataWrapperResponse> {
    override suspend fun fetchCharacters(queries: Map<String, String>): DataWrapperResponse {
        return marvelApi.getCharacters(queries)
    }
}
