package kotlin.reflect.jvm.internal.impl.util;

import java.util.Set;
import kotlin.collections.SetsKt;
import kotlin.jvm.JvmField;
import kotlin.reflect.jvm.internal.impl.name.Name;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;

/* compiled from: OperatorNameConventions.kt */
/* loaded from: classes3.dex */
public final class OperatorNameConventions {

    /* renamed from: a */
    @JvmField
    @NotNull
    public static final Name f66443a = Name.m33211d("getValue");

    /* renamed from: b */
    @JvmField
    @NotNull
    public static final Name f66444b = Name.m33211d("setValue");

    /* renamed from: c */
    @JvmField
    @NotNull
    public static final Name f66445c = Name.m33211d("provideDelegate");

    /* renamed from: d */
    @JvmField
    @NotNull
    public static final Name f66446d = Name.m33211d("equals");

    /* renamed from: e */
    @JvmField
    @NotNull
    public static final Name f66447e = Name.m33211d("compareTo");

    /* renamed from: f */
    @JvmField
    @NotNull
    public static final Name f66448f = Name.m33211d("contains");

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final Name f66449g = Name.m33211d("invoke");

    /* renamed from: h */
    @JvmField
    @NotNull
    public static final Name f66450h = Name.m33211d("iterator");

    /* renamed from: i */
    @JvmField
    @NotNull
    public static final Name f66451i = Name.m33211d("get");

    /* renamed from: j */
    @JvmField
    @NotNull
    public static final Name f66452j = Name.m33211d("set");

    /* renamed from: k */
    @JvmField
    @NotNull
    public static final Name f66453k = Name.m33211d("next");

    /* renamed from: l */
    @JvmField
    @NotNull
    public static final Name f66454l = Name.m33211d("hasNext");

    /* renamed from: m */
    @JvmField
    @NotNull
    public static final Regex f66455m = new Regex("component\\d+");

    /* renamed from: n */
    @JvmField
    @NotNull
    public static final Name f66456n;

    /* renamed from: o */
    @JvmField
    @NotNull
    public static final Name f66457o;

    /* renamed from: p */
    @JvmField
    @NotNull
    public static final Name f66458p;

    /* renamed from: q */
    @JvmField
    @NotNull
    public static final Set<Name> f66459q;

    /* renamed from: r */
    @JvmField
    @NotNull
    public static final Set<Name> f66460r;

    /* renamed from: s */
    @JvmField
    @NotNull
    public static final Set<Name> f66461s;

    static {
        Name m33211d = Name.m33211d("inc");
        f66456n = m33211d;
        Name m33211d2 = Name.m33211d("dec");
        f66457o = m33211d2;
        Name m33211d3 = Name.m33211d("plus");
        Name m33211d4 = Name.m33211d("minus");
        Name m33211d5 = Name.m33211d("not");
        Name m33211d6 = Name.m33211d("unaryMinus");
        Name m33211d7 = Name.m33211d("unaryPlus");
        Name m33211d8 = Name.m33211d("times");
        Name m33211d9 = Name.m33211d("div");
        Name m33211d10 = Name.m33211d("mod");
        Name m33211d11 = Name.m33211d("rem");
        Name m33211d12 = Name.m33211d("rangeTo");
        f66458p = m33211d12;
        Name m33211d13 = Name.m33211d("timesAssign");
        Name m33211d14 = Name.m33211d("divAssign");
        Name m33211d15 = Name.m33211d("modAssign");
        Name m33211d16 = Name.m33211d("remAssign");
        Name m33211d17 = Name.m33211d("plusAssign");
        Name m33211d18 = Name.m33211d("minusAssign");
        SetsKt.m32080g(m33211d, m33211d2, m33211d7, m33211d6, m33211d5);
        f66459q = SetsKt.m32080g(m33211d7, m33211d6, m33211d5);
        f66460r = SetsKt.m32080g(m33211d8, m33211d3, m33211d4, m33211d9, m33211d10, m33211d11, m33211d12);
        f66461s = SetsKt.m32080g(m33211d13, m33211d14, m33211d15, m33211d16, m33211d17, m33211d18);
    }
}
