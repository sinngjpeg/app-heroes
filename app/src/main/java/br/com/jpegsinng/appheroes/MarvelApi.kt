package br.com.jpegsinng.appheroes

import br.com.jpegsinng.core.data.network.response.DataWrapperResponse
import retrofit2.http.GET

interface MarvelApi {

    @GET
    suspend fun getCharacters(

    ): DataWrapperResponse
}