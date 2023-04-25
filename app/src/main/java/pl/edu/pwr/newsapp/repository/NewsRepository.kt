package pl.edu.pwr.newsapp.repository

import pl.edu.pwr.newsapp.api.RetrofitInstance
import pl.edu.pwr.newsapp.db.ArticlesDatabase

class NewsRepository(
    val db: ArticlesDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) = RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)
}