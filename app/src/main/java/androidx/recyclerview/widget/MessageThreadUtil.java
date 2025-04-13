package androidx.recyclerview.widget;

import androidx.recyclerview.widget.ThreadUtil;
import java.util.Objects;

/* loaded from: classes.dex */
class MessageThreadUtil<T> implements ThreadUtil<T> {

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1 */
    class C05211 implements ThreadUtil.MainThreadCallback<Object> {

        /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$1$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2 */
    class C05222 implements ThreadUtil.BackgroundCallback<Object> {

        /* renamed from: androidx.recyclerview.widget.MessageThreadUtil$2$1, reason: invalid class name */
        public class AnonymousClass1 implements Runnable {
            @Override // java.lang.Runnable
            public void run() {
                Objects.requireNonNull(null);
                throw null;
            }
        }
    }

    public static class MessageQueue {
    }

    public static class SyncQueueItem {

        /* renamed from: a */
        public static final Object f5455a = new Object();
    }
}
