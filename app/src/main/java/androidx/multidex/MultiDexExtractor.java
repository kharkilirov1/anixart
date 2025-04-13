package androidx.multidex;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.multidex.ZipUtil;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.ArrayList;
import java.util.List;
import java.util.zip.CRC32;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipOutputStream;
import okhttp3.internal.http2.Http2Stream;
import p000a.C0000a;

/* loaded from: classes.dex */
final class MultiDexExtractor implements Closeable {

    /* renamed from: b */
    public final File f4887b;

    /* renamed from: c */
    public final long f4888c;

    /* renamed from: d */
    public final File f4889d;

    /* renamed from: e */
    public final RandomAccessFile f4890e;

    /* renamed from: f */
    public final FileChannel f4891f;

    /* renamed from: g */
    public final FileLock f4892g;

    public static class ExtractedDex extends File {

        /* renamed from: b */
        public long f4893b;

        public ExtractedDex(File file, String str) {
            super(file, str);
            this.f4893b = -1L;
        }
    }

    public MultiDexExtractor(File file, File file2) throws IOException {
        StringBuilder m24u = C0000a.m24u("MultiDexExtractor(");
        m24u.append(file.getPath());
        m24u.append(", ");
        m24u.append(file2.getPath());
        m24u.append(")");
        Log.i("MultiDex", m24u.toString());
        this.f4887b = file;
        this.f4889d = file2;
        this.f4888c = m3330e(file);
        File file3 = new File(file2, "MultiDex.lock");
        RandomAccessFile randomAccessFile = new RandomAccessFile(file3, "rw");
        this.f4890e = randomAccessFile;
        try {
            FileChannel channel = randomAccessFile.getChannel();
            this.f4891f = channel;
            try {
                Log.i("MultiDex", "Blocking on lock " + file3.getPath());
                this.f4892g = channel.lock();
                Log.i("MultiDex", file3.getPath() + " locked");
            } catch (IOException e2) {
                e = e2;
                m3327a(this.f4891f);
                throw e;
            } catch (Error e3) {
                e = e3;
                m3327a(this.f4891f);
                throw e;
            } catch (RuntimeException e4) {
                e = e4;
                m3327a(this.f4891f);
                throw e;
            }
        } catch (IOException | Error | RuntimeException e5) {
            m3327a(this.f4890e);
            throw e5;
        }
    }

