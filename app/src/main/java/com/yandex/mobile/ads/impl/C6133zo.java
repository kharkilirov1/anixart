package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.InterfaceC6025xf;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.KotlinVersion;

/* renamed from: com.yandex.mobile.ads.impl.zo */
/* loaded from: classes3.dex */
public final class C6133zo implements InterfaceC6025xf {

    /* renamed from: a */
    private final LinkedHashMap f57259a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f57260b = 0;

    /* renamed from: c */
    private final d f57261c;

    /* renamed from: d */
    private final int f57262d;

    /* renamed from: com.yandex.mobile.ads.impl.zo$a */
    public class a implements d {

        /* renamed from: a */
        public final /* synthetic */ File f57263a;

        public a(File file) {
            this.f57263a = file;
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.zo$d */
    public interface d {
    }

    public C6133zo(File file, int i2) {
        this.f57261c = new a(file);
        this.f57262d = i2;
    }

    /* renamed from: b */
    private void m30240b() {
        if (this.f57260b < this.f57262d) {
            return;
        }
        if (rh1.f54313a) {
            n60.m26812e("Pruning old cache entries.", new Object[0]);
        }
        long j2 = this.f57260b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f57259a.entrySet().iterator();
        int i2 = 0;
        while (it.hasNext()) {
            b bVar = (b) ((Map.Entry) it.next()).getValue();
            String str = bVar.f57265b;
            File file = ((a) this.f57261c).f57263a;
            int length = str.length() / 2;
            StringBuilder m26356a = l60.m26356a(String.valueOf(str.substring(0, length).hashCode()));
            m26356a.append(String.valueOf(str.substring(length).hashCode()));
            if (new File(file, m26356a.toString()).delete()) {
                this.f57260b -= bVar.f57264a;
            } else {
                String str2 = bVar.f57265b;
                int length2 = str2.length() / 2;
                StringBuilder m26356a2 = l60.m26356a(String.valueOf(str2.substring(0, length2).hashCode()));
                m26356a2.append(String.valueOf(str2.substring(length2).hashCode()));
                n60.m26809b("Could not delete cache entry for key=%s, filename=%s", str2, m26356a2.toString());
            }
            it.remove();
            i2++;
            if (this.f57260b < this.f57262d * 0.9f) {
                break;
            }
        }
        if (rh1.f54313a) {
            n60.m26812e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i2), Long.valueOf(this.f57260b - j2), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6025xf
    /* renamed from: a */
    public final synchronized void mo29746a() {
        File file = ((a) this.f57261c).f57263a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Object[] objArr = {file.getAbsolutePath()};
                boolean z = rh1.f54313a;
                n60.m26810c("Unable to create cache dir %s", objArr);
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                long length = file2.length();
                c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), length);
                try {
                    b m30241a = b.m30241a(cVar);
                    m30241a.f57264a = length;
                    String str = m30241a.f57265b;
                    if (this.f57259a.containsKey(str)) {
                        this.f57260b = (m30241a.f57264a - ((b) this.f57259a.get(str)).f57264a) + this.f57260b;
                    } else {
                        this.f57260b += m30241a.f57264a;
                    }
                    this.f57259a.put(str, m30241a);
                    cVar.close();
                } catch (Throwable th) {
                    cVar.close();
                    throw th;
                }
            } catch (IOException unused) {
                file2.delete();
            } catch (Throwable unused2) {
                C5712ru.m27985a(file2);
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6025xf
    public final synchronized InterfaceC6025xf.a get(String str) {
        b bVar = (b) this.f57259a.get(str);
        if (bVar == null) {
            return null;
        }
        File file = ((a) this.f57261c).f57263a;
        int length = str.length() / 2;
        StringBuilder m26356a = l60.m26356a(String.valueOf(str.substring(0, length).hashCode()));
        m26356a.append(String.valueOf(str.substring(length).hashCode()));
        File file2 = new File(file, m26356a.toString());
        try {
            c cVar = new c(new BufferedInputStream(new FileInputStream(file2)), file2.length());
            try {
                b m30241a = b.m30241a(cVar);
                if (TextUtils.equals(str, m30241a.f57265b)) {
                    return bVar.m30243a(m30238a(cVar, cVar.m30245a()));
                }
                Object[] objArr = {file2.getAbsolutePath(), str, m30241a.f57265b};
                boolean z = rh1.f54313a;
                n60.m26809b("%s: key=%s, found=%s", objArr);
                b bVar2 = (b) this.f57259a.remove(str);
                if (bVar2 != null) {
                    this.f57260b -= bVar2.f57264a;
                }
                return null;
            } finally {
                cVar.close();
            }
        } catch (IOException e2) {
            Object[] objArr2 = {file2.getAbsolutePath(), e2.toString()};
            boolean z2 = rh1.f54313a;
            n60.m26809b("%s: %s", objArr2);
            synchronized (this) {
                File file3 = ((a) this.f57261c).f57263a;
                int length2 = str.length() / 2;
                boolean delete = new File(file3, String.valueOf(str.substring(0, length2).hashCode()) + String.valueOf(str.substring(length2).hashCode())).delete();
                b bVar3 = (b) this.f57259a.remove(str);
                if (bVar3 != null) {
                    this.f57260b -= bVar3.f57264a;
                }
                if (!delete) {
                    int length3 = str.length() / 2;
                    n60.m26809b("Could not delete cache entry for key=%s, filename=%s", str, String.valueOf(str.substring(0, length3).hashCode()) + String.valueOf(str.substring(length3).hashCode()));
                }
                return null;
            }
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.zo$c */
    public static class c extends FilterInputStream {

        /* renamed from: a */
        private final long f57272a;

        /* renamed from: b */
        private long f57273b;

        public c(BufferedInputStream bufferedInputStream, long j2) {
            super(bufferedInputStream);
            this.f57272a = j2;
        }

        /* renamed from: a */
        public final long m30245a() {
            return this.f57272a - this.f57273b;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f57273b++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i2, int i3) throws IOException {
            int read = super.read(bArr, i2, i3);
            if (read != -1) {
                this.f57273b += read;
            }
            return read;
        }
    }

    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.zo$b */
    public static class b {

        /* renamed from: a */
        public long f57264a;

        /* renamed from: b */
        public final String f57265b;

        /* renamed from: c */
        public final String f57266c;

        /* renamed from: d */
        public final long f57267d;

        /* renamed from: e */
        public final long f57268e;

        /* renamed from: f */
        public final long f57269f;

        /* renamed from: g */
        public final long f57270g;

        /* renamed from: h */
        public final List<C5049ey> f57271h;

        private b(String str, String str2, long j2, long j3, long j4, long j5, List<C5049ey> list) {
            this.f57265b = str;
            this.f57266c = "".equals(str2) ? null : str2;
            this.f57267d = j2;
            this.f57268e = j3;
            this.f57269f = j4;
            this.f57270g = j5;
            this.f57271h = list;
        }

        /* renamed from: a */
        private static List<C5049ey> m30242a(InterfaceC6025xf.a aVar) {
            List<C5049ey> list = aVar.f56469h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = aVar.f56468g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new C5049ey(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        /* renamed from: a */
        public static b m30241a(c cVar) throws IOException {
            if (C6133zo.m30235a(cVar) == 538247942) {
                String str = new String(C6133zo.m30238a(cVar, C6133zo.m30239b(cVar)), "UTF-8");
                String str2 = new String(C6133zo.m30238a(cVar, C6133zo.m30239b(cVar)), "UTF-8");
                long m30239b = C6133zo.m30239b(cVar);
                long m30239b2 = C6133zo.m30239b(cVar);
                long m30239b3 = C6133zo.m30239b(cVar);
                long m30239b4 = C6133zo.m30239b(cVar);
                int m30235a = C6133zo.m30235a(cVar);
                if (m30235a >= 0) {
                    List emptyList = m30235a == 0 ? Collections.emptyList() : new ArrayList();
                    int i2 = 0;
                    while (i2 < m30235a) {
                        emptyList.add(new C5049ey(new String(C6133zo.m30238a(cVar, C6133zo.m30239b(cVar)), "UTF-8").intern(), new String(C6133zo.m30238a(cVar, C6133zo.m30239b(cVar)), "UTF-8").intern()));
                        i2++;
                        m30239b4 = m30239b4;
                        m30239b3 = m30239b3;
                    }
                    return new b(str, str2, m30239b, m30239b2, m30239b3, m30239b4, emptyList);
                }
                throw new IOException(k60.m26036a("readHeaderList size=", m30235a));
            }
            throw new IOException();
        }

        public b(String str, InterfaceC6025xf.a aVar) {
            this(str, aVar.f56463b, aVar.f56464c, aVar.f56465d, aVar.f56466e, aVar.f56467f, m30242a(aVar));
        }

        /* renamed from: a */
        public final InterfaceC6025xf.a m30243a(byte[] bArr) {
            InterfaceC6025xf.a aVar = new InterfaceC6025xf.a();
            aVar.f56462a = bArr;
            aVar.f56463b = this.f57266c;
            aVar.f56464c = this.f57267d;
            aVar.f56465d = this.f57268e;
            aVar.f56466e = this.f57269f;
            aVar.f56467f = this.f57270g;
            List<C5049ey> list = this.f57271h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (C5049ey c5049ey : list) {
                treeMap.put(c5049ey.m24278a(), c5049ey.m24279b());
            }
            aVar.f56468g = treeMap;
            aVar.f56469h = Collections.unmodifiableList(this.f57271h);
            return aVar;
        }

        /* renamed from: a */
        public final boolean m30244a(BufferedOutputStream bufferedOutputStream) {
            try {
                C6133zo.m30236a(bufferedOutputStream, 538247942);
                byte[] bytes = this.f57265b.getBytes("UTF-8");
                C6133zo.m30237a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.f57266c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes("UTF-8");
                C6133zo.m30237a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                C6133zo.m30237a(bufferedOutputStream, this.f57267d);
                C6133zo.m30237a(bufferedOutputStream, this.f57268e);
                C6133zo.m30237a(bufferedOutputStream, this.f57269f);
                C6133zo.m30237a(bufferedOutputStream, this.f57270g);
                List<C5049ey> list = this.f57271h;
                if (list != null) {
                    C6133zo.m30236a(bufferedOutputStream, list.size());
                    for (C5049ey c5049ey : list) {
                        byte[] bytes3 = c5049ey.m24278a().getBytes("UTF-8");
                        C6133zo.m30237a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = c5049ey.m24279b().getBytes("UTF-8");
                        C6133zo.m30237a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    C6133zo.m30236a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e2) {
                Object[] objArr = {e2.toString()};
                boolean z = rh1.f54313a;
                n60.m26809b("%s", objArr);
                return false;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6025xf
    /* renamed from: a */
    public final synchronized void mo29747a(String str) {
        InterfaceC6025xf.a aVar = get(str);
        if (aVar != null) {
            aVar.f56467f = 0L;
            aVar.f56466e = 0L;
            mo29748a(str, aVar);
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC6025xf
    /* renamed from: a */
    public final synchronized void mo29748a(String str, InterfaceC6025xf.a aVar) {
        BufferedOutputStream bufferedOutputStream;
        b bVar;
        long j2 = this.f57260b;
        byte[] bArr = aVar.f56462a;
        long length = j2 + bArr.length;
        int i2 = this.f57262d;
        if (length <= i2 || bArr.length <= i2 * 0.9f) {
            File file = ((a) this.f57261c).f57263a;
            int length2 = str.length() / 2;
            StringBuilder m26356a = l60.m26356a(String.valueOf(str.substring(0, length2).hashCode()));
            m26356a.append(String.valueOf(str.substring(length2).hashCode()));
            File file2 = new File(file, m26356a.toString());
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                bVar = new b(str, aVar);
            } catch (IOException unused) {
                if (!file2.delete()) {
                    Object[] objArr = {file2.getAbsolutePath()};
                    boolean z = rh1.f54313a;
                    n60.m26809b("Could not clean up file %s", objArr);
                }
                if (!((a) this.f57261c).f57263a.exists()) {
                    boolean z2 = rh1.f54313a;
                    n60.m26809b("Re-initializing cache after external clearing.", new Object[0]);
                    this.f57259a.clear();
                    this.f57260b = 0L;
                    mo29746a();
                }
            }
            if (bVar.m30244a(bufferedOutputStream)) {
                bufferedOutputStream.write(aVar.f56462a);
                bufferedOutputStream.close();
                bVar.f57264a = file2.length();
                if (!this.f57259a.containsKey(str)) {
                    this.f57260b += bVar.f57264a;
                } else {
                    this.f57260b = (bVar.f57264a - ((b) this.f57259a.get(str)).f57264a) + this.f57260b;
                }
                this.f57259a.put(str, bVar);
                m30240b();
                return;
            }
            bufferedOutputStream.close();
            Object[] objArr2 = {file2.getAbsolutePath()};
            boolean z3 = rh1.f54313a;
            n60.m26809b("Failed to write header for %s", objArr2);
            throw new IOException();
        }
    }

    /* renamed from: b */
    public static long m30239b(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j2 = ((read & 255) << 0) | 0;
            int read2 = inputStream.read();
            if (read2 != -1) {
                long j3 = j2 | ((read2 & 255) << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    long j4 = j3 | ((read3 & 255) << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        long j5 = j4 | ((read4 & 255) << 24);
                        int read5 = inputStream.read();
                        if (read5 != -1) {
                            long j6 = j5 | ((read5 & 255) << 32);
                            int read6 = inputStream.read();
                            if (read6 != -1) {
                                long j7 = j6 | ((read6 & 255) << 40);
                                int read7 = inputStream.read();
                                if (read7 != -1) {
                                    long j8 = j7 | ((read7 & 255) << 48);
                                    int read8 = inputStream.read();
                                    if (read8 != -1) {
                                        return ((read8 & 255) << 56) | j8;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @VisibleForTesting
    /* renamed from: a */
    public static byte[] m30238a(c cVar, long j2) throws IOException {
        long m30245a = cVar.m30245a();
        if (j2 >= 0 && j2 <= m30245a) {
            int i2 = (int) j2;
            if (i2 == j2) {
                byte[] bArr = new byte[i2];
                new DataInputStream(cVar).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j2 + ", maxLength=" + m30245a);
    }

    /* renamed from: a */
    public static int m30235a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            int i2 = (read << 0) | 0;
            int read2 = inputStream.read();
            if (read2 != -1) {
                int i3 = i2 | (read2 << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    int i4 = i3 | (read3 << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i4;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    /* renamed from: a */
    public static void m30236a(BufferedOutputStream bufferedOutputStream, int i2) throws IOException {
        bufferedOutputStream.write((i2 >> 0) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bufferedOutputStream.write((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    /* renamed from: a */
    public static void m30237a(BufferedOutputStream bufferedOutputStream, long j2) throws IOException {
        bufferedOutputStream.write((byte) (j2 >>> 0));
        bufferedOutputStream.write((byte) (j2 >>> 8));
        bufferedOutputStream.write((byte) (j2 >>> 16));
        bufferedOutputStream.write((byte) (j2 >>> 24));
        bufferedOutputStream.write((byte) (j2 >>> 32));
        bufferedOutputStream.write((byte) (j2 >>> 40));
        bufferedOutputStream.write((byte) (j2 >>> 48));
        bufferedOutputStream.write((byte) (j2 >>> 56));
    }
}
