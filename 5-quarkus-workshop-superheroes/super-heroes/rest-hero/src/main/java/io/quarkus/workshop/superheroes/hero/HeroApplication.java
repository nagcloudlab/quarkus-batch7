package io.quarkus.workshop.superheroes.hero;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.microprofile.openapi.annotations.OpenAPIDefinition;
import org.eclipse.microprofile.openapi.annotations.info.Info;
import org.eclipse.microprofile.openapi.annotations.servers.Server;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;
//
//@ApplicationPath("/")
//@OpenAPIDefinition(
//    info = @Info(title = "Hero API",
//        description = "This API allows CRUD operations on a hero",
//        version = "1.0"),
//    servers = {
//        @Server(url = "http://localhost:8083")
//    },
//    tags = {
//        @Tag(name = "api", description = "Public that can be used by anybody"),
//        @Tag(name = "heroes", description = "Anybody interested in heroes")
//    }
//)
public class HeroApplication extends Application {
}