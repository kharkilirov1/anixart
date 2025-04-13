package com.yandex.mobile.ads.impl;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.yandex.mobile.ads.embedded.guava.collect.AbstractC4702r;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.yandex.mobile.ads.impl.ng */
/* loaded from: classes3.dex */
final class C5493ng {

    /* renamed from: a */
    private final HashMap<String, C5442mg> f52967a = new HashMap<>();

    /* renamed from: b */
    private final SparseArray<String> f52968b = new SparseArray<>();

    /* renamed from: c */
    private final SparseBooleanArray f52969c = new SparseBooleanArray();

    /* renamed from: d */
    private final SparseBooleanArray f52970d = new SparseBooleanArray();

    /* renamed from: e */
    private c f52971e;

    /* renamed from: f */
    @Nullable
    private c f52972f;

    /* renamed from: com.yandex.mobile.ads.impl.ng$b */
    public static class b implements c {

        /* renamed from: a */
        private final boolean f52978a = false;

        /* renamed from: b */
        @Nullable
        private final Cipher f52979b = null;

        /* renamed from: c */
        @Nullable
        private final SecretKeySpec f52980c = null;

        /* renamed from: d */
        @Nullable
        private final SecureRandom f52981d = null;

        /* renamed from: e */
        private final C5433mb f52982e;

        /* renamed from: f */
        private boolean f52983f;

        /* renamed from: g */
        @Nullable
        private gx0 f52984g;

