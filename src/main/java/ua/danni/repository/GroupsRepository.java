package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.danni.entity.GroupsEntity;

/**
 * Created by Artem on 12.04.2016.
 */
public interface GroupsRepository extends JpaRepository<GroupsEntity, Integer> {
}