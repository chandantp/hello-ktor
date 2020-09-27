package com.hello

import io.ktor.application.call
import io.ktor.http.ContentType
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty


fun main() {
    val message = System.getenv("SERVER_NAME") ?: "Unknown"
    val version = System.getenv("SERVER_VERSION") ?: "Unknown"

    embeddedServer(Netty, 8080) {
        routing {
            get("/hello") {
                call.respondText("Hello, I am $message stack, version $version!", ContentType.Text.Html)
            }
        }
    }.start(wait = true)
}