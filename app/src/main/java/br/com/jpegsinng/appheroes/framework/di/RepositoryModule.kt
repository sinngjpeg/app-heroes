package br.com.jpegsinng.appheroes.framework.di

import br.com.jpegsinng.appheroes.framework.network.response.DataWrapperResponse
import br.com.jpegsinng.appheroes.framework.remote.CharactersRepositoryImpl
import br.com.jpegsinng.appheroes.framework.remote.RetrofitCharactersDataSource
import br.com.jpegsinng.core.data.repository.CharactersRemoteDataSource
import br.com.jpegsinng.core.data.repository.CharactersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindCharactersRepository(repository: CharactersRepositoryImpl): CharactersRepository

    @Binds
    fun bindRemoteDataSource(
        dataSource: RetrofitCharactersDataSource
    ): CharactersRemoteDataSource<DataWrapperResponse>
}
