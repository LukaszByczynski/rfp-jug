package org.jug.rfp.domain.author

import org.jug.rfp.domain.author.query.AuthorQueryDto
import org.springframework.stereotype.Component

import scala.collection.concurrent.TrieMap

@Component
private class AuthorRepository {

  private var map: TrieMap[Int, AuthorQueryDto] = TrieMap(
    1 -> AuthorQueryDto(1, "Karol Day", Some("Journalist")),
    2 -> AuthorQueryDto(2, "Jeff Bo", Some("Columnist")),
  )

  def findById(id: Int): Option[AuthorQueryDto] = {
    map.get(id)
  }

  def create()

}
