package pers.dylan.authserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.provider.token.TokenStore;
import org.springframework.security.oauth2.provider.token.store.InMemoryTokenStore;

@Configuration
public class AccessTokenConfig {

    /**
     * 生成的token存放位置
     * @return
     */
    @Bean
    TokenStore tokenStore(){
        return new InMemoryTokenStore();
    }
}
