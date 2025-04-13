package kotlin.reflect.jvm.internal.impl.utils;

import androidx.emoji2.text.flatbuffer.C0321a;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.TypeCastException;
import kotlin.collections.EmptyMap;
import kotlin.jvm.JvmField;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p000a.C0000a;

/* compiled from: Jsr305State.kt */
/* loaded from: classes3.dex */
public final class Jsr305State {

    /* renamed from: f */
    public static final /* synthetic */ KProperty[] f66491f = {Reflection.m32197e(new PropertyReference1Impl(Reflection.m32193a(Jsr305State.class), "description", "getDescription()[Ljava/lang/String;"))};

    /* renamed from: g */
    @JvmField
    @NotNull
    public static final Jsr305State f66492g;

    /* renamed from: a */
    @NotNull
    public final Lazy f66493a;

    /* renamed from: b */
    @NotNull
    public final ReportLevel f66494b;

    /* renamed from: c */
    @Nullable
    public final ReportLevel f66495c;

    /* renamed from: d */
    @NotNull
    public final Map<String, ReportLevel> f66496d;

    /* renamed from: e */
    public final boolean f66497e;

    /* compiled from: Jsr305State.kt */
    public static final class Companion {
    }

    static {
        Map map;
        Map map2;
        Map map3;
        ReportLevel reportLevel = ReportLevel.WARN;
        map = EmptyMap.f63145b;
        new Jsr305State(reportLevel, null, map, false, 8);
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        map2 = EmptyMap.f63145b;
        f66492g = new Jsr305State(reportLevel2, reportLevel2, map2, false, 8);
        ReportLevel reportLevel3 = ReportLevel.STRICT;
        map3 = EmptyMap.f63145b;
        new Jsr305State(reportLevel3, reportLevel3, map3, false, 8);
    }

    public Jsr305State(ReportLevel global, ReportLevel reportLevel, Map map, boolean z, int i2) {
        z = (i2 & 8) != 0 ? true : z;
        Intrinsics.m32180i(global, "global");
        this.f66494b = global;
        this.f66495c = reportLevel;
        this.f66496d = map;
        this.f66497e = z;
        this.f66493a = LazyKt.m31881b(new Function0<String[]>() { // from class: kotlin.reflect.jvm.internal.impl.utils.Jsr305State$description$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public String[] invoke() {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Jsr305State.this.f66494b.f66505b);
                ReportLevel reportLevel2 = Jsr305State.this.f66495c;
                if (reportLevel2 != null) {
                    StringBuilder m24u = C0000a.m24u("under-migration:");
                    m24u.append(reportLevel2.f66505b);
                    arrayList.add(m24u.toString());
                }
                for (Map.Entry<String, ReportLevel> entry : Jsr305State.this.f66496d.entrySet()) {
                    StringBuilder m2872a = C0321a.m2872a('@');
                    m2872a.append(entry.getKey());
                    m2872a.append(':');
                    m2872a.append(entry.getValue().f66505b);
                    arrayList.add(m2872a.toString());
                }
                Object[] array = arrayList.toArray(new String[0]);
                if (array != null) {
                    return (String[]) array;
                }
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        });
    }

    /* renamed from: a */
    public final boolean m33779a() {
        return this == f66492g;
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof Jsr305State) {
                Jsr305State jsr305State = (Jsr305State) obj;
                if (Intrinsics.m32174c(this.f66494b, jsr305State.f66494b) && Intrinsics.m32174c(this.f66495c, jsr305State.f66495c) && Intrinsics.m32174c(this.f66496d, jsr305State.f66496d)) {
                    if (this.f66497e == jsr305State.f66497e) {
                    }
                }
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        ReportLevel reportLevel = this.f66494b;
        int hashCode = (reportLevel != null ? reportLevel.hashCode() : 0) * 31;
        ReportLevel reportLevel2 = this.f66495c;
        int hashCode2 = (hashCode + (reportLevel2 != null ? reportLevel2.hashCode() : 0)) * 31;
        Map<String, ReportLevel> map = this.f66496d;
        int hashCode3 = (hashCode2 + (map != null ? map.hashCode() : 0)) * 31;
        boolean z = this.f66497e;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return hashCode3 + i2;
    }

    @NotNull
    public String toString() {
        StringBuilder m24u = C0000a.m24u("Jsr305State(global=");
        m24u.append(this.f66494b);
        m24u.append(", migration=");
        m24u.append(this.f66495c);
        m24u.append(", user=");
        m24u.append(this.f66496d);
        m24u.append(", enableCompatqualCheckerFrameworkAnnotations=");
        m24u.append(this.f66497e);
        m24u.append(")");
        return m24u.toString();
    }
}
