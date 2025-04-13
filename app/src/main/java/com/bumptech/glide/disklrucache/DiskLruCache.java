package com.bumptech.glide.disklrucache;

import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p000a.C0000a;

/* loaded from: classes.dex */
public final class DiskLruCache implements Closeable {

    /* renamed from: b */
    public final File f7960b;

    /* renamed from: c */
    public final File f7961c;

    /* renamed from: d */
    public final File f7962d;

    /* renamed from: e */
    public final File f7963e;

    /* renamed from: f */
    public final int f7964f;

    /* renamed from: g */
    public long f7965g;

    /* renamed from: h */
    public final int f7966h;

    /* renamed from: j */
    public Writer f7968j;

    /* renamed from: l */
    public int f7970l;

    /* renamed from: i */
    public long f7967i = 0;

    /* renamed from: k */
    public final LinkedHashMap<String, Entry> f7969k = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: m */
    public long f7971m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f7972n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new DiskLruCacheThreadFactory(null));

    /* renamed from: o */
    public final Callable<Void> f7973o = new Callable<Void>() { // from class: com.bumptech.glide.disklrucache.DiskLruCache.1
        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (DiskLruCache.this) {
                DiskLruCache diskLruCache = DiskLruCache.this;
                if (diskLruCache.f7968j == null) {
                    return null;
                }
                diskLruCache.m4919o();
                if (DiskLruCache.this.m4914h()) {
                    DiskLruCache.this.m4918m();
                    DiskLruCache.this.f7970l = 0;
                }
                return null;
            }
        }
    };

    public static final class DiskLruCacheThreadFactory implements ThreadFactory {
        public DiskLruCacheThreadFactory() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }

        public DiskLruCacheThreadFactory(CallableC07811 callableC07811) {
        }
    }

    public final class Editor {

        /* renamed from: a */
        public final Entry f7975a;

        /* renamed from: b */
        public final boolean[] f7976b;

        /* renamed from: c */
        public boolean f7977c;

        public Editor(Entry entry, CallableC07811 callableC07811) {
            this.f7975a = entry;
            this.f7976b = entry.f7983e ? null : new boolean[DiskLruCache.this.f7966h];
        }

        /* renamed from: a */
        public void m4920a() throws IOException {
            DiskLruCache.m4907a(DiskLruCache.this, this, false);
        }

        /* renamed from: b */
        public File m4921b(int i2) throws IOException {
            File file;
            synchronized (DiskLruCache.this) {
                Entry entry = this.f7975a;
                if (entry.f7984f != this) {
                    throw new IllegalStateException();
                }
                if (!entry.f7983e) {
                    this.f7976b[i2] = true;
                }
                file = entry.f7982d[i2];
                if (!DiskLruCache.this.f7960b.exists()) {
                    DiskLruCache.this.f7960b.mkdirs();
                }
            }
            return file;
        }
    }

    public final class Entry {

        /* renamed from: a */
        public final String f7979a;

        /* renamed from: b */
        public final long[] f7980b;

        /* renamed from: c */
        public File[] f7981c;

        /* renamed from: d */
        public File[] f7982d;

        /* renamed from: e */
        public boolean f7983e;

        /* renamed from: f */
        public Editor f7984f;

        /* renamed from: g */
        public long f7985g;

        public Entry(String str, CallableC07811 callableC07811) {
            this.f7979a = str;
            int i2 = DiskLruCache.this.f7966h;
            this.f7980b = new long[i2];
            this.f7981c = new File[i2];
            this.f7982d = new File[i2];
            StringBuilder sb = new StringBuilder(str);
            sb.append('.');
            int length = sb.length();
            for (int i3 = 0; i3 < DiskLruCache.this.f7966h; i3++) {
                sb.append(i3);
                this.f7981c[i3] = new File(DiskLruCache.this.f7960b, sb.toString());
                sb.append(".tmp");
                this.f7982d[i3] = new File(DiskLruCache.this.f7960b, sb.toString());
                sb.setLength(length);
            }
        }

        /* renamed from: a */
        public String m4922a() throws IOException {
            StringBuilder sb = new StringBuilder();
            for (long j2 : this.f7980b) {
                sb.append(' ');
                sb.append(j2);
            }
            return sb.toString();
        }

        /* renamed from: b */
        public final IOException m4923b(String[] strArr) throws IOException {
            StringBuilder m24u = C0000a.m24u("unexpected journal line: ");
            m24u.append(Arrays.toString(strArr));
            throw new IOException(m24u.toString());
        }
    }

    public final class Value {

        /* renamed from: a */
        public final File[] f7987a;

        public Value(DiskLruCache diskLruCache, String str, long j2, File[] fileArr, long[] jArr, CallableC07811 callableC07811) {
            this.f7987a = fileArr;
        }
    }

    public DiskLruCache(File file, int i2, int i3, long j2) {
        this.f7960b = file;
        this.f7964f = i2;
        this.f7961c = new File(file, "journal");
        this.f7962d = new File(file, "journal.tmp");
        this.f7963e = new File(file, "journal.bkp");
        this.f7966h = i3;
        this.f7965g = j2;
    }

    /* renamed from: a */
    public static void m4907a(DiskLruCache diskLruCache, Editor editor, boolean z) throws IOException {
        synchronized (diskLruCache) {
            Entry entry = editor.f7975a;
            if (entry.f7984f != editor) {
                throw new IllegalStateException();
            }
            if (z && !entry.f7983e) {
                for (int i2 = 0; i2 < diskLruCache.f7966h; i2++) {
                    if (!editor.f7976b[i2]) {
                        editor.m4920a();
                        throw new IllegalStateException("Newly created entry didn't create value for index " + i2);
                    }
                    if (!entry.f7982d[i2].exists()) {
                        editor.m4920a();
                        return;
                    }
                }
            }
            for (int i3 = 0; i3 < diskLruCache.f7966h; i3++) {
                File file = entry.f7982d[i3];
                if (!z) {
                    m4908c(file);
                } else if (file.exists()) {
                    File file2 = entry.f7981c[i3];
                    file.renameTo(file2);
                    long j2 = entry.f7980b[i3];
                    long length = file2.length();
                    entry.f7980b[i3] = length;
                    diskLruCache.f7967i = (diskLruCache.f7967i - j2) + length;
                }
            }
            diskLruCache.f7970l++;
            entry.f7984f = null;
            if (entry.f7983e || z) {
                entry.f7983e = true;
                diskLruCache.f7968j.append((CharSequence) "CLEAN");
                diskLruCache.f7968j.append(' ');
                diskLruCache.f7968j.append((CharSequence) entry.f7979a);
                diskLruCache.f7968j.append((CharSequence) entry.m4922a());
                diskLruCache.f7968j.append('\n');
                if (z) {
                    long j3 = diskLruCache.f7971m;
                    diskLruCache.f7971m = 1 + j3;
                    entry.f7985g = j3;
                }
            } else {
                diskLruCache.f7969k.remove(entry.f7979a);
                diskLruCache.f7968j.append((CharSequence) "REMOVE");
                diskLruCache.f7968j.append(' ');
                diskLruCache.f7968j.append((CharSequence) entry.f7979a);
                diskLruCache.f7968j.append('\n');
            }
            diskLruCache.f7968j.flush();
            if (diskLruCache.f7967i > diskLruCache.f7965g || diskLruCache.m4914h()) {
                diskLruCache.f7972n.submit(diskLruCache.f7973o);
            }
        }
    }

    /* renamed from: c */
    public static void m4908c(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: i */
    public static DiskLruCache m4909i(File file, int i2, int i3, long j2) throws IOException {
        if (j2 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i3 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else {
                m4910n(file2, file3, false);
            }
        }
        DiskLruCache diskLruCache = new DiskLruCache(file, i2, i3, j2);
        if (diskLruCache.f7961c.exists()) {
            try {
                diskLruCache.m4916k();
                diskLruCache.m4915j();
                return diskLruCache;
            } catch (IOException e2) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e2.getMessage() + ", removing");
                diskLruCache.close();
                Util.m4926a(diskLruCache.f7960b);
            }
        }
        file.mkdirs();
        DiskLruCache diskLruCache2 = new DiskLruCache(file, i2, i3, j2);
        diskLruCache2.m4918m();
        return diskLruCache2;
    }

    /* renamed from: n */
    public static void m4910n(File file, File file2, boolean z) throws IOException {
        if (z) {
            m4908c(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: b */
    public final void m4911b() {
        if (this.f7968j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f7968j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f7969k.values()).iterator();
        while (it.hasNext()) {
            Editor editor = ((Entry) it.next()).f7984f;
            if (editor != null) {
                editor.m4920a();
            }
        }
        m4919o();
        this.f7968j.close();
        this.f7968j = null;
    }

    /* renamed from: e */
    public Editor m4912e(String str) throws IOException {
        synchronized (this) {
            m4911b();
            Entry entry = this.f7969k.get(str);
            if (entry == null) {
                entry = new Entry(str, null);
                this.f7969k.put(str, entry);
            } else if (entry.f7984f != null) {
                return null;
            }
            Editor editor = new Editor(entry, null);
            entry.f7984f = editor;
            this.f7968j.append((CharSequence) "DIRTY");
            this.f7968j.append(' ');
            this.f7968j.append((CharSequence) str);
            this.f7968j.append('\n');
            this.f7968j.flush();
            return editor;
        }
    }

    /* renamed from: g */
    public synchronized Value m4913g(String str) throws IOException {
        m4911b();
        Entry entry = this.f7969k.get(str);
        if (entry == null) {
            return null;
        }
        if (!entry.f7983e) {
            return null;
        }
        for (File file : entry.f7981c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f7970l++;
        this.f7968j.append((CharSequence) "READ");
        this.f7968j.append(' ');
        this.f7968j.append((CharSequence) str);
        this.f7968j.append('\n');
        if (m4914h()) {
            this.f7972n.submit(this.f7973o);
        }
        return new Value(this, str, entry.f7985g, entry.f7981c, entry.f7980b, null);
    }

    /* renamed from: h */
    public final boolean m4914h() {
        int i2 = this.f7970l;
        return i2 >= 2000 && i2 >= this.f7969k.size();
    }

    /* renamed from: j */
    public final void m4915j() throws IOException {
        m4908c(this.f7962d);
        Iterator<Entry> it = this.f7969k.values().iterator();
        while (it.hasNext()) {
            Entry next = it.next();
            int i2 = 0;
            if (next.f7984f == null) {
                while (i2 < this.f7966h) {
                    this.f7967i += next.f7980b[i2];
                    i2++;
                }
            } else {
                next.f7984f = null;
                while (i2 < this.f7966h) {
                    m4908c(next.f7981c[i2]);
                    m4908c(next.f7982d[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: k */
    public final void m4916k() throws IOException {
        StrictLineReader strictLineReader = new StrictLineReader(new FileInputStream(this.f7961c), Util.f7994a);
        try {
            String m4925b = strictLineReader.m4925b();
            String m4925b2 = strictLineReader.m4925b();
            String m4925b3 = strictLineReader.m4925b();
            String m4925b4 = strictLineReader.m4925b();
            String m4925b5 = strictLineReader.m4925b();
            if (!"libcore.io.DiskLruCache".equals(m4925b) || !"1".equals(m4925b2) || !Integer.toString(this.f7964f).equals(m4925b3) || !Integer.toString(this.f7966h).equals(m4925b4) || !"".equals(m4925b5)) {
                throw new IOException("unexpected journal header: [" + m4925b + ", " + m4925b2 + ", " + m4925b4 + ", " + m4925b5 + "]");
            }
            int i2 = 0;
            while (true) {
                try {
                    m4917l(strictLineReader.m4925b());
                    i2++;
                } catch (EOFException unused) {
                    this.f7970l = i2 - this.f7969k.size();
                    if (strictLineReader.f7992f == -1) {
                        m4918m();
                    } else {
                        this.f7968j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7961c, true), Util.f7994a));
                    }
                    try {
                        strictLineReader.close();
                        return;
                    } catch (RuntimeException e2) {
                        throw e2;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                strictLineReader.close();
            } catch (RuntimeException e3) {
                throw e3;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: l */
    public final void m4917l(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf == -1) {
            throw new IOException(C0000a.m14k("unexpected journal line: ", str));
        }
        int i2 = indexOf + 1;
        int indexOf2 = str.indexOf(32, i2);
        if (indexOf2 == -1) {
            substring = str.substring(i2);
            if (indexOf == 6 && str.startsWith("REMOVE")) {
                this.f7969k.remove(substring);
                return;
            }
        } else {
            substring = str.substring(i2, indexOf2);
        }
        Entry entry = this.f7969k.get(substring);
        if (entry == null) {
            entry = new Entry(substring, null);
            this.f7969k.put(substring, entry);
        }
        if (indexOf2 == -1 || indexOf != 5 || !str.startsWith("CLEAN")) {
            if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                entry.f7984f = new Editor(entry, null);
                return;
            } else {
                if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                    throw new IOException(C0000a.m14k("unexpected journal line: ", str));
                }
                return;
            }
        }
        String[] split = str.substring(indexOf2 + 1).split(" ");
        entry.f7983e = true;
        entry.f7984f = null;
        if (split.length != DiskLruCache.this.f7966h) {
            entry.m4923b(split);
            throw null;
        }
        for (int i3 = 0; i3 < split.length; i3++) {
            try {
                entry.f7980b[i3] = Long.parseLong(split[i3]);
            } catch (NumberFormatException unused) {
                entry.m4923b(split);
                throw null;
            }
        }
    }

    /* renamed from: m */
    public final synchronized void m4918m() throws IOException {
        Writer writer = this.f7968j;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7962d), Util.f7994a));
        try {
            bufferedWriter.write("libcore.io.DiskLruCache");
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7964f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f7966h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (Entry entry : this.f7969k.values()) {
                if (entry.f7984f != null) {
                    bufferedWriter.write("DIRTY " + entry.f7979a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + entry.f7979a + entry.m4922a() + '\n');
                }
            }
            bufferedWriter.close();
            if (this.f7961c.exists()) {
                m4910n(this.f7961c, this.f7963e, true);
            }
            m4910n(this.f7962d, this.f7961c, false);
            this.f7963e.delete();
            this.f7968j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f7961c, true), Util.f7994a));
        } catch (Throwable th) {
            bufferedWriter.close();
            throw th;
        }
    }

    /* renamed from: o */
    public final void m4919o() throws IOException {
        while (this.f7967i > this.f7965g) {
            String key = this.f7969k.entrySet().iterator().next().getKey();
            synchronized (this) {
                m4911b();
                Entry entry = this.f7969k.get(key);
                if (entry != null && entry.f7984f == null) {
                    for (int i2 = 0; i2 < this.f7966h; i2++) {
                        File file = entry.f7981c[i2];
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j2 = this.f7967i;
                        long[] jArr = entry.f7980b;
                        this.f7967i = j2 - jArr[i2];
                        jArr[i2] = 0;
                    }
                    this.f7970l++;
                    this.f7968j.append((CharSequence) "REMOVE");
                    this.f7968j.append(' ');
                    this.f7968j.append((CharSequence) key);
                    this.f7968j.append('\n');
                    this.f7969k.remove(key);
                    if (m4914h()) {
                        this.f7972n.submit(this.f7973o);
                    }
                }
            }
        }
    }
}
