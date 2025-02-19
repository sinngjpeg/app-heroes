package br.com.jpegsinng.appheroes.framework.network

import br.com.jpegsinng.appheroes.framework.network.response.DataWrapperResponse
import retrofit2.http.GET
import retrofit2.http.QueryMap

interface MarvelApi {

    @GET("characters")
    suspend fun getCharacters(
        @QueryMap
        queries: Map<String, String>
    ): DataWrapperResponse
}
