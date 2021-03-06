package eu.jrie.put.cs.pt.scrapper.domain.results

case class Result (
                    id: Option[Long],
                    taskId: String,
                    offerId: Option[String],
                    title: String,
                    subtitle: Option[String],
                    price: Double,
                    currency: String,
                    url: String,
                    imgUrl: Option[String],
                    newcomer: Boolean,
                    params: Map[String, String] = Map.empty
                  )
