package com.yandex.metrica.impl.p023ob;

import android.os.FileObserver;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import java.io.File;

/* renamed from: com.yandex.metrica.impl.ob.G7 */
/* loaded from: classes2.dex */
public class C3314G7 {

    /* renamed from: a */
    @NonNull
    private final FileObserver f42978a;

    /* renamed from: b */
    @NonNull
    private final File f42979b;

    /* renamed from: c */
    @NonNull
    private final C3662U6 f42980c;

    public C3314G7(@NonNull File file, @NonNull InterfaceC3678Um<File> interfaceC3678Um) {
        this(new FileObserverC3637T6(file, interfaceC3678Um), file, new C3662U6());
    }

    /* renamed from: a */
    public void m18130a() {
        this.f42980c.m19237a(this.f42979b);
        this.f42978a.startWatching();
    }

    @VisibleForTesting
    public C3314G7(@NonNull FileObserver fileObserver, @NonNull File file, @NonNull C3662U6 c3662u6) {
        this.f42978a = fileObserver;
        this.f42979b = file;
        this.f42980c = c3662u6;
    }
}
