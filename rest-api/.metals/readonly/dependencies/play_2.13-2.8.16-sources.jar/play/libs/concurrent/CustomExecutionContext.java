/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */

package play.libs.concurrent;

import akka.actor.ActorSystem;
import scala.concurrent.ExecutionContext;
import scala.concurrent.ExecutionContextExecutor;

import java.util.concurrent.Executor;

/**
 * Provides a custom execution context from an Akka dispatcher.
 *
 * <p>Subclass this to create your own custom execution context, using the full path to the Akka
 * dispatcher.
 *
 * <pre>{@code
 * class MyCustomExecutionContext extends CustomExecutionContext {
 *   // Dependency inject the actorsystem from elsewhere
 *   public MyCustomExecutionContext(ActorSystem actorSystem) {
 *     super(actorSystem, "full.path.to.my-custom-executor");
 *   }
 * }
 * }</pre>
 *
 * Then use your custom execution context where you have blocking operations that require processing
 * outside of Play's main rendering thread.
 *
 * @see <a href="http://doc.akka.io/docs/akka/2.6/java/dispatchers.html">Dispatchers</a>
 * @see <a href="https://www.playframework.com/documentation/latest/ThreadPools">Thread Pools</a>
 */
public abstract class CustomExecutionContext implements ExecutionContextExecutor {
  private final ExecutionContext executionContext;

  public CustomExecutionContext(ActorSystem actorSystem, String name) {
    this.executionContext = actorSystem.dispatchers().lookup(name);
  }

  @Override
  @SuppressWarnings("deprecation")
  public ExecutionContext prepare() {
    return executionContext.prepare();
  }

  @Override
  public void execute(Runnable command) {
    executionContext.execute(command);
  }

  @Override
  public void reportFailure(Throwable cause) {
    executionContext.reportFailure(cause);
  }

  /**
   * Get this executor associated with the current ClassLoader.
   *
   * <p>Note that the returned executor is only valid for the current ClassLoader. It should be used
   * in a transient fashion, long lived references to it should not be kept.
   *
   * @return This executor that will execute its tasks with the current ClassLoader.
   */
  public Executor current() {
    return HttpExecution.fromThread(this);
  }
}
