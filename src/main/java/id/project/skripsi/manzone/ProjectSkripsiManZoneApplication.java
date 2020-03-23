package id.project.skripsi.manzone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class ProjectSkripsiManZoneApplication extends SpringBootServletInitializer{

    public static  void main(String[] args){
        SpringApplication.run(ProjectSkripsiManZoneApplication.class,args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ProjectSkripsiManZoneApplication.class);
    }

}
