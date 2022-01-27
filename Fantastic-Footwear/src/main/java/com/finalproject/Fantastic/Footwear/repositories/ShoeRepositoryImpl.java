package com.finalproject.Fantastic.Footwear.repositories;

import com.finalproject.Fantastic.Footwear.model.Shoes;

import java.util.Optional;

public class ShoeRepositoryImpl implements ShoeRepository {
    @Override
    public <S extends Shoes> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Shoes> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Shoes> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Shoes> findAll() {
        return null;
    }

    @Override
    public Iterable<Shoes> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Shoes entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Shoes> entities) {

    }

    @Override
    public void deleteAll() {

    }
}
