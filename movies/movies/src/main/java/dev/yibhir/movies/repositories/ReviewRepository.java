package dev.yibhir.movies.repositories;

import dev.yibhir.movies.models.movie.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
