package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.name.FqName;
import kotlin.reflect.jvm.internal.impl.name.Name;

/* loaded from: classes3.dex */
public enum PrimitiveType {
    BOOLEAN("Boolean"),
    CHAR("Char"),
    BYTE("Byte"),
    SHORT("Short"),
    INT("Int"),
    FLOAT("Float"),
    LONG("Long"),
    DOUBLE("Double");


    /* renamed from: n */
    public static final Set<PrimitiveType> f63814n = Collections.unmodifiableSet(EnumSet.of(CHAR, BYTE, SHORT, INT, FLOAT, LONG, DOUBLE));

    /* renamed from: b */
    public final Name f63816b;

    /* renamed from: c */
    public final Name f63817c;

    /* renamed from: d */
    public FqName f63818d = null;

    /* renamed from: e */
    public FqName f63819e = null;

    PrimitiveType(String str) {
        this.f63816b = Name.m33211d(str);
        this.f63817c = Name.m33211d(str + "Array");
    }
}
