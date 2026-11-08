package com.creedpetitt.puffbox.repository;

import com.creedpetitt.puffbox.model.ModelEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ModelRepository extends ReactiveCrudRepository<ModelEntity, Long> {
    Flux<ModelEntity> findByUserId(Long userId);
    Mono<ModelEntity> findByIdAndUserId(Long id, Long userId);
}