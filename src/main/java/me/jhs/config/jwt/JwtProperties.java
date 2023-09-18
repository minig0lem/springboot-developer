package me.jhs.config.jwt;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Setter
@Getter
@Component
@ConfigurationProperties("jwt")     //application.yml 파일에 작성한 프로퍼티 클래스로 읽어오기 가능
public class JwtProperties {
    private String issuer;
    private String secretKey;
}
