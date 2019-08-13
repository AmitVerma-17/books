package booksinventory.books.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.index.Indexed
import org.springframework.data.mongodb.core.mapping.Document
import java.util.*
import javax.annotation.processing.Generated

@Document(collection = "books")
data class Books(@Id @Generated var bookId : String? = null,
                 @Indexed(unique = true) val title : String,
                 @Indexed val authors : Set<String>,
                 //val image : ByteArray,
                 val description : String,
                 var price : Double,
                 var quantity : Int,
                 val creationDate : Date) {
}