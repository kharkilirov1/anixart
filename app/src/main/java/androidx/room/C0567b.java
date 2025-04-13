package androidx.room;

import androidx.arch.core.util.Function;
import androidx.sqlite.p004db.SupportSQLiteDatabase;
import androidx.sqlite.p004db.SupportSQLiteStatement;

/* compiled from: R8$$SyntheticClass */
/* renamed from: androidx.room.b */
/* loaded from: classes.dex */
public final /* synthetic */ class C0567b implements Function {

    /* renamed from: b */
    public static final /* synthetic */ C0567b f5896b = new C0567b(0);

    /* renamed from: c */
    public static final /* synthetic */ C0567b f5897c = new C0567b(1);

    /* renamed from: d */
    public static final /* synthetic */ C0567b f5898d = new C0567b(2);

    /* renamed from: e */
    public static final /* synthetic */ C0567b f5899e = new C0567b(3);

    /* renamed from: f */
    public static final /* synthetic */ C0567b f5900f = new C0567b(4);

    /* renamed from: g */
    public static final /* synthetic */ C0567b f5901g = new C0567b(5);

    /* renamed from: h */
    public static final /* synthetic */ C0567b f5902h = new C0567b(6);

    /* renamed from: a */
    public final /* synthetic */ int f5903a;

    public /* synthetic */ C0567b(int i2) {
        this.f5903a = i2;
    }

    @Override // androidx.arch.core.util.Function
    public final Object apply(Object obj) {
        switch (this.f5903a) {
            case 0:
                return null;
            case 1:
                return Boolean.valueOf(((SupportSQLiteDatabase) obj).mo4036W0());
            case 2:
                return Boolean.valueOf(((SupportSQLiteDatabase) obj).mo4035Q0());
            case 3:
                return ((SupportSQLiteDatabase) obj).mo4030E();
            case 4:
                return ((SupportSQLiteDatabase) obj).mo4041t();
            case 5:
                return Long.valueOf(((SupportSQLiteStatement) obj).mo4049h1());
            default:
                return Integer.valueOf(((SupportSQLiteStatement) obj).mo4045K());
        }
    }
}
