package com.hdsolutions.projectdockerkubernetes;

import com.hdsolutions.projectdockerkubernetes.entities.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.hdsolutions.projectdockerkubernetes.repositories.ProductRepository;

@SpringBootApplication
public class ProjectDockerKubernetesApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProjectDockerKubernetesApplication.class, args);
    }

//    @Bean
//    CommandLineRunner intiH2Data(ProductRepository r){
//        return args -> {
//            r.save(Product.builder().build());
//        };
//    }
}
