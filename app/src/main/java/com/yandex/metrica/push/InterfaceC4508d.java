package com.yandex.metrica.push;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.metrica.push.impl.C4596r;

/* renamed from: com.yandex.metrica.push.d */
/* loaded from: classes2.dex */
public interface InterfaceC4508d {

    /* renamed from: com.yandex.metrica.push.d$a */
    public static class a {

        /* renamed from: d */
        private static final a f47281d = new a(b.f47285a, null, null);

        /* renamed from: a */
        @NonNull
        public final b f47282a;

        /* renamed from: b */
        @Nullable
        public final String f47283b;

        /* renamed from: c */
        @Nullable
        public final String f47284c;

        private a(@NonNull b bVar, @Nullable String str, @Nullable String str2) {
            this.f47282a = bVar;
            this.f47283b = str;
            this.f47284c = str2;
        }

        @NonNull
        /* renamed from: a */
        public static a m21413a() {
            return f47281d;
        }

        @NonNull
        /* renamed from: a */
        public static a m21414a(@Nullable String str, @Nullable String str2) {
            return new a(b.f47286b, str, str2);
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* renamed from: com.yandex.metrica.push.d$b */
    public static final class b {

        /* renamed from: a */
        public static final b f47285a = new b("SHOW", 0);

        /* renamed from: b */
        public static final b f47286b = new b("SILENCE", 1);

        private b(String str, int i2) {
        }
    }

    @NonNull
    /* renamed from: a */
    a mo21412a(@NonNull C4596r c4596r);
}
