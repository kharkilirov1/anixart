package com.yandex.metrica.impl.p023ob;

import android.os.FileObserver;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import java.io.File;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.T6 */
/* loaded from: classes2.dex */
public class FileObserverC3637T6 extends FileObserver {

    /* renamed from: a */
    private final InterfaceC3678Um<File> f44065a;

    /* renamed from: b */
    private final File f44066b;

    /* renamed from: c */
    @NonNull
    private final C3432L0 f44067c;

    public FileObserverC3637T6(@NonNull File file, @NonNull InterfaceC3678Um<File> interfaceC3678Um) {
        this(file, interfaceC3678Um, new C3432L0());
    }

    @Override // android.os.FileObserver
    public void onEvent(int i2, @Nullable String str) {
        if (i2 != 8 || TextUtils.isEmpty(str)) {
            return;
        }
        InterfaceC3678Um<File> interfaceC3678Um = this.f44065a;
        C3432L0 c3432l0 = this.f44067c;
        File file = this.f44066b;
        Objects.requireNonNull(c3432l0);
        interfaceC3678Um.mo17875b(new File(file, str));
    }

    @VisibleForTesting
    public FileObserverC3637T6(@NonNull File file, @NonNull InterfaceC3678Um<File> interfaceC3678Um, @NonNull C3432L0 c3432l0) {
        super(file.getAbsolutePath(), 8);
        this.f44065a = interfaceC3678Um;
        this.f44066b = file;
        this.f44067c = c3432l0;
    }
}
