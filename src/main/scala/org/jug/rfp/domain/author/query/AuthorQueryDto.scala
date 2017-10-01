package org.jug.rfp.domain.author.query

case class AuthorQueryDto(
  id: Int,
  name: String,
  description: Option[String]
)
