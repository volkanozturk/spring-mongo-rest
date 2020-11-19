package com.volkanozturk.api;

import com.volkanozturk.entity.User;
import com.volkanozturk.repository.UserRepository;
import java.util.List;
import javax.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author volkanozturk
 */
@RestController
@RequestMapping("/user")
public class UserRestController {

  @Autowired
  private UserRepository userRepository;

  @PostConstruct
  public void init() {
    User user = new User();
    user.setName("Volkan");
    user.setSurname("OZTURK");
    userRepository.save(user);
  }

  @PostMapping
  public ResponseEntity<User> add(@RequestBody User user) {
    return ResponseEntity.ok(userRepository.save(user));
  }

  @GetMapping
  public ResponseEntity<List<User>> getAll() {
    return ResponseEntity.ok(userRepository.findAll());
  }
}
