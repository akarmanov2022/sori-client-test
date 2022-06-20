package de.stx.soriclient.services;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class TicketService {
  private static final Logger LOGGER = LoggerFactory.getLogger(TicketService.class);

  private final WebClient webClient;

  public TicketService(WebClient webClient) {
    this.webClient = webClient;
  }


}
