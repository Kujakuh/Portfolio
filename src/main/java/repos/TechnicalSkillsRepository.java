package repos;

import model.TechnicalSkills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalSkillsRepository extends JpaRepository<TechnicalSkills, String> {
}

