package com.nestor.laBuenaBodega.entity.dao;


import org.springframework.data.repository.CrudRepository;



import com.nestor.laBuenaBodega.entity.models.Wine;

public interface IWineDao extends CrudRepository<Wine, Integer> {

}
