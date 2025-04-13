package com.yandex.metrica.impl.p023ob;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.yandex.metrica.impl.p022ac.CrashpadHelper;
import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Callable;

@RequiresApi
/* renamed from: com.yandex.metrica.impl.ob.g8 */
/* loaded from: classes2.dex */
public class C3970g8 {

    /* renamed from: m */
    private static final Set<String> f45182m;

    /* renamed from: a */
    @NonNull
    private final Context f45183a;

    /* renamed from: b */
    @NonNull
    private final InterfaceExecutorC4297sn f45184b;

    /* renamed from: c */
    @Nullable
    private final File f45185c;

    /* renamed from: d */
    @NonNull
    private final List<String> f45186d;

    /* renamed from: e */
    @Nullable
    private final File f45187e;

    /* renamed from: f */
    @Nullable
    private final File f45188f;

    /* renamed from: g */
    @NonNull
    private final InterfaceC3703Vm<Void, String> f45189g;

    /* renamed from: h */
    @NonNull
    private final C4192om f45190h;

    /* renamed from: i */
    @NonNull
    private final C3944f8 f45191i;

    /* renamed from: j */
    @NonNull
    private final Callable<String> f45192j;

    /* renamed from: k */
    @NonNull
    private final C3763Y7 f45193k;

    /* renamed from: l */
    @NonNull
    private final C3432L0 f45194l;

