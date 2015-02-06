package com.mintbeans.geo.core

trait LocationRepository {
  def all(): Seq[Location]
  def byId(id: String): Location
  def byTextPhrase(phrase: String): Seq[Location]
}
