package com.api.integrador.repository;

import com.api.integrador.model.Reserva;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservaRepository extends MongoRepository<Reserva, String> {

}
