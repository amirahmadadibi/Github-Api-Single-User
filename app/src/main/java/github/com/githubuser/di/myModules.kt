package github.com.githubuser.di

import org.koin.android.viewmodel.dsl.viewModel
import org.koin.dsl.module
import github.com.githubuser.viewModel.MainViewModel


//koin module
val myModule = module {

    viewModel { MainViewModel() }
}