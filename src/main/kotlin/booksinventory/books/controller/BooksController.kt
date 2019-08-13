package booksinventory.books.controller

import booksinventory.books.model.Books
import booksinventory.books.repository.BooksRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/v1/books")
class BooksController(@Autowired val booksRepository: BooksRepository) {


    @PostMapping
    fun addBooks(@RequestBody books : Books) = booksRepository.save(books)


}