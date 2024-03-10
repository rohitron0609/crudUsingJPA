package in.decx.crudUsingJPA.Repository;

import in.decx.crudUsingJPA.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
