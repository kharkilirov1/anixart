package io.grpc;

import com.google.common.base.Preconditions;
import java.util.concurrent.atomic.AtomicLong;
import javax.annotation.Nullable;

@Internal
/* loaded from: classes3.dex */
public final class InternalLogId {

    /* renamed from: d */
    public static final AtomicLong f58177d = new AtomicLong();

    /* renamed from: a */
    public final String f58178a;

    /* renamed from: b */
    @Nullable
    public final String f58179b;

    /* renamed from: c */
    public final long f58180c;

    public InternalLogId(String str, String str2, long j2) {
        Preconditions.m11187k(str, "typeName");
        Preconditions.m11179c(!str.isEmpty(), "empty type");
        this.f58178a = str;
        this.f58179b = str2;
        this.f58180c = j2;
    }

    /* renamed from: a */
    public static InternalLogId m30878a(Class<?> cls, @Nullable String str) {
        String simpleName = cls.getSimpleName();
        if (simpleName.isEmpty()) {
            simpleName = cls.getName().substring(cls.getPackage().getName().length() + 1);
        }
        return new InternalLogId(simpleName, str, f58177d.incrementAndGet());
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f58178a + "<" + this.f58180c + ">");
        if (this.f58179b != null) {
            sb.append(": (");
            sb.append(this.f58179b);
            sb.append(')');
        }
        return sb.toString();
    }
}
