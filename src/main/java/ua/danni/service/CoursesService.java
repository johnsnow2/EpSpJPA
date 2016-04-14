package ua.danni.service;

import org.springframework.stereotype.Service;
import ua.danni.entity.CoursesEntity;

import java.util.List;


@Service
public interface CoursesService {

    CoursesEntity addCourses(CoursesEntity courses);

    void delete(int id);

    CoursesEntity getByName(String name);

    CoursesEntity editCourses(CoursesEntity courses);

    List<CoursesEntity> getAll();

}
