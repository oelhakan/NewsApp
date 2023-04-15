package pl.edu.pwr.newsapp.db

import androidx.room.TypeConverter
import pl.edu.pwr.newsapp.db.models.Source

class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    fun toSource(name: String): Source {
        return Source(name, name)
    }
}