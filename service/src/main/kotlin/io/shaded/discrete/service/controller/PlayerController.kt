package io.shaded.discrete.service.controller

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(
  "/api/players",
  produces = [MediaType.APPLICATION_JSON_VALUE],
  method = [RequestMethod.POST, RequestMethod.GET]
)
class PlayerController
