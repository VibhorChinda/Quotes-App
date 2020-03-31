package com.example.basicmvvmapp.data

data class Quote(var quoteText: String, val author: String) {

    override fun toString(): String {
        return "$quoteText-$author"
    }
}