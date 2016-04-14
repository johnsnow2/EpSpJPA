package ua.danni.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.danni.entity.BanlistEntity;

/**
 * Created by Artem on 12.04.2016.
 */
public interface  BanlistRepository extends JpaRepository<BanlistEntity, Integer> {
}