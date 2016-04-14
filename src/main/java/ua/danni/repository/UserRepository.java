package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.danni.entity.UserEntity;

/**
 * Created by Artem on 12.04.2016.
 */
public interface UserRepository  extends JpaRepository<UserEntity, Integer> {
}