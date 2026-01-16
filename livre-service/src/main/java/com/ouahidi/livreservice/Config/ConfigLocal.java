package com.ouahidi.livreservice.Config;



import lombok.*;
import org.apache.catalina.valves.AbstractAccessLogValve;
import org.springframework.boot.context.properties.ConfigurationProperties;




@Getter @Setter @AllArgsConstructor @NoArgsConstructor
@ToString @Builder

@ConfigurationProperties(prefix = "livre.params")

public class ConfigLocal {
    int c1;
    int c2;

}
