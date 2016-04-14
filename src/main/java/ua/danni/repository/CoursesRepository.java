package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ua.danni.entity.CoursesEntity;

/**
 * Created by Artem on 12.04.2016.
 */
public interface CoursesRepository  extends JpaRepository<CoursesEntity, Integer> {
    @Query("select b from CoursesEntity b where b.name = :name")
    CoursesEntity findByName(@Param("name") String name);
}