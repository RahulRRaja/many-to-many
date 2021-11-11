package com.many.manytomany;

import com.many.manytomany.model.Viewer;
import com.many.manytomany.repository.StreamRepository;
import com.many.manytomany.repository.ViewerRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.Array;
import java.util.List;
import java.util.stream.Stream;

@SpringBootApplication
public class ManyToManyApplication {

	public static void main(String[] args) {

        ConfigurableApplicationContext configurableApplicationContext =
                SpringApplication.run(ManyToManyApplication.class, args);
        StreamRepository streamRepository =
                configurableApplicationContext.getBean(StreamRepository.class);
        ViewerRepository viewerRepository =
                configurableApplicationContext.getBean(ViewerRepository.class);

        Viewer Davidviewer = new Viewer( nickname:"David12");
        Viewer Ramviewer = new Viewer( nickname:"Ram45");
        List<Stream> streams = Array.asList(cookingstream. gamingStream);
streamRepository.saveAll(Stream);
Davidviewer.followStream(cookingstream);
Ramviewer.followStream(gamingStream);
viewerRepository.saveAll(viewers);