package com.google.android.gms.internal.p041firebaseauthapi;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'EF2' uses external variables
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
public final class zzacv {

    /* renamed from: c */
    public static final zzacv f16363c;

    /* renamed from: d */
    public static final /* synthetic */ zzacv[] f16364d;

    /* renamed from: b */
    public final zzacw f16365b;

    /* JADX INFO: Fake field, exist only in values array */
    zzacv EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzacv EF2;

    static {
        zzacv zzacvVar = new zzacv("DOUBLE", 0, zzacw.DOUBLE);
        f16363c = zzacvVar;
        zzacv zzacvVar2 = new zzacv("FLOAT", 1, zzacw.FLOAT);
        zzacw zzacwVar = zzacw.LONG;
        zzacv zzacvVar3 = new zzacv("INT64", 2, zzacwVar);
        zzacv zzacvVar4 = new zzacv("UINT64", 3, zzacwVar);
        zzacw zzacwVar2 = zzacw.INT;
        zzacv zzacvVar5 = new zzacv("INT32", 4, zzacwVar2);
        zzacv zzacvVar6 = new zzacv("FIXED64", 5, zzacwVar);
        zzacv zzacvVar7 = new zzacv("FIXED32", 6, zzacwVar2);
        zzacv zzacvVar8 = new zzacv("BOOL", 7, zzacw.BOOLEAN);
        zzacv zzacvVar9 = new zzacv("STRING", 8, zzacw.STRING);
        zzacw zzacwVar3 = zzacw.MESSAGE;
        f16364d = new zzacv[]{zzacvVar, zzacvVar2, zzacvVar3, zzacvVar4, zzacvVar5, zzacvVar6, zzacvVar7, zzacvVar8, zzacvVar9, new zzacv("GROUP", 9, zzacwVar3), new zzacv("MESSAGE", 10, zzacwVar3), new zzacv("BYTES", 11, zzacw.BYTE_STRING), new zzacv("UINT32", 12, zzacwVar2), new zzacv("ENUM", 13, zzacw.ENUM), new zzacv("SFIXED32", 14, zzacwVar2), new zzacv("SFIXED64", 15, zzacwVar), new zzacv("SINT32", 16, zzacwVar2), new zzacv("SINT64", 17, zzacwVar)};
    }

    public zzacv(String str, int i2, zzacw zzacwVar) {
        this.f16365b = zzacwVar;
    }

    public static zzacv[] values() {
        return (zzacv[]) f16364d.clone();
    }
}
