package com.svtsygankov.spring.database.repository;

import com.svtsygankov.spring.bpp.Auditing;
import com.svtsygankov.spring.bpp.InjectBean;
import com.svtsygankov.spring.bpp.Transaction;
import com.svtsygankov.spring.database.pool.ConnectionPool;
import com.svtsygankov.spring.entity.Company;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
@Auditing
@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {


    private final ConnectionPool pool1;
    private final List<ConnectionPool> pools;
    private final Integer poolSize;

    public CompanyRepository(@Qualifier(value = "pool1")ConnectionPool pool1,
                             List<ConnectionPool> pools,
                             @Value("${db.pool.size}")Integer poolSize) {
        this.pool1 = pool1;
        this.pools = pools;
        this.poolSize = poolSize;
    }

    @PostConstruct
    private void init() {
        System.out.println("init CompanyRepository");
    }

    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("findById method...");
        return Optional.of(new Company(id));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("delete method...");
    }
}
