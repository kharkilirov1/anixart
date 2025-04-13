package com.google.android.play.core.assetpacks;

import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.Objects;
import java.util.Properties;

/* compiled from: com.google.android.play:core@@1.10.2 */
/* loaded from: classes.dex */
final class zzen {

    /* renamed from: h */
    public static final com.google.android.play.core.internal.zzag f20030h = new com.google.android.play.core.internal.zzag("SliceMetadataManager");

    /* renamed from: b */
    public final zzbh f20032b;

    /* renamed from: c */
    public final String f20033c;

    /* renamed from: d */
    public final int f20034d;

    /* renamed from: e */
    public final long f20035e;

    /* renamed from: f */
    public final String f20036f;

    /* renamed from: a */
    public final byte[] f20031a = new byte[RecyclerView.ViewHolder.FLAG_BOUNCED_FROM_HIDDEN_LIST];

    /* renamed from: g */
    public int f20037g = -1;

    public zzen(zzbh zzbhVar, String str, int i2, long j2, String str2) {
        this.f20032b = zzbhVar;
        this.f20033c = str;
        this.f20034d = i2;
        this.f20035e = j2;
        this.f20036f = str2;
    }

    /* renamed from: a */
    public final int m10800a() throws IOException {
        File m10742s = this.f20032b.m10742s(this.f20033c, this.f20034d, this.f20035e, this.f20036f);
        if (!m10742s.exists()) {
            return 0;
        }
        FileInputStream fileInputStream = new FileInputStream(m10742s);
        try {
            Properties properties = new Properties();
            properties.load(fileInputStream);
            fileInputStream.close();
            if (Integer.parseInt(properties.getProperty("fileStatus", "-1")) == 4) {
                return -1;
            }
            if (properties.getProperty("previousChunk") != null) {
                return Integer.parseInt(properties.getProperty("previousChunk")) + 1;
            }
            throw new zzck("Slice checkpoint file corrupt.");
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: b */
    public final zzem m10801b() throws IOException {
        File m10742s = this.f20032b.m10742s(this.f20033c, this.f20034d, this.f20035e, this.f20036f);
        if (!m10742s.exists()) {
            throw new zzck("Slice checkpoint file does not exist.");
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream = new FileInputStream(m10742s);
        try {
            properties.load(fileInputStream);
            fileInputStream.close();
            if (properties.getProperty("fileStatus") == null || properties.getProperty("previousChunk") == null) {
                throw new zzck("Slice checkpoint file corrupt.");
            }
            try {
                int parseInt = Integer.parseInt(properties.getProperty("fileStatus"));
                String property = properties.getProperty("fileName");
                long parseLong = Long.parseLong(properties.getProperty("fileOffset", "-1"));
                long parseLong2 = Long.parseLong(properties.getProperty("remainingBytes", "-1"));
                int parseInt2 = Integer.parseInt(properties.getProperty("previousChunk"));
                this.f20037g = Integer.parseInt(properties.getProperty("metadataFileCounter", "0"));
                return new zzbp(parseInt, property, parseLong, parseLong2, parseInt2);
            } catch (NumberFormatException e2) {
                throw new zzck("Slice checkpoint file corrupt.", e2);
            }
        } catch (Throwable th) {
            try {
                fileInputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: c */
    public final File m10802c() {
        return new File(m10811l(), String.format("%s-NAM.dat", Integer.valueOf(this.f20037g)));
    }

    /* renamed from: d */
    public final void m10803d(long j2, byte[] bArr, int i2, int i3) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(m10802c(), "rw");
        try {
            randomAccessFile.seek(j2);
            randomAccessFile.write(bArr, i2, i3);
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                randomAccessFile.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: e */
    public final void m10804e(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "3");
        properties.put("fileOffset", String.valueOf(m10802c().length()));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f20037g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10812m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: f */
    public final void m10805f(String str, long j2, long j3, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "1");
        properties.put("fileName", str);
        properties.put("fileOffset", String.valueOf(j2));
        properties.put("remainingBytes", String.valueOf(j3));
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f20037g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10812m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: g */
    public final void m10806g(byte[] bArr, int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "2");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f20037g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10812m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
            zzbh zzbhVar = this.f20032b;
            String str = this.f20033c;
            int i3 = this.f20034d;
            long j2 = this.f20035e;
            String str2 = this.f20036f;
            Objects.requireNonNull(zzbhVar);
            File file = new File(zzbhVar.m10743t(str, i3, j2, str2), "checkpoint_ext.dat");
            if (file.exists()) {
                file.delete();
            }
            fileOutputStream = new FileOutputStream(file);
            try {
                fileOutputStream.write(bArr);
            } finally {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
            }
        } finally {
        }
    }

    /* renamed from: h */
    public final void m10807h(int i2) throws IOException {
        Properties properties = new Properties();
        properties.put("fileStatus", "4");
        properties.put("previousChunk", String.valueOf(i2));
        properties.put("metadataFileCounter", String.valueOf(this.f20037g));
        FileOutputStream fileOutputStream = new FileOutputStream(m10812m());
        try {
            properties.store(fileOutputStream, (String) null);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: i */
    public final void m10808i(byte[] bArr) throws IOException {
        this.f20037g++;
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(m10811l(), String.format("%s-LFH.dat", Integer.valueOf(this.f20037g))));
            try {
                fileOutputStream.write(bArr);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable unused) {
                }
                throw th;
            }
        } catch (IOException e2) {
            throw new zzck("Could not write metadata file.", e2);
        }
    }

    /* renamed from: j */
    public final void m10809j(byte[] bArr, InputStream inputStream) throws IOException {
        this.f20037g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m10802c());
        try {
            fileOutputStream.write(bArr);
            int read = inputStream.read(this.f20031a);
            while (read > 0) {
                fileOutputStream.write(this.f20031a, 0, read);
                read = inputStream.read(this.f20031a);
            }
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: k */
    public final void m10810k(byte[] bArr, int i2, int i3) throws IOException {
        this.f20037g++;
        FileOutputStream fileOutputStream = new FileOutputStream(m10802c());
        try {
            fileOutputStream.write(bArr, 0, i3);
            fileOutputStream.close();
        } catch (Throwable th) {
            try {
                fileOutputStream.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    /* renamed from: l */
    public final File m10811l() {
        File m10743t = this.f20032b.m10743t(this.f20033c, this.f20034d, this.f20035e, this.f20036f);
        if (!m10743t.exists()) {
            m10743t.mkdirs();
        }
        return m10743t;
    }

    /* renamed from: m */
    public final File m10812m() throws IOException {
        File m10742s = this.f20032b.m10742s(this.f20033c, this.f20034d, this.f20035e, this.f20036f);
        m10742s.getParentFile().mkdirs();
        m10742s.createNewFile();
        return m10742s;
    }
}
