package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import com.yandex.metrica.impl.p023ob.C4172o2;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Objects;

/* renamed from: com.yandex.metrica.impl.ob.V6 */
/* loaded from: classes2.dex */
public class C3687V6 {

    /* renamed from: a */
    @NonNull
    private final C3432L0 f44210a;

    /* renamed from: b */
    @NonNull
    private final C3662U6 f44211b;

    /* renamed from: c */
    @NonNull
    private final Context f44212c;

    /* renamed from: d */
    @NonNull
    private final C3881cn f44213d;

    public C3687V6(@NonNull Context context) {
        this(context, new C3432L0(), new C3662U6(), C3881cn.m19686a(context));
    }

    /* renamed from: a */
    public void m19269a(@NonNull C4172o2.f fVar) {
        File m18469a = this.f44210a.m18469a(this.f44212c, "appmetrica_crashes");
        if (!this.f44211b.m19237a(m18469a)) {
            return;
        }
        C3659U3 m19135a = fVar.m20486a().m19135a();
        String str = m19135a.m19233g() + "-" + m19135a.m19234h();
        C3829an m19687a = this.f44213d.m19687a(str);
        PrintWriter printWriter = null;
        try {
            m19687a.m19590a();
            Objects.requireNonNull(this.f44210a);
            PrintWriter printWriter2 = new PrintWriter(new BufferedOutputStream(new FileOutputStream(new File(m18469a, str))));
            try {
                printWriter2.write(new C3339H7(fVar.m20490b(), fVar.m20486a(), fVar.m20491c()).m18200k());
                C3658U2.m19209a((Closeable) printWriter2);
                m19687a.m19592c();
            } catch (Throwable unused) {
                printWriter = printWriter2;
                C3658U2.m19209a((Closeable) printWriter);
                m19687a.m19592c();
            }
        } catch (Throwable unused2) {
        }
    }

    @VisibleForTesting
    public C3687V6(@NonNull Context context, @NonNull C3432L0 c3432l0, @NonNull C3662U6 c3662u6, @NonNull C3881cn c3881cn) {
        this.f44212c = context;
        this.f44210a = c3432l0;
        this.f44211b = c3662u6;
        this.f44213d = c3881cn;
    }
}
