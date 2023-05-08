package pl.edu.pwr.newsapp.repository

import pl.edu.pwr.newsapp.api.RetrofitInstance
import pl.edu.pwr.newsapp.db.ArticlesDatabase
import pl.edu.pwr.newsapp.model.Article

class NewsRepository(
    val db: ArticlesDatabase
) {
    suspend fun getBreakingNews(countryCode: String, pageNumber: Int) =
        RetrofitInstance.api.getBreakingNews(countryCode, pageNumber)

    suspend fun searchNews(searchQuery: String, pageNumber: Int) =
        RetrofitInstance.api.searchForNews(searchQuery, pageNumber)

    suspend fun upsert(article: Article) = db.getArticleDao().upsert(article)

    fun getSavedNews() = db.getArticleDao().getAllArticles()

    suspend fun deleteArticle(article: Article) = db.getArticleDao().deleteArticle(article)
}