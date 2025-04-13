package androidx.core.provider;

import android.os.Handler;
import android.os.Message;
import androidx.annotation.RestrictTo;
import java.util.Objects;

@RestrictTo
@Deprecated
/* loaded from: classes.dex */
public class SelfDestructiveThread {

    /* renamed from: androidx.core.provider.SelfDestructiveThread$1 */
    public class C02501 implements Handler.Callback {
        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i2 = message.what;
            if (i2 == 0) {
                throw null;
            }
            if (i2 != 1) {
                return true;
            }
            throw null;
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$2 */
    class RunnableC02512 implements Runnable {

        /* renamed from: androidx.core.provider.SelfDestructiveThread$2$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {

            /* renamed from: b */
            public final /* synthetic */ RunnableC02512 f3509b;

            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(this.f3509b);
                throw null;
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r1 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Exception -> L2
            L2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.SelfDestructiveThread.RunnableC02512.run():void");
        }
    }

    /* renamed from: androidx.core.provider.SelfDestructiveThread$3 */
    class RunnableC02523 implements Runnable {
        /* JADX WARN: Code restructure failed: missing block: B:5:?, code lost:
        
            throw null;
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void run() {
            /*
                r1 = this;
                r0 = 0
                throw r0     // Catch: java.lang.Exception -> L2
            L2:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.core.provider.SelfDestructiveThread.RunnableC02523.run():void");
        }
    }

    public interface ReplyCallback<T> {
    }
}