    /* renamed from: com.yandex.metrica.impl.ob.g8$a */
    public class a implements InterfaceC3703Vm<Void, String> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public String mo17917a(Void r1) {
            return CrashpadHelper.getLibraryVersion();
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.g8$b */
    public class b implements Callable<String> {
        @Override // java.util.concurrent.Callable
        public String call() throws Exception {
            return CrashpadHelper.getLibDirInsideApk();
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.g8$c */
    public static class c implements InterfaceC3703Vm<File, Boolean> {
        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public /* bridge */ /* synthetic */ Boolean mo17917a(File file) {
            return Boolean.TRUE;
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.metrica.impl.ob.g8$d */
    public static class d implements InterfaceC3703Vm<File, Boolean> {

        /* renamed from: a */
        private final String f45195a;

        public d(String str) {
            this.f45195a = str;
        }

        @Override // com.yandex.metrica.impl.p023ob.InterfaceC3703Vm
        /* renamed from: a */
        public Boolean mo17917a(File file) {
            return Boolean.valueOf(!file.getName().endsWith(this.f45195a));
        }
    }

    static {
        HashSet hashSet = new HashSet();
        f45182m = hashSet;
        hashSet.add("armeabi-v7a");
        hashSet.add("arm64-v8a");
        hashSet.add("x86");
        hashSet.add("x86_64");
    }

    public C3970g8(@NonNull Context context, @NonNull C3432L0 c3432l0, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn) {
        this(context, c3432l0, interfaceExecutorC4297sn, Arrays.asList("libappmetrica_crashpad_handler.so", "libappmetrica_handler.so"));
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.yandex.metrica.impl.p023ob.C4074k8 m19952a() {
        /*
            r10 = this;
            java.io.File r0 = r10.f45185c
            r1 = 1
            r2 = 0
            if (r0 == 0) goto Lf
            boolean r0 = r0.exists()
            if (r0 != 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            r3 = 0
            if (r0 == 0) goto La8
            android.os.SystemClock.elapsedRealtime()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r4 = "-"
            r0.append(r4)
            com.yandex.metrica.impl.ob.Vm<java.lang.Void, java.lang.String> r4 = r10.f45189g
            java.lang.Object r4 = r4.mo17917a(r3)
            java.lang.String r4 = (java.lang.String) r4
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            com.yandex.metrica.impl.ob.om r4 = r10.f45190h
            java.lang.String r4 = r4.m20516a()
            if (r4 == 0) goto La7
            java.io.File r5 = r10.f45188f
            if (r5 != 0) goto L3c
            goto L5d
        L3c:
            boolean r5 = r5.exists()
            if (r5 != 0) goto L5f
            java.io.File r5 = r10.f45188f
            boolean r5 = r5.mkdirs()
            if (r5 != 0) goto L4b
            goto L5d
        L4b:
            java.io.File r5 = r10.f45187e
            if (r5 == 0) goto L5d
            boolean r5 = r5.setExecutable(r1, r2)
            if (r5 != 0) goto L56
            goto L5d
        L56:
            java.io.File r5 = r10.f45188f
            boolean r5 = r5.setExecutable(r1, r2)
            goto L60
        L5d:
            r5 = 0
            goto L60
        L5f:
            r5 = 1
        L60:
            if (r5 == 0) goto La7
            com.yandex.metrica.impl.ob.g8$d r5 = new com.yandex.metrica.impl.ob.g8$d
            r5.<init>(r0)
            com.yandex.metrica.impl.ob.sn r6 = r10.f45184b
            com.yandex.metrica.impl.ob.h8 r7 = new com.yandex.metrica.impl.ob.h8
            r7.<init>(r10, r5)
            com.yandex.metrica.impl.ob.rn r6 = (com.yandex.metrica.impl.p023ob.C4271rn) r6
            r6.execute(r7)
            java.util.List<java.lang.String> r5 = r10.f45186d
            java.util.Iterator r5 = r5.iterator()
        L79:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto La7
            java.lang.Object r6 = r5.next()
            java.lang.String r6 = (java.lang.String) r6
            com.yandex.metrica.impl.ob.f8 r7 = r10.f45191i
            r8 = 2
            java.lang.Object[] r8 = new java.lang.Object[r8]
            r8[r2] = r4
            r8[r1] = r6
            java.lang.String r9 = "lib/%s/%s"
            java.lang.String r8 = java.lang.String.format(r9, r8)
            java.lang.String r6 = p000a.C0000a.m14k(r6, r0)
            java.lang.String r6 = r7.m19895a(r8, r6)
            android.os.SystemClock.elapsedRealtime()
            if (r6 == 0) goto L79
            com.yandex.metrica.impl.ob.k8 r0 = new com.yandex.metrica.impl.ob.k8
            r0.<init>(r6, r2, r3)
            r3 = r0
        La7:
            return r3
        La8:
            java.io.File r0 = r10.f45185c
            java.lang.String r0 = r0.getAbsolutePath()
            com.yandex.metrica.impl.ob.k8 r1 = new com.yandex.metrica.impl.ob.k8
            r1.<init>(r0, r2, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.p023ob.C3970g8.m19952a():com.yandex.metrica.impl.ob.k8");
    }

    @Nullable
    /* renamed from: c */
    private File m19953c() {
        String str;
        try {
            str = this.f45192j.call();
        } catch (Throwable unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Objects.requireNonNull(this.f45194l);
        return new File(str);
    }

    @Nullable
    @WorkerThread
    /* renamed from: b */
    public C4074k8 m19955b() {
        C3738X7 c3738x7;
        C4074k8 c4074k8 = null;
        if (C3658U2.m19211a(29)) {
            File m19953c = m19953c();
            if (m19953c == null) {
                return null;
            }
            for (String str : this.f45186d) {
                Objects.requireNonNull(this.f45194l);
                File file = new File(m19953c, str);
                if (file.exists()) {
                    return new C4074k8(file.getAbsolutePath(), true, null);
                }
            }
            return null;
        }
        if (!C3658U2.m19211a(23)) {
            return m19952a();
        }
        C3763Y7 c3763y7 = this.f45193k;
        Context context = this.f45183a;
        String m20516a = this.f45190h.m20516a();
        Objects.requireNonNull(c3763y7);
        try {
            String[] m20355a = AbstractC4100l8.m20355a(context, m20516a);
            c3738x7 = new C3738X7(m20355a[0], m20355a[1], Environment.getDataDirectory().getAbsolutePath());
        } catch (Throwable unused) {
            c3738x7 = null;
        }
        if (c3738x7 != null) {
            File m19953c2 = m19953c();
            if (m19953c2 != null) {
                Iterator<String> it = this.f45186d.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String next = it.next();
                    Objects.requireNonNull(this.f45194l);
                    File file2 = new File(m19953c2, next);
                    if (file2.exists()) {
                        c4074k8 = new C4074k8(file2.getAbsolutePath(), false, c3738x7);
                        break;
                    }
                }
            } else {
                c4074k8 = new C4074k8("stub", false, c3738x7);
            }
        }
        if (c4074k8 == null || c4074k8.f45608d == null) {
            return m19952a();
        }
        ((C4271rn) this.f45184b).execute(new RunnableC3996h8(this, new c()));
        return c4074k8;
    }

    private C3970g8(@NonNull Context context, @NonNull C3432L0 c3432l0, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull List<String> list) {
        this(context, interfaceExecutorC4297sn, list, c3432l0, c3432l0.m18470a(c3432l0.m18468a(context), list.get(0)), c3432l0.m18472b(context.getCacheDir(), "appmetrica_crashpad_handler_extracted"), new a(), new b(), new C4192om(f45182m));
    }

    private C3970g8(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull List<String> list, @NonNull C3432L0 c3432l0, @Nullable File file, @Nullable File file2, @NonNull InterfaceC3703Vm<Void, String> interfaceC3703Vm, @NonNull Callable<String> callable, @NonNull C4192om c4192om) {
        this(context, interfaceExecutorC4297sn, list, file, file2, interfaceC3703Vm, callable, c4192om, new C3944f8(context, file2), new C3763Y7(), c3432l0);
    }

    @VisibleForTesting
    public C3970g8(@NonNull Context context, @NonNull InterfaceExecutorC4297sn interfaceExecutorC4297sn, @NonNull List<String> list, @Nullable File file, @Nullable File file2, @NonNull InterfaceC3703Vm<Void, String> interfaceC3703Vm, @NonNull Callable<String> callable, @NonNull C4192om c4192om, @NonNull C3944f8 c3944f8, @NonNull C3763Y7 c3763y7, @NonNull C3432L0 c3432l0) {
        this.f45183a = context;
        this.f45184b = interfaceExecutorC4297sn;
        this.f45186d = list;
        this.f45185c = file;
        this.f45187e = context.getCacheDir();
        this.f45188f = file2;
        this.f45189g = interfaceC3703Vm;
        this.f45192j = callable;
        this.f45190h = c4192om;
        this.f45191i = c3944f8;
        this.f45193k = c3763y7;
        this.f45194l = c3432l0;
    }

    @VisibleForTesting
    /* renamed from: a */
    public void m19954a(@NonNull InterfaceC3703Vm<File, Boolean> interfaceC3703Vm) {
        File[] listFiles;
        File file = this.f45188f;
        if (file == null || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (interfaceC3703Vm.mo17917a(file2).booleanValue()) {
                file2.delete();
            }
        }
    }
}
