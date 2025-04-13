package androidx.asynclayoutinflater.view;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.util.Pools;
import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;

/* loaded from: classes.dex */
public final class AsyncLayoutInflater {

    /* renamed from: androidx.asynclayoutinflater.view.AsyncLayoutInflater$1 */
    public class C01481 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            Objects.requireNonNull((InflateRequest) message.obj);
            Objects.requireNonNull(null);
            throw null;
        }
    }

    public static class BasicInflater extends LayoutInflater {

        /* renamed from: a */
        public static final String[] f1707a = {"android.widget.", "android.webkit.", "android.app."};

        public BasicInflater(Context context) {
            super(context);
        }

        @Override // android.view.LayoutInflater
        public LayoutInflater cloneInContext(Context context) {
            return new BasicInflater(context);
        }

        @Override // android.view.LayoutInflater
        public View onCreateView(String str, AttributeSet attributeSet) throws ClassNotFoundException {
            View createView;
            for (String str2 : f1707a) {
                try {
                    createView = createView(str, str2, attributeSet);
                } catch (ClassNotFoundException unused) {
                }
                if (createView != null) {
                    return createView;
                }
            }
            return super.onCreateView(str, attributeSet);
        }
    }

    public static class InflateRequest {
    }

    public static class InflateThread extends Thread {

        /* renamed from: b */
        public ArrayBlockingQueue<InflateRequest> f1708b = new ArrayBlockingQueue<>(10);

        /* renamed from: c */
        public Pools.SynchronizedPool<InflateRequest> f1709c = new Pools.SynchronizedPool<>(10);

        static {
            new InflateThread().start();
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (true) {
                try {
                    InflateRequest take = this.f1708b.take();
                    try {
                        Objects.requireNonNull(take);
                        Objects.requireNonNull(null);
                        throw null;
                    } catch (RuntimeException e2) {
                        Log.w("AsyncLayoutInflater", "Failed to inflate resource in the background! Retrying on the UI thread", e2);
                        Objects.requireNonNull(take);
                        Objects.requireNonNull(null);
                        throw null;
                    }
                } catch (InterruptedException e3) {
                    Log.w("AsyncLayoutInflater", e3);
                }
            }
        }
    }

    public interface OnInflateFinishedListener {
    }
}
