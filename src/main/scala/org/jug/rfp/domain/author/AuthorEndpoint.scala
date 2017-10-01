package org.jug.rfp.domain.author

import org.jug.rfp.domain.author.query.AuthorQueryDto
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, RequestMapping, RestController}

@RestController
@RequestMapping(path = Array("/api/author"))
class AuthorEndpoint(
  authorRepository: AuthorRepository
) {

  @GetMapping(path = Array("/{id}"))
  def findById(@PathVariable id: Int): Option[AuthorQueryDto] = {
    authorRepository.findById(id)
  }

}
