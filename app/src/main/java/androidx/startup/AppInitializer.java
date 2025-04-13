package androidx.startup;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.tracing.Trace;
import com.swiftsoft.anixartd.C2507R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
public final class AppInitializer {

    /* renamed from: d */
    public static volatile AppInitializer f6039d;

    /* renamed from: e */
    public static final Object f6040e = new Object();

    /* renamed from: c */
    @NonNull
    public final Context f6043c;

    /* renamed from: b */
    @NonNull
    public final Set<Class<? extends Initializer<?>>> f6042b = new HashSet();

    /* renamed from: a */
    @NonNull
    public final Map<Class<?>, Object> f6041a = new HashMap();

    public AppInitializer(@NonNull Context context) {
        this.f6043c = context.getApplicationContext();
    }

    @NonNull
    /* renamed from: c */
    public static AppInitializer m4160c(@NonNull Context context) {
        if (f6039d == null) {
            synchronized (f6040e) {
                if (f6039d == null) {
                    f6039d = new AppInitializer(context);
                }
            }
        }
        return f6039d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: a */
    public void m4161a(@Nullable Bundle bundle) {
        String string = this.f6043c.getString(C2507R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (Initializer.class.isAssignableFrom(cls)) {
                            this.f6042b.add(cls);
                        }
                    }
                }
                Iterator<Class<? extends Initializer<?>>> it = this.f6042b.iterator();
                while (it.hasNext()) {
                    m4162b(it.next(), hashSet);
                }
            } catch (ClassNotFoundException e2) {
                throw new StartupException(e2);
            }
        }
    }

    @NonNull
    /* renamed from: b */
    public final <T> T m4162b(@NonNull Class<? extends Initializer<?>> cls, @NonNull Set<Class<?>> set) {
        T t;
        if (Trace.m4183a()) {
            try {
                android.os.Trace.beginSection(cls.getSimpleName());
            } finally {
                android.os.Trace.endSection();
            }
        }
        if (set.contains(cls)) {
            throw new IllegalStateException(String.format("Cannot initialize %s. Cycle detected.", cls.getName()));
        }
        if (this.f6041a.containsKey(cls)) {
            t = (T) this.f6041a.get(cls);
        } else {
            set.add(cls);
            try {
                Initializer<?> newInstance = cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                List<Class<? extends Initializer<?>>> mo2814a = newInstance.mo2814a();
                if (!mo2814a.isEmpty()) {
                    for (Class<? extends Initializer<?>> cls2 : mo2814a) {
                        if (!this.f6041a.containsKey(cls2)) {
                            m4162b(cls2, set);
                        }
                    }
                }
                t = (T) newInstance.mo2815b(this.f6043c);
                set.remove(cls);
                this.f6041a.put(cls, t);
            } catch (Throwable th) {
                throw new StartupException(th);
            }
        }
        return t;
    }
}
