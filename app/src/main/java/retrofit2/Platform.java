package retrofit2;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import javax.annotation.Nullable;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* loaded from: classes3.dex */
class Platform {

    /* renamed from: c */
    public static final Platform f69507c;

    /* renamed from: a */
    public final boolean f69508a;

    /* renamed from: b */
    @Nullable
    public final Constructor<MethodHandles.Lookup> f69509b;

    public static final class Android extends Platform {

        public static final class MainThreadExecutor implements Executor {

            /* renamed from: b */
            public final Handler f69510b = new Handler(Looper.getMainLooper());

            @Override // java.util.concurrent.Executor
            public void execute(Runnable runnable) {
                this.f69510b.post(runnable);
            }
        }

        public Android() {
            super(Build.VERSION.SDK_INT >= 24);
        }

        @Override // retrofit2.Platform
        /* renamed from: a */
        public Executor mo35025a() {
            return new MainThreadExecutor();
        }

        @Override // retrofit2.Platform
        @Nullable
        /* renamed from: b */
        public Object mo35026b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
            if (Build.VERSION.SDK_INT >= 26) {
                return super.mo35026b(method, cls, obj, objArr);
            }
            throw new UnsupportedOperationException("Calling default methods on API 24 and 25 is not supported");
        }
    }

    static {
        f69507c = "Dalvik".equals(System.getProperty("java.vm.name")) ? new Android() : new Platform(true);
    }

    public Platform(boolean z) {
        this.f69508a = z;
        Constructor<MethodHandles.Lookup> constructor = null;
        if (z) {
            try {
                constructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
                constructor.setAccessible(true);
            } catch (NoClassDefFoundError | NoSuchMethodException unused) {
            }
        }
        this.f69509b = constructor;
    }

    @Nullable
    /* renamed from: a */
    public Executor mo35025a() {
        return null;
    }

    @Nullable
    @IgnoreJRERequirement
    /* renamed from: b */
    public Object mo35026b(Method method, Class<?> cls, Object obj, Object... objArr) throws Throwable {
        Constructor<MethodHandles.Lookup> constructor = this.f69509b;
        return (constructor != null ? constructor.newInstance(cls, -1) : MethodHandles.lookup()).unreflectSpecial(method, cls).bindTo(obj).invokeWithArguments(objArr);
    }
}
