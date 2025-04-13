package io.grpc.internal;

import io.grpc.Decompressor;
import io.grpc.internal.ApplicationThreadDeframerListener;
import io.grpc.internal.ApplicationThreadDeframerListener.RunnableC63383;
import io.grpc.internal.MessageDeframer;
import io.grpc.internal.StreamListener;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public class ApplicationThreadDeframer implements Deframer {

    /* renamed from: b */
    public final MessageDeframer.Listener f58426b;

    /* renamed from: c */
    public final ApplicationThreadDeframerListener f58427c;

    /* renamed from: d */
    public final MessageDeframer f58428d;

    public class CloseableInitializingMessageProducer extends InitializingMessageProducer implements Closeable {

        /* renamed from: e */
        public final Closeable f58436e;

        public CloseableInitializingMessageProducer(ApplicationThreadDeframer applicationThreadDeframer, Runnable runnable, Closeable closeable) {
            super(runnable, null);
            this.f58436e = closeable;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f58436e.close();
        }
    }

    public class InitializingMessageProducer implements StreamListener.MessageProducer {

        /* renamed from: b */
        public final Runnable f58437b;

        /* renamed from: c */
        public boolean f58438c = false;

        public InitializingMessageProducer(Runnable runnable, RunnableC63311 runnableC63311) {
            this.f58437b = runnable;
        }

        @Override // io.grpc.internal.StreamListener.MessageProducer
        @Nullable
        public InputStream next() {
            if (!this.f58438c) {
                this.f58437b.run();
                this.f58438c = true;
            }
            return ApplicationThreadDeframer.this.f58427c.f58442c.poll();
        }
    }

    public interface TransportExecutor extends ApplicationThreadDeframerListener.TransportExecutor {
    }

    public ApplicationThreadDeframer(MessageDeframer.Listener listener, TransportExecutor transportExecutor, MessageDeframer messageDeframer) {
        SquelchLateMessagesAvailableDeframerListener squelchLateMessagesAvailableDeframerListener = new SquelchLateMessagesAvailableDeframerListener(listener);
        this.f58426b = squelchLateMessagesAvailableDeframerListener;
        ApplicationThreadDeframerListener applicationThreadDeframerListener = new ApplicationThreadDeframerListener(squelchLateMessagesAvailableDeframerListener, transportExecutor);
        this.f58427c = applicationThreadDeframerListener;
        messageDeframer.f58880b = applicationThreadDeframerListener;
        this.f58428d = messageDeframer;
    }

    @Override // io.grpc.internal.Deframer
    public void close() {
        this.f58428d.f58898t = true;
        this.f58426b.mo31026a(new InitializingMessageProducer(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.5
            @Override // java.lang.Runnable
            public void run() {
                ApplicationThreadDeframer.this.f58428d.close();
            }
        }, null));
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: g */
    public void mo31029g(final int i2) {
        this.f58426b.mo31026a(new InitializingMessageProducer(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.1
            @Override // java.lang.Runnable
            public void run() {
                if (ApplicationThreadDeframer.this.f58428d.isClosed()) {
                    return;
                }
                try {
                    ApplicationThreadDeframer.this.f58428d.mo31029g(i2);
                } catch (Throwable th) {
                    ApplicationThreadDeframerListener applicationThreadDeframerListener = ApplicationThreadDeframer.this.f58427c;
                    applicationThreadDeframerListener.f58440a.mo31036e(applicationThreadDeframerListener.new RunnableC63383(th));
                    ApplicationThreadDeframer.this.f58428d.close();
                }
            }
        }, null));
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: h */
    public void mo31030h(int i2) {
        this.f58428d.f58881c = i2;
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: i */
    public void mo31031i() {
        this.f58426b.mo31026a(new InitializingMessageProducer(new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.4
            @Override // java.lang.Runnable
            public void run() {
                ApplicationThreadDeframer.this.f58428d.mo31031i();
            }
        }, null));
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: j */
    public void mo31032j(Decompressor decompressor) {
        this.f58428d.mo31032j(decompressor);
    }

    @Override // io.grpc.internal.Deframer
    /* renamed from: k */
    public void mo31033k(final ReadableBuffer readableBuffer) {
        this.f58426b.mo31026a(new CloseableInitializingMessageProducer(this, new Runnable() { // from class: io.grpc.internal.ApplicationThreadDeframer.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    ApplicationThreadDeframer.this.f58428d.mo31033k(readableBuffer);
                } catch (Throwable th) {
                    ApplicationThreadDeframerListener applicationThreadDeframerListener = ApplicationThreadDeframer.this.f58427c;
                    applicationThreadDeframerListener.f58440a.mo31036e(applicationThreadDeframerListener.new RunnableC63383(th));
                    ApplicationThreadDeframer.this.f58428d.close();
                }
            }
        }, new Closeable(this) { // from class: io.grpc.internal.ApplicationThreadDeframer.3
            @Override // java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                readableBuffer.close();
            }
        }));
    }
}
