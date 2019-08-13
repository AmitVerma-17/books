package booksinventory.books.repository

import booksinventory.books.model.Books
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository
import java.lang.Exception
import java.lang.RuntimeException

@Repository
interface BooksRepository : CrudRepository<Books, String>{

    @Throws(Exception :: class)
    override fun <S : Books?> save(entity: S): S {
        val book : S = save(entity)
        if(book ==  null)
            throw RuntimeException("Failure while adding book to the DB")
        else
            return book
    }

}