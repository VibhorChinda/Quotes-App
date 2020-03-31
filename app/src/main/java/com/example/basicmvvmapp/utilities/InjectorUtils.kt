package com.example.basicmvvmapp.utilities

import com.example.basicmvvmapp.data.FakeDatabase
import com.example.basicmvvmapp.data.QuoteRepository
import com.example.basicmvvmapp.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quotesRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRepository)
    }
}