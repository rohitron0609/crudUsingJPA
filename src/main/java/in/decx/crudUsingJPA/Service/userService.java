package in.decx.crudUsingJPA.Service;

import in.decx.crudUsingJPA.Model.User;
import in.decx.crudUsingJPA.Repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Locale;

@Service
public class userService {

    private UserRepository userRepository;

    public User createUser(User user){
        return userRepository.save(user);
    }

    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    public User updateName(Long id, String name, User user){
        if(userRepository.existsById(id)){
            user.setName(name);
            return userRepository.save(user);
        }
        return null;
    }

    public void deleteUser(User user){
        userRepository.delete(user);
    }
}
