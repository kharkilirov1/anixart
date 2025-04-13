package dagger.internal;

/* loaded from: classes3.dex */
public final class Preconditions {
    /* renamed from: a */
    public static <T> void m30793a(T t, Class<T> cls) {
        if (t != null) {
            return;
        }
        throw new IllegalStateException(cls.getCanonicalName() + " must be set");
    }

    /* renamed from: b */
    public static <T> T m30794b(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        if (!str.contains("%s")) {
            throw new IllegalArgumentException("errorMessageTemplate has no format specifiers");
        }
        if (str.indexOf("%s") == str.lastIndexOf("%s")) {
            throw new NullPointerException(str.replace("%s", ((Class) obj).getCanonicalName()));
        }
        throw new IllegalArgumentException("errorMessageTemplate has more than one format specifier");
    }
}
