package org.greenrobot.eventbus;

import java.util.logging.Level;

/* loaded from: classes3.dex */
public interface Logger {

    public static class Default {
    }

    public static class JavaLogger implements Logger {
        @Override // org.greenrobot.eventbus.Logger
        /* renamed from: a */
        public void mo34641a(Level level, String str) {
            throw null;
        }

        @Override // org.greenrobot.eventbus.Logger
        /* renamed from: b */
        public void mo34642b(Level level, String str, Throwable th) {
            throw null;
        }
    }

    public static class SystemOutLogger implements Logger {
        @Override // org.greenrobot.eventbus.Logger
        /* renamed from: a */
        public void mo34641a(Level level, String str) {
            System.out.println("[" + level + "] " + str);
        }

        @Override // org.greenrobot.eventbus.Logger
        /* renamed from: b */
        public void mo34642b(Level level, String str, Throwable th) {
            System.out.println("[" + level + "] " + str);
            th.printStackTrace(System.out);
        }
    }

    /* renamed from: a */
    void mo34641a(Level level, String str);

    /* renamed from: b */
    void mo34642b(Level level, String str, Throwable th);
}