        public b(File file) {
            this.f52982e = new C5433mb(file);
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26895a(long j2) {
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final boolean mo26900a() {
            return this.f52982e.m26603b();
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: b */
        public final void mo26901b() {
            this.f52982e.m26601a();
        }

        /* renamed from: b */
        private boolean m26904b(HashMap<String, C5442mg> hashMap, SparseArray<String> sparseArray) {
            BufferedInputStream bufferedInputStream;
            DataInputStream dataInputStream;
            int hashCode;
            if (!this.f52982e.m26603b()) {
                return true;
            }
            DataInputStream dataInputStream2 = null;
            try {
                bufferedInputStream = new BufferedInputStream(this.f52982e.m26604c());
                dataInputStream = new DataInputStream(bufferedInputStream);
            } catch (IOException unused) {
            } catch (Throwable th) {
                th = th;
            }
            try {
                int readInt = dataInputStream.readInt();
                if (readInt >= 0 && readInt <= 2) {
                    if ((dataInputStream.readInt() & 1) != 0) {
                        if (this.f52979b == null) {
                            s91.m28107a((Closeable) dataInputStream);
                            return false;
                        }
                        byte[] bArr = new byte[16];
                        dataInputStream.readFully(bArr);
                        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr);
                        try {
                            Cipher cipher = this.f52979b;
                            SecretKeySpec secretKeySpec = this.f52980c;
                            int i2 = s91.f54530a;
                            cipher.init(2, secretKeySpec, ivParameterSpec);
                            dataInputStream = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f52979b));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else if (this.f52978a) {
                        this.f52983f = true;
                    }
                    int readInt2 = dataInputStream.readInt();
                    int i3 = 0;
                    for (int i4 = 0; i4 < readInt2; i4++) {
                        C5442mg m26903a = m26903a(readInt, dataInputStream);
                        hashMap.put(m26903a.f52679b, m26903a);
                        sparseArray.put(m26903a.f52678a, m26903a.f52679b);
                        int hashCode2 = m26903a.f52679b.hashCode() + (m26903a.f52678a * 31);
                        if (readInt < 2) {
                            long m26171b = m26903a.m26660a().m26171b();
                            hashCode = (hashCode2 * 31) + ((int) (m26171b ^ (m26171b >>> 32)));
                        } else {
                            hashCode = (hashCode2 * 31) + m26903a.m26660a().hashCode();
                        }
                        i3 += hashCode;
                    }
                    int readInt3 = dataInputStream.readInt();
                    boolean z = dataInputStream.read() == -1;
                    if (readInt3 == i3 && z) {
                        s91.m28107a((Closeable) dataInputStream);
                        return true;
                    }
                    s91.m28107a((Closeable) dataInputStream);
                    return false;
                }
                s91.m28107a((Closeable) dataInputStream);
                return false;
            } catch (IOException unused2) {
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    s91.m28107a((Closeable) dataInputStream2);
                }
                return false;
            } catch (Throwable th2) {
                th = th2;
                dataInputStream2 = dataInputStream;
                if (dataInputStream2 != null) {
                    s91.m28107a((Closeable) dataInputStream2);
                }
                throw th;
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26899a(HashMap<String, C5442mg> hashMap, SparseArray<String> sparseArray) {
            C5220ia.m25476b(!this.f52983f);
            if (m26904b(hashMap, sparseArray)) {
                return;
            }
            hashMap.clear();
            sparseArray.clear();
            this.f52982e.m26601a();
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26898a(HashMap<String, C5442mg> hashMap) throws IOException {
            if (this.f52983f) {
                mo26902b(hashMap);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26896a(C5442mg c5442mg) {
            this.f52983f = true;
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26897a(C5442mg c5442mg, boolean z) {
            this.f52983f = true;
        }

        /* renamed from: a */
        private static C5442mg m26903a(int i2, DataInputStream dataInputStream) throws IOException {
            C5349kn m26885a;
            int readInt = dataInputStream.readInt();
            String readUTF = dataInputStream.readUTF();
            if (i2 < 2) {
                long readLong = dataInputStream.readLong();
                C5643qk c5643qk = new C5643qk();
                C5643qk.m27743a(c5643qk, readLong);
                m26885a = C5349kn.f52038c.m26169a(c5643qk);
            } else {
                m26885a = C5493ng.m26885a(dataInputStream);
            }
            return new C5442mg(readInt, readUTF, m26885a);
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: b */
        public final void mo26902b(HashMap<String, C5442mg> hashMap) throws IOException {
            DataOutputStream dataOutputStream;
            DataOutputStream dataOutputStream2 = null;
            try {
                OutputStream m26605d = this.f52982e.m26605d();
                gx0 gx0Var = this.f52984g;
                if (gx0Var == null) {
                    this.f52984g = new gx0(m26605d);
                } else {
                    gx0Var.m24994a(m26605d);
                }
                gx0 gx0Var2 = this.f52984g;
                dataOutputStream = new DataOutputStream(gx0Var2);
                try {
                    dataOutputStream.writeInt(2);
                    dataOutputStream.writeInt(this.f52978a ? 1 : 0);
                    if (this.f52978a) {
                        byte[] bArr = new byte[16];
                        SecureRandom secureRandom = this.f52981d;
                        int i2 = s91.f54530a;
                        secureRandom.nextBytes(bArr);
                        dataOutputStream.write(bArr);
                        try {
                            this.f52979b.init(1, this.f52980c, new IvParameterSpec(bArr));
                            dataOutputStream.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(gx0Var2, this.f52979b));
                        } catch (InvalidAlgorithmParameterException e2) {
                            e = e2;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e3) {
                            e = e3;
                            throw new IllegalStateException(e);
                        }
                    } else {
                        dataOutputStream2 = dataOutputStream;
                    }
                    dataOutputStream2.writeInt(hashMap.size());
                    int i3 = 0;
                    for (C5442mg c5442mg : hashMap.values()) {
                        dataOutputStream2.writeInt(c5442mg.f52678a);
                        dataOutputStream2.writeUTF(c5442mg.f52679b);
                        Set<Map.Entry<String, byte[]>> m26170a = c5442mg.m26660a().m26170a();
                        dataOutputStream2.writeInt(m26170a.size());
                        for (Map.Entry<String, byte[]> entry : m26170a) {
                            dataOutputStream2.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream2.writeInt(value.length);
                            dataOutputStream2.write(value);
                        }
                        i3 += c5442mg.m26660a().hashCode() + ((c5442mg.f52679b.hashCode() + (c5442mg.f52678a * 31)) * 31);
                    }
                    dataOutputStream2.writeInt(i3);
                    this.f52982e.m26602a(dataOutputStream2);
                    int i4 = s91.f54530a;
                    this.f52983f = false;
                } catch (Throwable th) {
                    th = th;
                    s91.m28107a((Closeable) dataOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                dataOutputStream = dataOutputStream2;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.ng$c */
    public interface c {
        /* renamed from: a */
        void mo26895a(long j2);

        /* renamed from: a */
        void mo26896a(C5442mg c5442mg);

        /* renamed from: a */
        void mo26897a(C5442mg c5442mg, boolean z);

        /* renamed from: a */
        void mo26898a(HashMap<String, C5442mg> hashMap) throws Throwable;

        /* renamed from: a */
        void mo26899a(HashMap<String, C5442mg> hashMap, SparseArray<String> sparseArray) throws Throwable;

        /* renamed from: a */
        boolean mo26900a() throws Throwable;

        /* renamed from: b */
        void mo26901b() throws Throwable;

        /* renamed from: b */
        void mo26902b(HashMap<String, C5442mg> hashMap) throws Throwable;
    }

    public C5493ng(@Nullable C4986ds c4986ds, @Nullable File file) {
        a aVar = new a(c4986ds);
        b bVar = new b(new File(file, "yandex_cached_content_index.exi"));
        this.f52971e = aVar;
        this.f52972f = bVar;
    }

    @WorkerThread
    /* renamed from: a */
    public final void m26889a(long j2) throws Throwable {
        c cVar;
        this.f52971e.mo26895a(j2);
        c cVar2 = this.f52972f;
        if (cVar2 != null) {
            cVar2.mo26895a(j2);
        }
        if (this.f52971e.mo26900a() || (cVar = this.f52972f) == null || !cVar.mo26900a()) {
            this.f52971e.mo26899a(this.f52967a, this.f52968b);
        } else {
            this.f52972f.mo26899a(this.f52967a, this.f52968b);
            this.f52971e.mo26902b(this.f52967a);
        }
        c cVar3 = this.f52972f;
        if (cVar3 != null) {
            cVar3.mo26901b();
            this.f52972f = null;
        }
    }

    /* renamed from: b */
    public final C5442mg m26891b(String str) {
        C5442mg c5442mg = this.f52967a.get(str);
        if (c5442mg != null) {
            return c5442mg;
        }
        SparseArray<String> sparseArray = this.f52968b;
        int size = sparseArray.size();
        int i2 = 0;
        int keyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (keyAt < 0) {
            while (i2 < size && i2 == sparseArray.keyAt(i2)) {
                i2++;
            }
            keyAt = i2;
        }
        C5442mg c5442mg2 = new C5442mg(keyAt, str, C5349kn.f52038c);
        this.f52967a.put(str, c5442mg2);
        this.f52968b.put(keyAt, str);
        this.f52970d.put(keyAt, true);
        this.f52971e.mo26896a(c5442mg2);
        return c5442mg2;
    }

    @WorkerThread
    /* renamed from: c */
    public final void m26893c() throws Throwable {
        this.f52971e.mo26898a(this.f52967a);
        int size = this.f52969c.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f52968b.remove(this.f52969c.keyAt(i2));
        }
        this.f52969c.clear();
        this.f52970d.clear();
    }

    /* renamed from: com.yandex.mobile.ads.impl.ng$a */
    public static final class a implements c {

        /* renamed from: e */
        private static final String[] f52973e = {"id", "key", "metadata"};

        /* renamed from: a */
        private final InterfaceC5292jm f52974a;

        /* renamed from: b */
        private final SparseArray<C5442mg> f52975b = new SparseArray<>();

        /* renamed from: c */
        private String f52976c;

        /* renamed from: d */
        private String f52977d;

        public a(C4986ds c4986ds) {
            this.f52974a = c4986ds;
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26895a(long j2) {
            String hexString = Long.toHexString(j2);
            this.f52976c = hexString;
            this.f52977d = um1.m29049a("ExoPlayerCacheIndex", hexString);
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: b */
        public final void mo26901b() throws Throwable {
            InterfaceC5292jm interfaceC5292jm = this.f52974a;
            String str = this.f52976c;
            Objects.requireNonNull(str);
            try {
                String str2 = "ExoPlayerCacheIndex" + str;
                SQLiteDatabase writableDatabase = interfaceC5292jm.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    mb1.m26608a(writableDatabase, str);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new C5239im(e2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final boolean mo26900a() throws Throwable {
            SQLiteDatabase readableDatabase = this.f52974a.getReadableDatabase();
            String str = this.f52976c;
            Objects.requireNonNull(str);
            return mb1.m26606a(readableDatabase, 1, str) != -1;
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26899a(HashMap<String, C5442mg> hashMap, SparseArray<String> sparseArray) throws Throwable {
            C5220ia.m25476b(this.f52975b.size() == 0);
            try {
                SQLiteDatabase readableDatabase = this.f52974a.getReadableDatabase();
                String str = this.f52976c;
                Objects.requireNonNull(str);
                if (mb1.m26606a(readableDatabase, 1, str) != 1) {
                    SQLiteDatabase writableDatabase = this.f52974a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        String str2 = this.f52976c;
                        Objects.requireNonNull(str2);
                        mb1.m26607a(writableDatabase, 1, str2, 1);
                        String str3 = this.f52977d;
                        Objects.requireNonNull(str3);
                        writableDatabase.execSQL("DROP TABLE IF EXISTS " + str3);
                        writableDatabase.execSQL("CREATE TABLE " + this.f52977d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th) {
                        writableDatabase.endTransaction();
                        throw th;
                    }
                }
                SQLiteDatabase readableDatabase2 = this.f52974a.getReadableDatabase();
                String str4 = this.f52977d;
                Objects.requireNonNull(str4);
                Cursor query = readableDatabase2.query(str4, f52973e, null, null, null, null, null);
                while (query.moveToNext()) {
                    try {
                        int i2 = query.getInt(0);
                        String string = query.getString(1);
                        Objects.requireNonNull(string);
                        hashMap.put(string, new C5442mg(i2, string, C5493ng.m26885a(new DataInputStream(new ByteArrayInputStream(query.getBlob(2))))));
                        sparseArray.put(i2, string);
                    } finally {
                    }
                }
                query.close();
            } catch (SQLiteException e2) {
                hashMap.clear();
                sparseArray.clear();
                throw new C5239im(e2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: b */
        public final void mo26902b(HashMap<String, C5442mg> hashMap) throws Throwable {
            try {
                SQLiteDatabase writableDatabase = this.f52974a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    String str = this.f52976c;
                    Objects.requireNonNull(str);
                    mb1.m26607a(writableDatabase, 1, str, 1);
                    String str2 = this.f52977d;
                    Objects.requireNonNull(str2);
                    writableDatabase.execSQL("DROP TABLE IF EXISTS " + str2);
                    writableDatabase.execSQL("CREATE TABLE " + this.f52977d + " (id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)");
                    for (C5442mg c5442mg : hashMap.values()) {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        C5349kn m26660a = c5442mg.m26660a();
                        DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                        Set<Map.Entry<String, byte[]>> m26170a = m26660a.m26170a();
                        dataOutputStream.writeInt(m26170a.size());
                        for (Map.Entry<String, byte[]> entry : m26170a) {
                            dataOutputStream.writeUTF(entry.getKey());
                            byte[] value = entry.getValue();
                            dataOutputStream.writeInt(value.length);
                            dataOutputStream.write(value);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        ContentValues contentValues = new ContentValues();
                        contentValues.put("id", Integer.valueOf(c5442mg.f52678a));
                        contentValues.put("key", c5442mg.f52679b);
                        contentValues.put("metadata", byteArray);
                        String str3 = this.f52977d;
                        Objects.requireNonNull(str3);
                        writableDatabase.replaceOrThrow(str3, null, contentValues);
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f52975b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e2) {
                throw new C5239im(e2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26898a(HashMap<String, C5442mg> hashMap) throws Throwable {
            if (this.f52975b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f52974a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i2 = 0; i2 < this.f52975b.size(); i2++) {
                    try {
                        C5442mg valueAt = this.f52975b.valueAt(i2);
                        if (valueAt == null) {
                            int keyAt = this.f52975b.keyAt(i2);
                            String str = this.f52977d;
                            Objects.requireNonNull(str);
                            writableDatabase.delete(str, "id = ?", new String[]{Integer.toString(keyAt)});
                        } else {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            C5349kn m26660a = valueAt.m26660a();
                            DataOutputStream dataOutputStream = new DataOutputStream(byteArrayOutputStream);
                            Set<Map.Entry<String, byte[]>> m26170a = m26660a.m26170a();
                            dataOutputStream.writeInt(m26170a.size());
                            for (Map.Entry<String, byte[]> entry : m26170a) {
                                dataOutputStream.writeUTF(entry.getKey());
                                byte[] value = entry.getValue();
                                dataOutputStream.writeInt(value.length);
                                dataOutputStream.write(value);
                            }
                            byte[] byteArray = byteArrayOutputStream.toByteArray();
                            ContentValues contentValues = new ContentValues();
                            contentValues.put("id", Integer.valueOf(valueAt.f52678a));
                            contentValues.put("key", valueAt.f52679b);
                            contentValues.put("metadata", byteArray);
                            String str2 = this.f52977d;
                            Objects.requireNonNull(str2);
                            writableDatabase.replaceOrThrow(str2, null, contentValues);
                        }
                    } finally {
                        writableDatabase.endTransaction();
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f52975b.clear();
            } catch (SQLException e2) {
                throw new C5239im(e2);
            }
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26896a(C5442mg c5442mg) {
            this.f52975b.put(c5442mg.f52678a, c5442mg);
        }

        @Override // com.yandex.mobile.ads.impl.C5493ng.c
        /* renamed from: a */
        public final void mo26897a(C5442mg c5442mg, boolean z) {
            if (z) {
                this.f52975b.delete(c5442mg.f52678a);
            } else {
                this.f52975b.put(c5442mg.f52678a, null);
            }
        }
    }

    /* renamed from: c */
    public final void m26894c(String str) {
        C5442mg c5442mg = this.f52967a.get(str);
        if (c5442mg != null && c5442mg.m26667c() && c5442mg.m26669d()) {
            this.f52967a.remove(str);
            int i2 = c5442mg.f52678a;
            boolean z = this.f52970d.get(i2);
            this.f52971e.mo26897a(c5442mg, z);
            if (z) {
                this.f52968b.remove(i2);
                this.f52970d.delete(i2);
            } else {
                this.f52968b.put(i2, null);
                this.f52969c.put(i2, true);
            }
        }
    }

    @Nullable
    /* renamed from: a */
    public final C5442mg m26886a(String str) {
        return this.f52967a.get(str);
    }

    /* renamed from: a */
    public final Collection<C5442mg> m26888a() {
        return Collections.unmodifiableCollection(this.f52967a.values());
    }

    /* renamed from: b */
    public final void m26892b() {
        Iterator it = AbstractC4702r.m22073a(this.f52967a.keySet()).iterator();
        while (it.hasNext()) {
            m26894c((String) it.next());
        }
    }

    @Nullable
    /* renamed from: a */
    public final String m26887a(int i2) {
        return this.f52968b.get(i2);
    }

    /* renamed from: a */
    public final void m26890a(String str, C5643qk c5643qk) {
        C5442mg m26891b = m26891b(str);
        if (m26891b.m26664a(c5643qk)) {
            this.f52971e.mo26896a(m26891b);
        }
    }

    /* renamed from: a */
    public static C5349kn m26885a(DataInputStream dataInputStream) throws IOException {
        int readInt = dataInputStream.readInt();
        HashMap hashMap = new HashMap();
        for (int i2 = 0; i2 < readInt; i2++) {
            String readUTF = dataInputStream.readUTF();
            int readInt2 = dataInputStream.readInt();
            if (readInt2 >= 0) {
                int min = Math.min(readInt2, 10485760);
                byte[] bArr = s91.f54535f;
                int i3 = 0;
                while (i3 != readInt2) {
                    int i4 = i3 + min;
                    bArr = Arrays.copyOf(bArr, i4);
                    dataInputStream.readFully(bArr, i3, min);
                    min = Math.min(readInt2 - i4, 10485760);
                    i3 = i4;
                }
                hashMap.put(readUTF, bArr);
            } else {
                throw new IOException(k60.m26036a("Invalid value size: ", readInt2));
            }
        }
        return new C5349kn(hashMap);
    }
}
