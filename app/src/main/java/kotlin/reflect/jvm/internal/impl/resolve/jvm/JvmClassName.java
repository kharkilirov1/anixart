package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import com.fasterxml.jackson.core.JsonPointer;
import kotlin.reflect.jvm.internal.impl.name.ClassId;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class JvmClassName {

    /* renamed from: a */
    public final String f65940a;

    public JvmClassName(@NotNull String str) {
        this.f65940a = str;
    }

    @NotNull
    /* renamed from: a */
    public static JvmClassName m33543a(@NotNull ClassId classId) {
        FqName fqName = classId.f65593a;
        String replace = classId.f65594b.f65597a.f65602a.replace('.', '$');
        if (fqName.m33197b()) {
            return new JvmClassName(replace);
        }
        return new JvmClassName(fqName.f65597a.f65602a.replace('.', JsonPointer.SEPARATOR) + "/" + replace);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f65940a.equals(((JvmClassName) obj).f65940a);
    }

    public int hashCode() {
        return this.f65940a.hashCode();
    }

    public String toString() {
        return this.f65940a;
    }
}
