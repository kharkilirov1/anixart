package com.yandex.metrica.impl.p023ob;

import android.content.ContentValues;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.CounterConfiguration;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.s8 */
/* loaded from: classes2.dex */
public class C4282s8 {

    /* renamed from: a */
    @NonNull
    private final CounterConfiguration.EnumC3079b f46348a;

    /* renamed from: b */
    @Nullable
    private final C3234D2 f46349b;

    /* renamed from: com.yandex.metrica.impl.ob.s8$a */
    public static class a {

        /* renamed from: a */
        @Nullable
        public final List<ContentValues> f46350a;

        /* renamed from: b */
        public final int f46351b;

        public a(@Nullable List<ContentValues> list, int i2) {
            this.f46350a = list;
            this.f46351b = i2;
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.s8$b */
    public enum b {
        BAD_REQUEST("bad_request"),
        DB_OVERFLOW("db_overflow");


        /* renamed from: a */
        private final String f46355a;

        b(String str) {
            this.f46355a = str;
        }
    }

    public C4282s8(@NonNull CounterConfiguration.EnumC3079b enumC3079b) {
        this(enumC3079b, C3532P0.m18696i().m18715r());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0134  */
    @androidx.annotation.NonNull
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.yandex.metrica.impl.p023ob.C4282s8.a m20687a(@androidx.annotation.NonNull android.database.sqlite.SQLiteDatabase r18, @androidx.annotation.NonNull java.lang.String r19, @androidx.annotation.NonNull java.lang.String r20, @androidx.annotation.NonNull com.yandex.metrica.impl.p023ob.C4282s8.b r21, @androidx.annotation.Nullable java.lang.String r22, boolean r23) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C4282s8.m20687a(android.database.sqlite.SQLiteDatabase, java.lang.String, java.lang.String, com.yandex.metrica.impl.ob.s8$b, java.lang.String, boolean):com.yandex.metrica.impl.ob.s8$a");
    }

    @VisibleForTesting
    public C4282s8(@NonNull CounterConfiguration.EnumC3079b enumC3079b, @Nullable C3234D2 c3234d2) {
        this.f46348a = enumC3079b;
        this.f46349b = c3234d2;
    }
}
