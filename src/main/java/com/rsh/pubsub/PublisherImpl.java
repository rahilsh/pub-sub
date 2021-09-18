package com.rsh.pubsub;

import java.util.concurrent.BlockingQueue;

/** @author Rahil */
public class PublisherImpl<T> implements Publisher<T> {

  private final Queue<Message<T>> queue;

  public PublisherImpl(Queue<Message<T>> queue) {
    this.queue = queue;
  }

  @Override
  public void publish(Message<T> message) {
    queue.put(message);
  }
}
