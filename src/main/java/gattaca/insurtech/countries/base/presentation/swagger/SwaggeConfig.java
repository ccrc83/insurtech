package gattaca.insurtech.countries.base.presentation.swagger;

import io.swagger.annotations.Info;
import io.swagger.annotations.SwaggerDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@Configuration
@SwaggerDefinition(
        info = @Info(
                description = "API Base",
                version = "1.0",
                title = "Gattaca"))
public class SwaggeConfig {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors
                        .basePackage("gattaca.insurtech.base"))
                .paths(PathSelectors.any())
                .build();


    }
}