    /* renamed from: a */
    public static void m3327a(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e2) {
            Log.w("MultiDex", "Failed to close resource", e2);
        }
    }

    /* renamed from: b */
    public static void m3328b(ZipFile zipFile, ZipEntry zipEntry, File file, String str) throws IOException, FileNotFoundException {
        InputStream inputStream = zipFile.getInputStream(zipEntry);
        File createTempFile = File.createTempFile(C0000a.m14k("tmp-", str), ".zip", file.getParentFile());
        StringBuilder m24u = C0000a.m24u("Extracting ");
        m24u.append(createTempFile.getPath());
        Log.i("MultiDex", m24u.toString());
        try {
            ZipOutputStream zipOutputStream = new ZipOutputStream(new BufferedOutputStream(new FileOutputStream(createTempFile)));
            try {
                ZipEntry zipEntry2 = new ZipEntry("classes.dex");
                zipEntry2.setTime(zipEntry.getTime());
                zipOutputStream.putNextEntry(zipEntry2);
                byte[] bArr = new byte[16384];
                for (int read = inputStream.read(bArr); read != -1; read = inputStream.read(bArr)) {
                    zipOutputStream.write(bArr, 0, read);
                }
                zipOutputStream.closeEntry();
                zipOutputStream.close();
                if (!createTempFile.setReadOnly()) {
                    throw new IOException("Failed to mark readonly \"" + createTempFile.getAbsolutePath() + "\" (tmp of \"" + file.getAbsolutePath() + "\")");
                }
                Log.i("MultiDex", "Renaming to " + file.getPath());
                if (createTempFile.renameTo(file)) {
                    return;
                }
                throw new IOException("Failed to rename \"" + createTempFile.getAbsolutePath() + "\" to \"" + file.getAbsolutePath() + "\"");
            } catch (Throwable th) {
                zipOutputStream.close();
                throw th;
            }
        } finally {
            m3327a(inputStream);
            createTempFile.delete();
        }
    }

    /* renamed from: c */
    public static long m3329c(File file) {
        long lastModified = file.lastModified();
        return lastModified == -1 ? lastModified - 1 : lastModified;
    }

    /* renamed from: e */
    public static long m3330e(File file) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
        try {
            ZipUtil.CentralDirectory m3335a = ZipUtil.m3335a(randomAccessFile);
            CRC32 crc32 = new CRC32();
            long j2 = m3335a.f4895b;
            randomAccessFile.seek(m3335a.f4894a);
            byte[] bArr = new byte[16384];
            int read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j2));
            while (read != -1) {
                crc32.update(bArr, 0, read);
                j2 -= read;
                if (j2 == 0) {
                    break;
                }
                read = randomAccessFile.read(bArr, 0, (int) Math.min(Http2Stream.EMIT_BUFFER_SIZE, j2));
            }
            long value = crc32.getValue();
            randomAccessFile.close();
            return value == -1 ? value - 1 : value;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }

    /* renamed from: j */
    public static void m3331j(Context context, String str, long j2, long j3, List<ExtractedDex> list) {
        SharedPreferences.Editor edit = context.getSharedPreferences("multidex.version", 4).edit();
        edit.putLong(str + "timestamp", j2);
        edit.putLong(C0000a.m20q(new StringBuilder(), str, "crc"), j3);
        edit.putInt(str + "dex.number", list.size() + 1);
        int i2 = 2;
        for (ExtractedDex extractedDex : list) {
            edit.putLong(str + "dex.crc." + i2, extractedDex.f4893b);
            edit.putLong(str + "dex.time." + i2, extractedDex.lastModified());
            i2++;
        }
        edit.commit();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f4892g.release();
        this.f4891f.close();
        this.f4890e.close();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x007e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.List<? extends java.io.File> m3332g(android.content.Context r13, java.lang.String r14, boolean r15) throws java.io.IOException {
        /*
            r12 = this;
            java.lang.String r0 = "MultiDexExtractor.load("
            java.lang.StringBuilder r0 = p000a.C0000a.m24u(r0)
            java.io.File r1 = r12.f4887b
            java.lang.String r1 = r1.getPath()
            r0.append(r1)
            java.lang.String r1 = ", "
            r0.append(r1)
            r0.append(r15)
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ")"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "MultiDex"
            android.util.Log.i(r1, r0)
            java.nio.channels.FileLock r0 = r12.f4892g
            boolean r0 = r0.isValid()
            if (r0 == 0) goto Ld6
            if (r15 != 0) goto L9c
            java.io.File r0 = r12.f4887b
            long r2 = r12.f4888c
            r4 = 4
            java.lang.String r5 = "multidex.version"
            android.content.SharedPreferences r4 = r13.getSharedPreferences(r5, r4)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            r5.append(r14)
            java.lang.String r6 = "timestamp"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r6 = -1
            long r8 = r4.getLong(r5, r6)
            long r10 = m3329c(r0)
            int r0 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r0 != 0) goto L7b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r14)
            java.lang.String r5 = "crc"
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            long r4 = r4.getLong(r0, r6)
            int r0 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r0 == 0) goto L79
            goto L7b
        L79:
            r0 = 0
            goto L7c
        L7b:
            r0 = 1
        L7c:
            if (r0 != 0) goto L9c
            java.util.List r13 = r12.m3333h(r13, r14)     // Catch: java.io.IOException -> L83
            goto Lbc
        L83:
            r15 = move-exception
            java.lang.String r0 = "Failed to reload existing extracted secondary dex files, falling back to fresh extraction"
            android.util.Log.w(r1, r0, r15)
            java.util.List r15 = r12.m3334i()
            java.io.File r0 = r12.f4887b
            long r4 = m3329c(r0)
            long r6 = r12.f4888c
            r2 = r13
            r3 = r14
            r8 = r15
            m3331j(r2, r3, r4, r6, r8)
            goto Lbb
        L9c:
            if (r15 == 0) goto La4
            java.lang.String r15 = "Forced extraction must be performed."
            android.util.Log.i(r1, r15)
            goto La9
        La4:
            java.lang.String r15 = "Detected that extraction must be performed."
            android.util.Log.i(r1, r15)
        La9:
            java.util.List r15 = r12.m3334i()
            java.io.File r0 = r12.f4887b
            long r4 = m3329c(r0)
            long r6 = r12.f4888c
            r2 = r13
            r3 = r14
            r8 = r15
            m3331j(r2, r3, r4, r6, r8)
        Lbb:
            r13 = r15
        Lbc:
            java.lang.String r14 = "load found "
            java.lang.StringBuilder r14 = p000a.C0000a.m24u(r14)
            int r15 = r13.size()
            r14.append(r15)
            java.lang.String r15 = " secondary dex files"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            android.util.Log.i(r1, r14)
            return r13
        Ld6:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "MultiDexExtractor was closed"
            r13.<init>(r14)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.multidex.MultiDexExtractor.m3332g(android.content.Context, java.lang.String, boolean):java.util.List");
    }

    /* renamed from: h */
    public final List<ExtractedDex> m3333h(Context context, String str) throws IOException {
        Log.i("MultiDex", "loading existing secondary dex files");
        String str2 = this.f4887b.getName() + ".classes";
        SharedPreferences sharedPreferences = context.getSharedPreferences("multidex.version", 4);
        int i2 = sharedPreferences.getInt(str + "dex.number", 1);
        ArrayList arrayList = new ArrayList(i2 + (-1));
        int i3 = 2;
        while (i3 <= i2) {
            ExtractedDex extractedDex = new ExtractedDex(this.f4889d, C0000a.m8e(str2, i3, ".zip"));
            if (!extractedDex.isFile()) {
                StringBuilder m24u = C0000a.m24u("Missing extracted secondary dex file '");
                m24u.append(extractedDex.getPath());
                m24u.append("'");
                throw new IOException(m24u.toString());
            }
            extractedDex.f4893b = m3330e(extractedDex);
            long j2 = sharedPreferences.getLong(str + "dex.crc." + i3, -1L);
            long j3 = sharedPreferences.getLong(str + "dex.time." + i3, -1L);
            long lastModified = extractedDex.lastModified();
            if (j3 == lastModified) {
                String str3 = str2;
                SharedPreferences sharedPreferences2 = sharedPreferences;
                if (j2 == extractedDex.f4893b) {
                    arrayList.add(extractedDex);
                    i3++;
                    sharedPreferences = sharedPreferences2;
                    str2 = str3;
                }
            }
            throw new IOException("Invalid extracted dex: " + extractedDex + " (key \"" + str + "\"), expected modification time: " + j3 + ", modification time: " + lastModified + ", expected crc: " + j2 + ", file crc: " + extractedDex.f4893b);
        }
        return arrayList;
    }

    /* renamed from: i */
    public final List<ExtractedDex> m3334i() throws IOException {
        String str = this.f4887b.getName() + ".classes";
        File[] listFiles = this.f4889d.listFiles(new FileFilter(this) { // from class: androidx.multidex.MultiDexExtractor.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                return !file.getName().equals("MultiDex.lock");
            }
        });
        if (listFiles == null) {
            StringBuilder m24u = C0000a.m24u("Failed to list secondary dex dir content (");
            m24u.append(this.f4889d.getPath());
            m24u.append(").");
            Log.w("MultiDex", m24u.toString());
        } else {
            for (File file : listFiles) {
                StringBuilder m24u2 = C0000a.m24u("Trying to delete old file ");
                m24u2.append(file.getPath());
                m24u2.append(" of size ");
                m24u2.append(file.length());
                Log.i("MultiDex", m24u2.toString());
                if (file.delete()) {
                    StringBuilder m24u3 = C0000a.m24u("Deleted old file ");
                    m24u3.append(file.getPath());
                    Log.i("MultiDex", m24u3.toString());
                } else {
                    StringBuilder m24u4 = C0000a.m24u("Failed to delete old file ");
                    m24u4.append(file.getPath());
                    Log.w("MultiDex", m24u4.toString());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        ZipFile zipFile = new ZipFile(this.f4887b);
        int i2 = 2;
        try {
            ZipEntry entry = zipFile.getEntry("classes2.dex");
            while (entry != null) {
                ExtractedDex extractedDex = new ExtractedDex(this.f4889d, str + i2 + ".zip");
                arrayList.add(extractedDex);
                Log.i("MultiDex", "Extraction is needed for file " + extractedDex);
                int i3 = 0;
                boolean z = false;
                while (i3 < 3 && !z) {
                    i3++;
                    m3328b(zipFile, entry, extractedDex, str);
                    try {
                        extractedDex.f4893b = m3330e(extractedDex);
                        z = true;
                    } catch (IOException e2) {
                        Log.w("MultiDex", "Failed to read crc from " + extractedDex.getAbsolutePath(), e2);
                        z = false;
                    }
                    StringBuilder sb = new StringBuilder();
                    sb.append("Extraction ");
                    sb.append(z ? "succeeded" : "failed");
                    sb.append(" '");
                    sb.append(extractedDex.getAbsolutePath());
                    sb.append("': length ");
                    sb.append(extractedDex.length());
                    sb.append(" - crc: ");
                    sb.append(extractedDex.f4893b);
                    Log.i("MultiDex", sb.toString());
                    if (!z) {
                        extractedDex.delete();
                        if (extractedDex.exists()) {
                            Log.w("MultiDex", "Failed to delete corrupted secondary dex '" + extractedDex.getPath() + "'");
                        }
                    }
                }
                if (!z) {
                    throw new IOException("Could not create zip file " + extractedDex.getAbsolutePath() + " for secondary dex (" + i2 + ")");
                }
                i2++;
                entry = zipFile.getEntry("classes" + i2 + ".dex");
            }
            return arrayList;
        } finally {
            try {
                zipFile.close();
            } catch (IOException e3) {
                Log.w("MultiDex", "Failed to close resource", e3);
            }
        }
    }
}
