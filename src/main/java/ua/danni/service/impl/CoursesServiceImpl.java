package ua.danni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.danni.entity.CoursesEntity;
import ua.danni.repository.CoursesRepository;
import ua.danni.service.CoursesService;

import java.util.List;

/**
 * Created by Artem on 13.04.2016.
 */
@Service
public class CoursesServiceImpl implements CoursesService {

    @Autowired
    private CoursesRepository coursesRepository;

    @Override
    public CoursesEntity addCourses(CoursesEntity courses) {
        CoursesEntity savedCourses = coursesRepository.saveAndFlush(courses);

        return savedCourses;
    }

    @Override
    public void delete(int id) {
        coursesRepository.delete(id);
    }

    @Override
    public CoursesEntity getByName(String name) {
        return coursesRepository.findByName(name);
    }

    @Override
    public CoursesEntity editCourses(CoursesEntity courses) {
        return coursesRepository.saveAndFlush(courses);
    }

    @Override
    public List<CoursesEntity> getAll() {
        return coursesRepository.findAll();
    }
}
