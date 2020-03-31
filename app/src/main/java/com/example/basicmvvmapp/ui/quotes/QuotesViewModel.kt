package com.example.basicmvvmapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.basicmvvmapp.data.Quote
import com.example.basicmvvmapp.data.QuoteRepository

class QuotesViewModel (private val quoteRepository: QuoteRepository): ViewModel() {
    fun getQuotes() = quoteRepository.getQuotes()
    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}