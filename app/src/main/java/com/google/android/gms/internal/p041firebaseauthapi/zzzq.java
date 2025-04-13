package com.google.android.gms.internal.p041firebaseauthapi;

import java.util.Objects;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF6' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:451)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByRegister(EnumVisitor.java:395)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:324)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:262)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:151)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: com.google.firebase:firebase-auth@@21.0.6 */
/* loaded from: classes.dex */
public final class zzzq {

    /* renamed from: c */
    public static final zzzq f17159c;

    /* renamed from: d */
    public static final zzzq f17160d;

    /* renamed from: e */
    public static final zzzq[] f17161e;

    /* renamed from: f */
    public static final /* synthetic */ zzzq[] f17162f;

    /* renamed from: b */
    public final int f17163b;

    /* JADX INFO: Fake field, exist only in values array */
    zzzq EF6;

    static {
        zzaag zzaagVar = zzaag.f16266h;
        zzzq zzzqVar = new zzzq("DOUBLE", 0, 0, 1, zzaagVar);
        zzaag zzaagVar2 = zzaag.f16265g;
        zzzq zzzqVar2 = new zzzq("FLOAT", 1, 1, 1, zzaagVar2);
        zzaag zzaagVar3 = zzaag.f16264f;
        zzzq zzzqVar3 = new zzzq("INT64", 2, 2, 1, zzaagVar3);
        zzzq zzzqVar4 = new zzzq("UINT64", 3, 3, 1, zzaagVar3);
        zzaag zzaagVar4 = zzaag.f16263e;
        zzzq zzzqVar5 = new zzzq("INT32", 4, 4, 1, zzaagVar4);
        zzzq zzzqVar6 = new zzzq("FIXED64", 5, 5, 1, zzaagVar3);
        zzzq zzzqVar7 = new zzzq("FIXED32", 6, 6, 1, zzaagVar4);
        zzaag zzaagVar5 = zzaag.f16267i;
        zzzq zzzqVar8 = new zzzq("BOOL", 7, 7, 1, zzaagVar5);
        zzaag zzaagVar6 = zzaag.f16268j;
        zzzq zzzqVar9 = new zzzq("STRING", 8, 8, 1, zzaagVar6);
        zzaag zzaagVar7 = zzaag.f16271m;
        zzzq zzzqVar10 = new zzzq("MESSAGE", 9, 9, 1, zzaagVar7);
        zzaag zzaagVar8 = zzaag.f16269k;
        zzzq zzzqVar11 = new zzzq("BYTES", 10, 10, 1, zzaagVar8);
        zzzq zzzqVar12 = new zzzq("UINT32", 11, 11, 1, zzaagVar4);
        zzaag zzaagVar9 = zzaag.f16270l;
        zzzq zzzqVar13 = new zzzq("ENUM", 12, 12, 1, zzaagVar9);
        zzzq zzzqVar14 = new zzzq("SFIXED32", 13, 13, 1, zzaagVar4);
        zzzq zzzqVar15 = new zzzq("SFIXED64", 14, 14, 1, zzaagVar3);
        zzzq zzzqVar16 = new zzzq("SINT32", 15, 15, 1, zzaagVar4);
        zzzq zzzqVar17 = new zzzq("SINT64", 16, 16, 1, zzaagVar3);
        zzzq zzzqVar18 = new zzzq("GROUP", 17, 17, 1, zzaagVar7);
        zzzq zzzqVar19 = new zzzq("DOUBLE_LIST", 18, 18, 2, zzaagVar);
        zzzq zzzqVar20 = new zzzq("FLOAT_LIST", 19, 19, 2, zzaagVar2);
        zzzq zzzqVar21 = new zzzq("INT64_LIST", 20, 20, 2, zzaagVar3);
        zzzq zzzqVar22 = new zzzq("UINT64_LIST", 21, 21, 2, zzaagVar3);
        zzzq zzzqVar23 = new zzzq("INT32_LIST", 22, 22, 2, zzaagVar4);
        zzzq zzzqVar24 = new zzzq("FIXED64_LIST", 23, 23, 2, zzaagVar3);
        zzzq zzzqVar25 = new zzzq("FIXED32_LIST", 24, 24, 2, zzaagVar4);
        zzzq zzzqVar26 = new zzzq("BOOL_LIST", 25, 25, 2, zzaagVar5);
        zzzq zzzqVar27 = new zzzq("STRING_LIST", 26, 26, 2, zzaagVar6);
        zzzq zzzqVar28 = new zzzq("MESSAGE_LIST", 27, 27, 2, zzaagVar7);
        zzzq zzzqVar29 = new zzzq("BYTES_LIST", 28, 28, 2, zzaagVar8);
        zzzq zzzqVar30 = new zzzq("UINT32_LIST", 29, 29, 2, zzaagVar4);
        zzzq zzzqVar31 = new zzzq("ENUM_LIST", 30, 30, 2, zzaagVar9);
        zzzq zzzqVar32 = new zzzq("SFIXED32_LIST", 31, 31, 2, zzaagVar4);
        zzzq zzzqVar33 = new zzzq("SFIXED64_LIST", 32, 32, 2, zzaagVar3);
        zzzq zzzqVar34 = new zzzq("SINT32_LIST", 33, 33, 2, zzaagVar4);
        zzzq zzzqVar35 = new zzzq("SINT64_LIST", 34, 34, 2, zzaagVar3);
        zzzq zzzqVar36 = new zzzq("DOUBLE_LIST_PACKED", 35, 35, 3, zzaagVar);
        f17159c = zzzqVar36;
        zzzq zzzqVar37 = new zzzq("FLOAT_LIST_PACKED", 36, 36, 3, zzaagVar2);
        zzzq zzzqVar38 = new zzzq("INT64_LIST_PACKED", 37, 37, 3, zzaagVar3);
        zzzq zzzqVar39 = new zzzq("UINT64_LIST_PACKED", 38, 38, 3, zzaagVar3);
        zzzq zzzqVar40 = new zzzq("INT32_LIST_PACKED", 39, 39, 3, zzaagVar4);
        zzzq zzzqVar41 = new zzzq("FIXED64_LIST_PACKED", 40, 40, 3, zzaagVar3);
        zzzq zzzqVar42 = new zzzq("FIXED32_LIST_PACKED", 41, 41, 3, zzaagVar4);
        zzzq zzzqVar43 = new zzzq("BOOL_LIST_PACKED", 42, 42, 3, zzaagVar5);
        zzzq zzzqVar44 = new zzzq("UINT32_LIST_PACKED", 43, 43, 3, zzaagVar4);
        zzzq zzzqVar45 = new zzzq("ENUM_LIST_PACKED", 44, 44, 3, zzaagVar9);
        zzzq zzzqVar46 = new zzzq("SFIXED32_LIST_PACKED", 45, 45, 3, zzaagVar4);
        zzzq zzzqVar47 = new zzzq("SFIXED64_LIST_PACKED", 46, 46, 3, zzaagVar3);
        zzzq zzzqVar48 = new zzzq("SINT32_LIST_PACKED", 47, 47, 3, zzaagVar4);
        zzzq zzzqVar49 = new zzzq("SINT64_LIST_PACKED", 48, 48, 3, zzaagVar3);
        f17160d = zzzqVar49;
        f17162f = new zzzq[]{zzzqVar, zzzqVar2, zzzqVar3, zzzqVar4, zzzqVar5, zzzqVar6, zzzqVar7, zzzqVar8, zzzqVar9, zzzqVar10, zzzqVar11, zzzqVar12, zzzqVar13, zzzqVar14, zzzqVar15, zzzqVar16, zzzqVar17, zzzqVar18, zzzqVar19, zzzqVar20, zzzqVar21, zzzqVar22, zzzqVar23, zzzqVar24, zzzqVar25, zzzqVar26, zzzqVar27, zzzqVar28, zzzqVar29, zzzqVar30, zzzqVar31, zzzqVar32, zzzqVar33, zzzqVar34, zzzqVar35, zzzqVar36, zzzqVar37, zzzqVar38, zzzqVar39, zzzqVar40, zzzqVar41, zzzqVar42, zzzqVar43, zzzqVar44, zzzqVar45, zzzqVar46, zzzqVar47, zzzqVar48, zzzqVar49, new zzzq("GROUP_LIST", 49, 49, 2, zzaagVar7), new zzzq("MAP", 50, 50, 4, zzaag.f16262d)};
        zzzq[] values = values();
        f17161e = new zzzq[values.length];
        for (zzzq zzzqVar50 : values) {
            f17161e[zzzqVar50.f17163b] = zzzqVar50;
        }
    }

    public zzzq(String str, int i2, int i3, int i4, zzaag zzaagVar) {
        this.f17163b = i3;
        zzaag zzaagVar2 = zzaag.f16262d;
        int i5 = i4 - 1;
        if (i5 == 1) {
            Objects.requireNonNull(zzaagVar);
        } else if (i5 == 3) {
            Objects.requireNonNull(zzaagVar);
        }
        if (i4 == 1) {
            zzaagVar.ordinal();
        }
    }

    public static zzzq[] values() {
        return (zzzq[]) f17162f.clone();
    }
}
