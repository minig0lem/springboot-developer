package me.jhs.service;


import lombok.RequiredArgsConstructor;
import me.jhs.domain.User;
import me.jhs.repository.UserRepository;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserDetailService implements UserDetailsService {
    private final UserRepository userRepository;

    @Override
    public User loadUserByUsername(String email) {                         //UserDetailsService 인터페이스 상속 필수 구현
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new IllegalArgumentException(email));   //orElseThrow() -> Optional 값이 비어있으면 예외 or 값 가져옴.
    }
}
