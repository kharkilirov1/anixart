package androidx.versionedparcelable;

import android.os.Parcelable;
import androidx.annotation.RestrictTo;
import androidx.collection.ArrayMap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@RestrictTo
/* loaded from: classes.dex */
public abstract class VersionedParcel {

    /* renamed from: a */
    public final ArrayMap<String, Method> f6478a;

    /* renamed from: b */
    public final ArrayMap<String, Method> f6479b;

    /* renamed from: c */
    public final ArrayMap<String, Class> f6480c;

    /* renamed from: androidx.versionedparcelable.VersionedParcel$1 */
    class C06551 extends ObjectInputStream {
        @Override // java.io.ObjectInputStream
        public Class<?> resolveClass(ObjectStreamClass objectStreamClass) throws IOException, ClassNotFoundException {
            Class<?> cls = Class.forName(objectStreamClass.getName(), false, getClass().getClassLoader());
            return cls != null ? cls : super.resolveClass(objectStreamClass);
        }
    }

    public static class ParcelException extends RuntimeException {
        public ParcelException(Throwable th) {
            super(th);
        }
    }

    public VersionedParcel(ArrayMap<String, Method> arrayMap, ArrayMap<String, Method> arrayMap2, ArrayMap<String, Class> arrayMap3) {
        this.f6478a = arrayMap;
        this.f6479b = arrayMap2;
        this.f6480c = arrayMap3;
    }

    /* renamed from: a */
    public abstract void mo4311a();

    /* renamed from: b */
    public abstract VersionedParcel mo4312b();

    /* renamed from: c */
    public final Class m4313c(Class<? extends VersionedParcelable> cls) throws ClassNotFoundException {
        Class cls2 = this.f6480c.get(cls.getName());
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(String.format("%s.%sParcelizer", cls.getPackage().getName(), cls.getSimpleName()), false, cls.getClassLoader());
        this.f6480c.put(cls.getName(), cls3);
        return cls3;
    }

    /* renamed from: d */
    public final Method m4314d(String str) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f6478a.get(str);
        if (method != null) {
            return method;
        }
        System.currentTimeMillis();
        Method declaredMethod = Class.forName(str, true, VersionedParcel.class.getClassLoader()).getDeclaredMethod("read", VersionedParcel.class);
        this.f6478a.put(str, declaredMethod);
        return declaredMethod;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: e */
    public final Method m4315e(Class cls) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Method method = this.f6479b.get(cls.getName());
        if (method != null) {
            return method;
        }
        Class m4313c = m4313c(cls);
        System.currentTimeMillis();
        Method declaredMethod = m4313c.getDeclaredMethod("write", cls, VersionedParcel.class);
        this.f6479b.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    /* renamed from: f */
    public boolean m4316f() {
        return this instanceof VersionedParcelStream;
    }

    /* renamed from: g */
    public abstract boolean mo4317g();

    /* renamed from: h */
    public abstract byte[] mo4318h();

    /* renamed from: i */
    public abstract CharSequence mo4319i();

    /* renamed from: j */
    public abstract boolean mo4320j(int i2);

    /* renamed from: k */
    public abstract int mo4321k();

    /* renamed from: l */
    public int m4322l(int i2, int i3) {
        return !mo4320j(i3) ? i2 : mo4321k();
    }

    /* renamed from: m */
    public abstract <T extends Parcelable> T mo4323m();

    /* renamed from: n */
    public <T extends Parcelable> T m4324n(T t, int i2) {
        return !mo4320j(i2) ? t : (T) mo4323m();
    }

    /* renamed from: o */
    public abstract String mo4325o();

    /* renamed from: p */
    public <T extends VersionedParcelable> T m4326p() {
        String mo4325o = mo4325o();
        if (mo4325o == null) {
            return null;
        }
        try {
            return (T) m4314d(mo4325o).invoke(null, mo4312b());
        } catch (ClassNotFoundException e2) {
            throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
        } catch (IllegalAccessException e3) {
            throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
        } catch (NoSuchMethodException e4) {
            throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
        } catch (InvocationTargetException e5) {
            if (e5.getCause() instanceof RuntimeException) {
                throw ((RuntimeException) e5.getCause());
            }
            throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
        }
    }

    /* renamed from: q */
    public abstract void mo4327q(int i2);

    /* renamed from: r */
    public void mo4328r(boolean z, boolean z2) {
    }

    /* renamed from: s */
    public abstract void mo4329s(boolean z);

    /* renamed from: t */
    public abstract void mo4330t(byte[] bArr);

    /* renamed from: u */
    public abstract void mo4331u(CharSequence charSequence);

    /* renamed from: v */
    public abstract void mo4332v(int i2);

    /* renamed from: w */
    public abstract void mo4333w(Parcelable parcelable);

    /* renamed from: x */
    public abstract void mo4334x(String str);

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: y */
    public void m4335y(VersionedParcelable versionedParcelable) {
        if (versionedParcelable == null) {
            mo4334x(null);
            return;
        }
        try {
            mo4334x(m4313c(versionedParcelable.getClass()).getName());
            VersionedParcel mo4312b = mo4312b();
            try {
                m4315e(versionedParcelable.getClass()).invoke(null, versionedParcelable, mo4312b);
                mo4312b.mo4311a();
            } catch (ClassNotFoundException e2) {
                throw new RuntimeException("VersionedParcel encountered ClassNotFoundException", e2);
            } catch (IllegalAccessException e3) {
                throw new RuntimeException("VersionedParcel encountered IllegalAccessException", e3);
            } catch (NoSuchMethodException e4) {
                throw new RuntimeException("VersionedParcel encountered NoSuchMethodException", e4);
            } catch (InvocationTargetException e5) {
                if (!(e5.getCause() instanceof RuntimeException)) {
                    throw new RuntimeException("VersionedParcel encountered InvocationTargetException", e5);
                }
                throw ((RuntimeException) e5.getCause());
            }
        } catch (ClassNotFoundException e6) {
            throw new RuntimeException(versionedParcelable.getClass().getSimpleName() + " does not have a Parcelizer", e6);
        }
    }
}
