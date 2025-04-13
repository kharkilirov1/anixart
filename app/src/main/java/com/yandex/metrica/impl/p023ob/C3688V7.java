package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.V7 */
/* loaded from: classes2.dex */
public class C3688V7 implements InterfaceC3464M7<File> {

    /* renamed from: a */
    @NonNull
    private final Context f44214a;

    /* renamed from: b */
    @Nullable
    private final File f44215b;

    /* renamed from: c */
    @NonNull
    private final C3316G9 f44216c;

    /* renamed from: d */
    @NonNull
    private final C3432L0 f44217d;

    /* renamed from: e */
    @NonNull
    private final C3564Q7 f44218e;

    /* renamed from: f */
    @NonNull
    private final InterfaceC3489N7<String> f44219f;

    /* renamed from: g */
    @NonNull
    private final InterfaceExecutorC4297sn f44220g;

    /* renamed from: com.yandex.metrica.impl.ob.V7$a */
    public static class a implements InterfaceC3678Um<File> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull File file) {
            file.delete();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V7$b */
    public static class b implements InterfaceC3678Um<String> {

        /* renamed from: a */
        @NonNull
        private final InterfaceC3489N7<String> f44221a;

        public b(@NonNull InterfaceC3489N7<String> interfaceC3489N7) {
            this.f44221a = interfaceC3489N7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f44221a.mo18611b(str2);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.V7$c */
    public static class c implements InterfaceC3678Um<String> {

        /* renamed from: a */
        @NonNull
        private final InterfaceC3489N7<String> f44222a;

        public c(@NonNull InterfaceC3489N7<String> interfaceC3489N7) {
            this.f44222a = interfaceC3489N7;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3678Um
        /* renamed from: b */
        public void mo17875b(@NonNull String str) {
            String str2 = str;
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            this.f44222a.mo18610a(str2);
        }
    }

    @VisibleForTesting
    public C3688V7(@NonNull Context context, @NonNull C3432L0 c3432l0, @NonNull C3564Q7 c3564q7, @NonNull InterfaceC3489N7<String> interfaceC3489N7, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull C3316G9 c3316g9) {
        this.f44214a = context;
        this.f44217d = c3432l0;
        this.f44215b = c3432l0.m18471b(context);
        this.f44218e = c3564q7;
        this.f44219f = interfaceC3489N7;
        this.f44220g = interfaceExecutorC4297sn;
        this.f44216c = c3316g9;
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3464M7
    /* renamed from: a */
    public void mo18574a(@NonNull File file) {
        b bVar = new b(this.f44219f);
        ((C4271rn) this.f44220g).execute(new RunnableC3839b7(file, this.f44218e, new a(), bVar));
    }

    /* renamed from: a, reason: avoid collision after fix types in other method */
    private void a2(@Nullable File file) {
        File[] fileArr;
        if (file == null || !file.exists()) {
            fileArr = new File[0];
        } else {
            fileArr = file.listFiles(new C3663U7(this));
            if (fileArr == null) {
                fileArr = new File[0];
            }
        }
        for (File file2 : fileArr) {
            ((C4271rn) this.f44220g).execute(new RunnableC3839b7(file2, this.f44218e, new a(), new c(this.f44219f)));
        }
    }

    @Override // com.yandex.metrica.impl.p023ob.InterfaceC3464M7
    /* renamed from: a */
    public synchronized void mo18573a() {
        File m18472b;
        if (C3658U2.m19211a(21) && (m18472b = this.f44217d.m18472b(this.f44214a.getFilesDir(), "YandexMetricaNativeCrashes")) != null) {
            if (this.f44216c.m18153n()) {
                if (m18472b.exists()) {
                    try {
                        m18472b.delete();
                    } catch (Throwable unused) {
                    }
                }
            } else {
                a2(m18472b);
                this.f44216c.m18154o();
            }
        }
        a2(this.f44215b);
    }
}
