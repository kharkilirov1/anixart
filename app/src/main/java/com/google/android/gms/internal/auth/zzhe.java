package com.google.android.gms.internal.auth;

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
/* compiled from: com.google.android.gms:play-services-auth-base@@17.1.4 */
/* loaded from: classes.dex */
public final class zzhe {

    /* renamed from: c */
    public static final zzhe f16186c;

    /* renamed from: d */
    public static final /* synthetic */ zzhe[] f16187d;

    /* renamed from: b */
    public final zzhf f16188b;

    /* JADX INFO: Fake field, exist only in values array */
    zzhe EF1;

    /* JADX INFO: Fake field, exist only in values array */
    zzhe EF2;

    static {
        zzhe zzheVar = new zzhe("DOUBLE", 0, zzhf.DOUBLE);
        f16186c = zzheVar;
        zzhe zzheVar2 = new zzhe("FLOAT", 1, zzhf.FLOAT);
        zzhf zzhfVar = zzhf.LONG;
        zzhe zzheVar3 = new zzhe("INT64", 2, zzhfVar);
        zzhe zzheVar4 = new zzhe("UINT64", 3, zzhfVar);
        zzhf zzhfVar2 = zzhf.INT;
        zzhe zzheVar5 = new zzhe("INT32", 4, zzhfVar2);
        zzhe zzheVar6 = new zzhe("FIXED64", 5, zzhfVar);
        zzhe zzheVar7 = new zzhe("FIXED32", 6, zzhfVar2);
        zzhe zzheVar8 = new zzhe("BOOL", 7, zzhf.BOOLEAN);
        zzhe zzheVar9 = new zzhe("STRING", 8, zzhf.STRING);
        zzhf zzhfVar3 = zzhf.MESSAGE;
        f16187d = new zzhe[]{zzheVar, zzheVar2, zzheVar3, zzheVar4, zzheVar5, zzheVar6, zzheVar7, zzheVar8, zzheVar9, new zzhe("GROUP", 9, zzhfVar3), new zzhe("MESSAGE", 10, zzhfVar3), new zzhe("BYTES", 11, zzhf.BYTE_STRING), new zzhe("UINT32", 12, zzhfVar2), new zzhe("ENUM", 13, zzhf.ENUM), new zzhe("SFIXED32", 14, zzhfVar2), new zzhe("SFIXED64", 15, zzhfVar), new zzhe("SINT32", 16, zzhfVar2), new zzhe("SINT64", 17, zzhfVar)};
    }

    public zzhe(String str, int i2, zzhf zzhfVar) {
        this.f16188b = zzhfVar;
    }

    public static zzhe[] values() {
        return (zzhe[]) f16187d.clone();
    }
}
