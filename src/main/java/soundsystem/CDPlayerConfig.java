package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public MediaPlayer mediaPlayer(CompactDisc compactDisc) {
    return new CDPlayer(compactDisc);
  }

}
