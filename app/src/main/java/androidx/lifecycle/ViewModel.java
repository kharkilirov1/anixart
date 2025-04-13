package androidx.lifecycle;

import androidx.annotation.Nullable;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public abstract class ViewModel {

    /* renamed from: a */
    @Nullable
    public final Map<String, Object> f4685a = new HashMap();

    /* renamed from: b */
    @Nullable
    public final Set<Closeable> f4686b = new LinkedHashSet();

    /* renamed from: c */
    public volatile boolean f4687c = false;

    /* renamed from: a */
    public static void m3242a(Object obj) {
        if (obj instanceof Closeable) {
            try {
                ((Closeable) obj).close();
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* renamed from: b */
    public void mo3065b() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: c */
    public <T> T m3243c(String str, T t) {
        Object obj;
        synchronized (this.f4685a) {
            obj = this.f4685a.get(str);
            if (obj == 0) {
                this.f4685a.put(str, t);
            }
        }
        if (obj != 0) {
            t = obj;
        }
        if (this.f4687c) {
            m3242a(t);
        }
        return t;
    }
}
