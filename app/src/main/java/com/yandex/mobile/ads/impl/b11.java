package com.yandex.mobile.ads.impl;

import android.os.ConditionVariable;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC5970wf;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Random;
import java.util.TreeSet;

/* loaded from: classes3.dex */
public final class b11 implements InterfaceC5970wf {

    /* renamed from: k */
    private static final HashSet<File> f48723k = new HashSet<>();

    /* renamed from: a */
    private final File f48724a;

    /* renamed from: b */
    private final InterfaceC4970dg f48725b;

    /* renamed from: c */
    private final C5493ng f48726c;

    /* renamed from: d */
    @Nullable
    private final C5077fg f48727d;

    /* renamed from: e */
    private final HashMap<String, ArrayList<InterfaceC5970wf.b>> f48728e;

    /* renamed from: f */
    private final Random f48729f;

    /* renamed from: g */
    private final boolean f48730g;

    /* renamed from: h */
    private long f48731h;

    /* renamed from: i */
    private long f48732i;

    /* renamed from: j */
    private InterfaceC5970wf.a f48733j;

    public b11(File file, v70 v70Var, @Nullable C4986ds c4986ds) {
        this(file, v70Var, new C5493ng(c4986ds, file), new C5077fg(c4986ds));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: a */
    public final synchronized long mo22698a() {
        return this.f48732i;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    @Nullable
    /* renamed from: c */
    public final synchronized C5284jg mo22707c(String str, long j2, long j3) throws InterfaceC5970wf.a {
        c11 m26665b;
        c11 c11Var;
        synchronized (this) {
            InterfaceC5970wf.a aVar = this.f48733j;
            if (aVar != null) {
                throw aVar;
            }
        }
        C5442mg m26886a = this.f48726c.m26886a(str);
        if (m26886a == null) {
            c11Var = c11.m23004a(str, j2, j3);
        } else {
            while (true) {
                m26665b = m26886a.m26665b(j2, j3);
                if (!m26665b.f51600d || m26665b.f51601e.length() == m26665b.f51599c) {
                    break;
                }
                m22695b();
            }
            c11Var = m26665b;
        }
        if (!c11Var.f51600d) {
            if (this.f48726c.m26891b(str).m26670d(j2, c11Var.f51599c)) {
                return c11Var;
            }
            return null;
        }
        if (this.f48730g) {
            File file = c11Var.f51601e;
            Objects.requireNonNull(file);
            String name = file.getName();
            long j4 = c11Var.f51599c;
            long currentTimeMillis = System.currentTimeMillis();
            boolean z = false;
            C5077fg c5077fg = this.f48727d;
            if (c5077fg != null) {
                try {
                    c5077fg.m24587a(name, j4, currentTimeMillis);
                } catch (IOException unused) {
                    d90.m23842d("SimpleCache", "Failed to update index with new touch timestamp.");
                }
            } else {
                z = true;
            }
            c11 m26659a = this.f48726c.m26886a(str).m26659a(c11Var, currentTimeMillis, z);
            ArrayList<InterfaceC5970wf.b> arrayList = this.f48728e.get(c11Var.f51597a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).mo29191a(this, c11Var, m26659a);
                }
            }
            v70 v70Var = (v70) this.f48725b;
            v70Var.mo29188a(c11Var);
            v70Var.mo29190a(this, m26659a);
            c11Var = m26659a;
        }
        return c11Var;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: d */
    public final synchronized long mo22708d(String str, long j2, long j3) {
        C5442mg m26886a;
        if (j3 == -1) {
            j3 = Long.MAX_VALUE;
        }
        m26886a = this.f48726c.m26886a(str);
        return m26886a != null ? m26886a.m26658a(j2, j3) : -j3;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: e */
    public final synchronized C5284jg mo22709e(String str, long j2, long j3) throws InterruptedException, InterfaceC5970wf.a {
        C5284jg mo22707c;
        synchronized (this) {
            InterfaceC5970wf.a aVar = this.f48733j;
            if (aVar != null) {
                throw aVar;
            }
        }
        return mo22707c;
        while (true) {
            mo22707c = mo22707c(str, j2, j3);
            if (mo22707c != null) {
                return mo22707c;
            }
            wait();
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: a */
    public final synchronized File mo22699a(String str, long j2, long j3) throws InterfaceC5970wf.a {
        synchronized (this) {
            InterfaceC5970wf.a aVar = this.f48733j;
            if (aVar != null) {
                throw aVar;
            }
        }
        return new File(r7, r4 + "." + j2 + "." + r0 + ".v3.exo");
        C5442mg m26886a = this.f48726c.m26886a(str);
        Objects.requireNonNull(m26886a);
        C5220ia.m25476b(m26886a.m26668c(j2, j3));
        if (!this.f48724a.exists()) {
            m22691a(this.f48724a);
            m22695b();
        }
        ((v70) this.f48725b).m29189a(this, j3);
        File file = new File(this.f48724a, Integer.toString(this.f48729f.nextInt(10)));
        if (!file.exists()) {
            m22691a(file);
        }
        long currentTimeMillis = System.currentTimeMillis();
        int i2 = m26886a.f52678a;
        int i3 = c11.f49068j;
        return new File(file, i2 + "." + j2 + "." + currentTimeMillis + ".v3.exo");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: b */
    public final synchronized void mo22706b(C5284jg c5284jg) {
        C5442mg m26886a = this.f48726c.m26886a(c5284jg.f51597a);
        Objects.requireNonNull(m26886a);
        m26886a.m26661a(c5284jg.f51598b);
        this.f48726c.m26894c(m26886a.f52679b);
        notifyAll();
    }

    public b11(File file, v70 v70Var, C5493ng c5493ng, @Nullable C5077fg c5077fg) {
        if (m22697c(file)) {
            this.f48724a = file;
            this.f48725b = v70Var;
            this.f48726c = c5493ng;
            this.f48727d = c5077fg;
            this.f48728e = new HashMap<>();
            this.f48729f = new Random();
            this.f48730g = true;
            this.f48731h = -1L;
            ConditionVariable conditionVariable = new ConditionVariable();
            new a11(this, conditionVariable).start();
            conditionVariable.block();
            return;
        }
        throw new IllegalStateException("Another SimpleCache instance uses the folder: " + file);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: b */
    public final synchronized long mo22704b(String str, long j2, long j3) {
        long j4;
        long j5 = j3 == -1 ? Long.MAX_VALUE : j3 + j2;
        long j6 = j5 >= 0 ? j5 : Long.MAX_VALUE;
        j4 = 0;
        while (j2 < j6) {
            long mo22708d = mo22708d(str, j2, j6 - j2);
            if (mo22708d > 0) {
                j4 += mo22708d;
            } else {
                mo22708d = -mo22708d;
            }
            j2 += mo22708d;
        }
        return j4;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: b */
    public final synchronized C5349kn mo22705b(String str) {
        C5442mg m26886a;
        m26886a = this.f48726c.m26886a(str);
        return m26886a != null ? m26886a.m26660a() : C5349kn.f52038c;
    }

    /* renamed from: b */
    private void m22695b() {
        ArrayList arrayList = new ArrayList();
        Iterator<C5442mg> it = this.f48726c.m26888a().iterator();
        while (it.hasNext()) {
            Iterator<c11> it2 = it.next().m26666b().iterator();
            while (it2.hasNext()) {
                c11 next = it2.next();
                if (next.f51601e.length() != next.f51599c) {
                    arrayList.add(next);
                }
            }
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            m22696c((C5284jg) arrayList.get(i2));
        }
    }

    /* renamed from: b */
    private static long m22693b(File file) throws IOException {
        long nextLong = new SecureRandom().nextLong();
        long abs = nextLong == Long.MIN_VALUE ? 0L : Math.abs(nextLong);
        File file2 = new File(file, um1.m29049a(Long.toString(abs, 16), ".uid"));
        if (file2.createNewFile()) {
            return abs;
        }
        throw new IOException("Failed to create UID file: " + file2);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: a */
    public final synchronized void mo22701a(File file, long j2) throws InterfaceC5970wf.a {
        if (file.exists()) {
            if (j2 == 0) {
                file.delete();
                return;
            }
            c11 m23002a = c11.m23002a(file, j2, -9223372036854775807L, this.f48726c);
            Objects.requireNonNull(m23002a);
            C5442mg m26886a = this.f48726c.m26886a(m23002a.f51597a);
            Objects.requireNonNull(m26886a);
            C5220ia.m25476b(m26886a.m26668c(m23002a.f51598b, m23002a.f51599c));
            long m26171b = m26886a.m26660a().m26171b();
            if (m26171b != -1) {
                C5220ia.m25476b(m23002a.f51598b + m23002a.f51599c <= m26171b);
            }
            if (this.f48727d != null) {
                try {
                    this.f48727d.m24587a(file.getName(), m23002a.f51599c, m23002a.f51602f);
                } catch (IOException e2) {
                    throw new InterfaceC5970wf.a(e2);
                }
            }
            this.f48726c.m26891b(m23002a.f51597a).m26662a(m23002a);
            this.f48732i += m23002a.f51599c;
            ArrayList<InterfaceC5970wf.b> arrayList = this.f48728e.get(m23002a.f51597a);
            if (arrayList != null) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    arrayList.get(size).mo29190a(this, m23002a);
                }
            }
            ((v70) this.f48725b).mo29190a(this, m23002a);
            try {
                this.f48726c.m26893c();
                notifyAll();
            } finally {
                InterfaceC5970wf.a aVar = new InterfaceC5970wf.a(e2);
            }
        }
    }

    /* renamed from: c */
    private void m22696c(C5284jg c5284jg) {
        C5442mg m26886a = this.f48726c.m26886a(c5284jg.f51597a);
        if (m26886a == null || !m26886a.m26663a(c5284jg)) {
            return;
        }
        this.f48732i -= c5284jg.f51599c;
        if (this.f48727d != null) {
            String name = c5284jg.f51601e.getName();
            try {
                this.f48727d.m24586a(name);
            } catch (IOException unused) {
                ai1.m22527a("Failed to remove file index entry for: ", name, "SimpleCache");
            }
        }
        this.f48726c.m26894c(m26886a.f52679b);
        ArrayList<InterfaceC5970wf.b> arrayList = this.f48728e.get(c5284jg.f51597a);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).mo29188a(c5284jg);
            }
        }
        ((v70) this.f48725b).mo29188a(c5284jg);
    }

    /* renamed from: c */
    private static synchronized boolean m22697c(File file) {
        boolean add;
        synchronized (b11.class) {
            add = f48723k.add(file.getAbsoluteFile());
        }
        return add;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: a */
    public final synchronized void mo22702a(String str) {
        TreeSet treeSet;
        synchronized (this) {
            C5442mg m26886a = this.f48726c.m26886a(str);
            if (m26886a != null && !m26886a.m26667c()) {
                treeSet = new TreeSet((Collection) m26886a.m26666b());
            }
            treeSet = new TreeSet();
        }
        Iterator it = treeSet.iterator();
        while (it.hasNext()) {
            m22696c((C5284jg) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: a */
    public final synchronized void mo22700a(C5284jg c5284jg) {
        m22696c(c5284jg);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC5970wf
    /* renamed from: a */
    public final synchronized void mo22703a(String str, C5643qk c5643qk) throws InterfaceC5970wf.a {
        try {
            synchronized (this) {
                synchronized (this) {
                    InterfaceC5970wf.a aVar = this.f48733j;
                    if (aVar != null) {
                        throw aVar;
                    }
                }
                return;
            }
            this.f48726c.m26893c();
            return;
        } catch (Throwable th) {
            throw new InterfaceC5970wf.a(th);
        }
        this.f48726c.m26890a(str, c5643qk);
    }

    /* renamed from: a */
    public static void m22690a(b11 b11Var) {
        long j2;
        if (!b11Var.f48724a.exists()) {
            try {
                m22691a(b11Var.f48724a);
            } catch (InterfaceC5970wf.a e2) {
                b11Var.f48733j = e2;
                return;
            }
        }
        File[] listFiles = b11Var.f48724a.listFiles();
        if (listFiles == null) {
            StringBuilder m26356a = l60.m26356a("Failed to list cache directory files: ");
            m26356a.append(b11Var.f48724a);
            String sb = m26356a.toString();
            d90.m23839b("SimpleCache", sb);
            b11Var.f48733j = new InterfaceC5970wf.a(sb);
            return;
        }
        int length = listFiles.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                j2 = -1;
                break;
            }
            File file = listFiles[i2];
            String name = file.getName();
            if (name.endsWith(".uid")) {
                try {
                    j2 = Long.parseLong(name.substring(0, name.indexOf(46)), 16);
                    break;
                } catch (NumberFormatException unused) {
                    d90.m23839b("SimpleCache", "Malformed UID file: " + file);
                    file.delete();
                }
            }
            i2++;
        }
        b11Var.f48731h = j2;
        if (j2 == -1) {
            try {
                b11Var.f48731h = m22693b(b11Var.f48724a);
            } catch (IOException e3) {
                StringBuilder m26356a2 = l60.m26356a("Failed to create cache UID: ");
                m26356a2.append(b11Var.f48724a);
                String sb2 = m26356a2.toString();
                d90.m23838a("SimpleCache", sb2, e3);
                b11Var.f48733j = new InterfaceC5970wf.a(sb2, e3);
                return;
            }
        }
        try {
            b11Var.f48726c.m26889a(b11Var.f48731h);
            C5077fg c5077fg = b11Var.f48727d;
            if (c5077fg != null) {
                c5077fg.m24585a(b11Var.f48731h);
                HashMap m24584a = b11Var.f48727d.m24584a();
                b11Var.m22692a(b11Var.f48724a, true, listFiles, m24584a);
                b11Var.f48727d.m24588a(m24584a.keySet());
            } else {
                b11Var.m22692a(b11Var.f48724a, true, listFiles, null);
            }
            b11Var.f48726c.m26892b();
            try {
                b11Var.f48726c.m26893c();
            } catch (Throwable th) {
                d90.m23838a("SimpleCache", "Storing index file failed", th);
            }
        } catch (Throwable th2) {
            StringBuilder m26356a3 = l60.m26356a("Failed to initialize cache indices: ");
            m26356a3.append(b11Var.f48724a);
            String sb3 = m26356a3.toString();
            d90.m23838a("SimpleCache", sb3, th2);
            b11Var.f48733j = new InterfaceC5970wf.a(sb3, th2);
        }
    }

    /* renamed from: a */
    private void m22692a(File file, boolean z, @Nullable File[] fileArr, @Nullable HashMap hashMap) {
        if (fileArr == null || fileArr.length == 0) {
            if (z) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z && name.indexOf(46) == -1) {
                m22692a(file2, false, file2.listFiles(), hashMap);
            } else if (!z || (!name.startsWith("yandex_cached_content_index.exi") && !name.endsWith(".uid"))) {
                long j2 = -1;
                long j3 = -9223372036854775807L;
                C5024eg c5024eg = hashMap != null ? (C5024eg) hashMap.remove(name) : null;
                if (c5024eg != null) {
                    j2 = c5024eg.f49957a;
                    j3 = c5024eg.f49958b;
                }
                c11 m23002a = c11.m23002a(file2, j2, j3, this.f48726c);
                if (m23002a != null) {
                    this.f48726c.m26891b(m23002a.f51597a).m26662a(m23002a);
                    this.f48732i += m23002a.f51599c;
                    ArrayList<InterfaceC5970wf.b> arrayList = this.f48728e.get(m23002a.f51597a);
                    if (arrayList != null) {
                        for (int size = arrayList.size() - 1; size >= 0; size--) {
                            arrayList.get(size).mo29190a(this, m23002a);
                        }
                    }
                    ((v70) this.f48725b).mo29190a(this, m23002a);
                } else {
                    file2.delete();
                }
            }
        }
    }

    /* renamed from: a */
    private static void m22691a(File file) throws InterfaceC5970wf.a {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String str = "Failed to create cache directory: " + file;
        d90.m23839b("SimpleCache", str);
        throw new InterfaceC5970wf.a(str);
    }
}
