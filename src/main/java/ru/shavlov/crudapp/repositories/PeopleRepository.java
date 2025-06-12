package ru.shavlov.crudapp.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.shavlov.crudapp.models.Person;

@Repository
public interface PeopleRepository extends JpaRepository<Person, Integer> {
}
